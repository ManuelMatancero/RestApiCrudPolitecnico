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

import org.springframework.web.bind.annotation.RestController;

import com.matancita.apicrud.models.AulaModel;

import com.matancita.apicrud.services.AulaService;

@RestController
@RequestMapping("/aula")
public class AulaController {

    @Autowired
    AulaService aulaService;

    @GetMapping()
    public ArrayList<AulaModel> obtenerAulas(){
        return aulaService.obtenerAulas();
    }

    @PostMapping
    public AulaModel guardarAula(@RequestBody AulaModel aula){
        return this.aulaService.guardarAula(aula);
    }
    
    @GetMapping(path = "/{id}")
    public Optional<AulaModel> obtenerAulaPorId(@PathVariable("id") Long id){
    	return this.aulaService.obtenerPorId(id);
    }
    
    
    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id) {
    	boolean ok = this.aulaService.eliminarAula(id);
    	if(ok) {
    		return "Se elimino el usuario con id " + id;
    	}else {
    		return "No pudo eliminar el usuario con id " + id;
    	}
    }
    
}
