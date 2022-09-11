package com.matancita.apicrud.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matancita.apicrud.models.AulaModel;

import com.matancita.apicrud.repositories.AulaRepository;

@Service
public class AulaService {
    @Autowired
    AulaRepository aulaRepository;

    public ArrayList<AulaModel> obtenerAulas(){

        return (ArrayList<AulaModel>) aulaRepository.findAll();
    }

    public AulaModel guardarAula(AulaModel aula){
        return aulaRepository.save(aula);
        
    }
    public Optional<AulaModel> obtenerPorId(Long id){
    	return aulaRepository.findById(id);
    }
    
    
    public boolean eliminarAula(Long id) {
    	try {
    		aulaRepository.deleteById(id);
    		return true;
    	}catch(Exception err) {
    		return false;
    	}
		
    }
    
}
