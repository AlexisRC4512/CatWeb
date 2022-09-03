package com.demo.Repositories;

import com.demo.Entities.LoginUserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Interfaz repository de la clase LoginUserEntiry que extiende de JPARepository
 */
@Repository
public interface LoginUserRepository extends JpaRepository<LoginUserEntity,Integer> {
    /**
     * Metodo String que busca un Onjeto por Email
     * @param email email para traer el objeto y validar el usuario
     * @return
     */
        public abstract LoginUserEntity findByEmail(String email);
}
