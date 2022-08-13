package com.demo.Controllers;

import com.demo.Entities.CatEntity;
import com.demo.Services.CatServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

/**
 * Esta clase es el controlador para Entity cat
 * @author :Alexis Ramos Cajo
 * @version :29/07/2022
 */
@RestController
@RequestMapping("/Cat")
public class CatController {
    //Instanciar la clase services
    @Autowired
    CatServices catServices;


    /**
     * Metodo que Lista todos los objetos CatEntity
     * @return La lista de (objetos CatEntity)que se encuentran en la base de datos
     */
    @GetMapping()
    public ArrayList<CatEntity>ListarCat()
    {
        return this.catServices.ListarCat();
    }//cierre del metodo

    /**
     * Metodo que busca los objetos por el parametro raza
     * @param raza nombre de la raza
     * @return La lista o el objeto catEntity
     */
    @GetMapping(path = "/BuscarRaza/{raza}")
    public ArrayList<CatEntity>obtenerRaza(@PathVariable("raza")String raza)
    {
        return this.catServices.buscarRaza(raza);
    }
}
