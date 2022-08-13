package com.demo.Services;

import com.demo.Entities.CatEntity;
import com.demo.Repositories.CatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

/**
 * Servicio que utiliza la interfaz catRepository
 * @author Alexis Ramos Cajo
 * @version 28/07/2022
 */
@Service
public class CatServices {
    @Autowired
CatRepository catRepository;

    /**
     * Metodo publico  que lista todos los objetos catEntity
     * @return retorna una lista de todos los objetos catEntity
     */
    public ArrayList<CatEntity> ListarCat()
{
    return (ArrayList<CatEntity>) catRepository.findAll();
}

    /**
     * Metodo publico que busca por raza
     * @param raza parametro de tipo String para la busqueda
     * @return todos los objetos de la clase catEntity que coinsidan con la raza
     */
    public ArrayList<CatEntity>buscarRaza(String raza)
{
    return (ArrayList<CatEntity>) catRepository.findByraza(raza);
}
}
