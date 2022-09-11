package com.matancita.apicrud.controllers;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import com.matancita.apicrud.models.ProfesorModel;
import com.matancita.apicrud.services.ProfesorService;

@RestController
@RequestMapping("/profesor")
public class ProfesorController {
    
    @Autowired
    ProfesorService profesorService;

    @GetMapping()
    public ArrayList<ProfesorModel> obtenerProfesores(){
        return profesorService.obtenerProfesores();
    }

    @PostMapping
    public ProfesorModel guardarProfesor(@RequestBody ProfesorModel profesor){
        return this.profesorService.guardarProfesor(profesor);
    }
    
    @GetMapping(path = "/{id}")
    public Optional<ProfesorModel> obtenerProfesorPorId(@PathVariable("id") Long id){
    	return this.profesorService.obtenerPorId(id);
    }
    
    @GetMapping("/query")
    public ArrayList<ProfesorModel> obtenerProfesorPorNombre(@RequestParam("nombre") String nombre){
    	return this.profesorService.obtenerPorNombre(nombre);
    }
    
    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id) {
    	boolean ok = this.profesorService.eliminarProfesor(id);
    	if(ok) {
    		return "Se elimino el profesor con id " + id;
    	}else {
    		return "No pudo eliminar el profesor con id " + id;
    	}
    }
    
    
}
