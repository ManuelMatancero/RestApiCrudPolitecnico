package com.matancita.apicrud.repositories;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.matancita.apicrud.models.ProfesorModel;

@Repository
public interface ProfesorRepository extends CrudRepository<ProfesorModel, Long>  {
	public abstract ArrayList<ProfesorModel> findByNombre(String nombre);
}
