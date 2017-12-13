/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Kuis.Kuis_1049.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Hendro Steven
 */
@Entity
@Table(name = "identitas_1049")
public class Identitas_1049 implements Serializable {    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, nullable = false, unique = true)
    private String NIM;
    @Column(length = 100, nullable = false, unique = true)
    private String Nama;
    @Column(length = 100, nullable = false, unique = true)
    private String Prodi;
    
   

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNIM() {
        return NIM;
    }
    public void setNIM(String NIM) {
        this.NIM = NIM;
    }
    /**
     * @return the name
     */
    public String getNama() {
        return Nama;
    }

    /**
     * @param name the name to set
     */
    public void setNama(String Nama) {
        this.Nama = Nama;
    }
    
    public String getProdi() {
        return Prodi;
    }
    public void setProdi(String Prodi) {
        this.Prodi = Prodi;
    }
    /**
     * @param description the description to set
     */
    /**public void setDescription(String description) {
        this.description = description;
    }*/

    /**
     * @return the description
     */
    /**public String getDescription() {
        return description;
    }*/

}
