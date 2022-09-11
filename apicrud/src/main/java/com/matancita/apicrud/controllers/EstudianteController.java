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

import com.matancita.apicrud.models.EstudianteModel;
import com.matancita.apicrud.services.EstudianteService;

@RestController
@RequestMapping("/estudiante")
public class EstudianteController {

    @Autowired
    EstudianteService estudianteService;

    @GetMapping()
    public ArrayList<EstudianteModel> obtenerEstudiantes(){
        return estudianteService.obtenerEstudiantes();
    }

    @PostMapping
    public EstudianteModel guardarEstudiante(@RequestBody EstudianteModel estudiante){
        return this.estudianteService.guardarEstudiante(estudiante);
    }
    
    @GetMapping(path = "/{id}")
    public Optional<EstudianteModel> obtenerEstudiantePorId(@PathVariable("id") Long id){
    	return this.estudianteService.obtenerPorId(id);
    }
    
    @GetMapping("/query")
    public ArrayList<EstudianteModel> obtenerEstudiantePorNombre(@RequestParam("nombre") String nombre){
    	return this.estudianteService.obtenerPorNombre(nombre);
    }
    
    @DeleteMapping(path = "/{id}")
    public String eliminarPorId(@PathVariable("id") Long id) {
    	boolean ok = this.estudianteService.eliminarEstudiante(id);
    	if(ok) {
    		return "Se elimino el estudiante con id " + id;
    	}else {
    		return "No pudo eliminar el estudiante con id " + id;
    	}
    }
    
}
