package com.example.segundo_trabalho_parcial.Entidades;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.Id;


@Getter
@Setter
@Entity

public class Fabricante {

    @Id
    private Integer ID;

    private Integer codigo;

    private String nome;

}
