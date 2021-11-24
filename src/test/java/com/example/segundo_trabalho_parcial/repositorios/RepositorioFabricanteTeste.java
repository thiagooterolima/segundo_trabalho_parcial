package com.example.segundo_trabalho_parcial.repositorios;

import com.example.segundo_trabalho_parcial.Entidades.Fabricante;
import com.example.segundo_trabalho_parcial.Repositorio.RepositorioFabricante;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;
import java.util.Optional;

@SpringBootTest
public class RepositorioFabricanteTeste {
    @Autowired
    private RepositorioFabricante repositorioFabricante;


    @Test
    public void buscarTudo(){
        List<Fabricante> cnpjs = repositorioFabricante.findAll();
        Assertions.assertTrue(cnpjs.size() >0);

    }


    @Test
    public void inserir() {

        Fabricante fabricante = new Fabricante();
        fabricante.setID(Integer.valueOf("3"));
        fabricante.setCodigo(345678912);
        fabricante.setNome("Eletrolux");

        Fabricante retorno = repositorioFabricante.save(fabricante);

        Assertions.assertNotNull(retorno);

    }

    @Test
    public void editar(){
        Fabricante fabricante = new Fabricante();
        fabricante.setID(Integer.valueOf("3"));
        fabricante.setCodigo(123456798);
        fabricante.setNome("Mondial");


        Fabricante retorno =repositorioFabricante.save(fabricante);
        Assertions.assertNotNull(retorno);

    }

    @Test
    public void excluir(){
        Integer ID  =  2;

        repositorioFabricante.deleteById(ID);

        Optional<Fabricante> opcional = repositorioFabricante.findById(ID);

        Assertions.assertTrue(opcional.isEmpty());
    }


}
