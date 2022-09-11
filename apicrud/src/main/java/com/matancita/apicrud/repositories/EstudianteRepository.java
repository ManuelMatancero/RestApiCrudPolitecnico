package com.matancita.apicrud.repositories;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.matancita.apicrud.models.EstudianteModel;

@Repository
public interface EstudianteRepository extends CrudRepository<EstudianteModel, Long> {
	
	public abstract ArrayList<EstudianteModel> findByNombre(String nombre);
	
}
