package com.matancita.apicrud.services;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.matancita.apicrud.models.EstudianteModel;
import com.matancita.apicrud.repositories.EstudianteRepository;

@Service
public class EstudianteService {

    @Autowired
    EstudianteRepository estudianteRepository;

    public ArrayList<EstudianteModel> obtenerEstudiantes(){

        return (ArrayList<EstudianteModel>) estudianteRepository.findAll();
    }

    public EstudianteModel guardarEstudiante(EstudianteModel estudiante){
        return estudianteRepository.save(estudiante);
        
    }
    
    public Optional<EstudianteModel> obtenerPorId(Long id){
    	return estudianteRepository.findById(id);
    }
    
    public ArrayList<EstudianteModel> obtenerPorNombre(String nombre){
    	return estudianteRepository.findByNombre(nombre);
    }
    
    public boolean eliminarEstudiante(Long id) {
    	try {
    		estudianteRepository.deleteById(id);
    		return true;
    	}catch(Exception err) {
    		return false;
    	}
		
    }
    
}
