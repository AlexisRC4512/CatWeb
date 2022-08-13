package com.demo.Repositories;

import com.demo.Entities.CatEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * CatRepository es la interfaz que extiende de la clase CatEntity con JPA
 * @author Alexis Ramos Cajo
 * @version 28/07/2022
 *
 */


@Repository
public interface CatRepository extends JpaRepository<CatEntity,Integer> {
   /**
    * Metodo abstracto que lista todos los objetos de la clase catEntity
    * @param raza String que define la busqueda por raza
    * @return retorna todos los objetos catEntity que coinsidan con el parametro raza
    */
   public abstract List<CatEntity> findByraza(String raza);
}
