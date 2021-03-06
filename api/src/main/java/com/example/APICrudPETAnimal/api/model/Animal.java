package com.example.APICrudPETAnimal.api.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Getter
@Setter
public class Animal {

    @Id
    @GeneratedValue
    private Long id;
    private String descricaoAnimal;
    private GrupoAnimais grupoAnimais;
    private ClasseAnimais classeAnimais;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescricaoAnimal() {
        return descricaoAnimal;
    }

    public void setDescricaoAnimal(String descricaoAnimal) {
        this.descricaoAnimal = descricaoAnimal;
    }

}
