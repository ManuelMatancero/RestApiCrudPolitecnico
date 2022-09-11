package com.matancita.apicrud.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.matancita.apicrud.models.ProfesorModel;
import com.matancita.apicrud.repositories.ProfesorRepository;

@Service
public class ProfesorService {
   
    @Autowired
    ProfesorRepository profesorRepository;

    public ArrayList<ProfesorModel> obtenerProfesores(){

        return (ArrayList<ProfesorModel>) profesorRepository.findAll();
    }

    public ProfesorModel guardarProfesor(ProfesorModel profesor){
        return profesorRepository.save(profesor);
        
    } 
    
    public Optional<ProfesorModel> obtenerPorId(Long id){
    	return profesorRepository.findById(id);
    }
    
    public ArrayList<ProfesorModel> obtenerPorNombre(String nombre){
    	return profesorRepository.findByNombre(nombre);
    }
    
    public boolean eliminarProfesor(Long id) {
    	try {
    		profesorRepository.deleteById(id);
    		return true;
    	}catch(Exception err) {
    		return false;
    	}
		
    }
}
