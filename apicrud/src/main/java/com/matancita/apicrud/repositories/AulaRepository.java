package com.matancita.apicrud.repositories;


import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.matancita.apicrud.models.AulaModel;
import com.matancita.apicrud.models.ProfesorModel;


@Repository
public interface AulaRepository extends CrudRepository<AulaModel, Long> {
	public abstract ArrayList<AulaModel> findById(int id);
}
