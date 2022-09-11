package com.matancita.apicrud.models;

import javax.persistence.*;

@Entity
@Table(name="Aula")
public class AulaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    private Long id;

    private int cupo;
    private String ubicacion;

    public void setId(Long id){
        this.id =id;
    }

    public Long getId(){
        return this.id;
    }

    public void setCupo(int cupo){
        this.cupo =cupo;
    }
    public int getCupo(){
        return this.cupo;
    }

    public void setUbicacion(String ubicacion){
        this.ubicacion =ubicacion;
    }
    public String getUbicacion(){
        return this.ubicacion;
    }

    
}
