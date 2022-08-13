package com.demo.Entities;

import javax.persistence.*;

/**
 * Clase CatEntity mapea la tabla cat de la base de datos MyCatwiki
 * @author Alexis Ramos Cajo
 * @version 28/07/2022
 */
@Entity
@Table(name = "tb_Cat")
public class CatEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
    @Column(name = "raza")
    private String raza;
    @Column(name = "descripcion")
    private String descripcion;
    @Column(name = "foto")
    private String foto;

    /**
     * Contructor de la clase Catentity crea un objeto catEntity
     * @param id id  hace referencia a la primary key de la tabla cat es de tipo int y se autoincrementa
     * @param raza raza hace referencia a la columna  raza es de tipo String
     * @param descripcion raza hace referencia a la descripcion  raza es de tipo String
     * @param foto raza hace referencia a la columna  foto es de tipo String
     */
    public CatEntity(int id, String raza, String descripcion, String foto) {
        this.id = id;
        this.raza = raza;
        this.descripcion = descripcion;
        this.foto = foto;
    }


    public CatEntity() {}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }
}
