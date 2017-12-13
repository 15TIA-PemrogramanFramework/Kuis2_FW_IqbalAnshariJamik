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
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Hendro Steven
 */
@Entity
@Table(name = "ipk_1049")
public class Ipk_1049 implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 100, nullable = false, unique = true)
    private String Alamat;
    @Column(length = 100, nullable = false, unique = true)
    private String Asal;
    private double IPK;
    
    
    @ManyToOne
    private Identitas_1049 identitas_1049;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getAlamat() {
        return Alamat;
    }

    /**
     * @param name the name to set
     */
    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }
    
    
    public String getAsal() {
        return Asal;
    }
    public void setAsal(String Asal) {
        this.Asal = Asal;
    }
    
    
    

    /**
     * @return the price
     */
    public double getIPK() {
        return IPK;
    }

    /**
     * @param price the price to set
     */
    public void setIPK(double IPK) {
        this.IPK = IPK;
    }

    /**
     * @return the description
     */
    /**public String getDescription() {
        return description;
    } */

    /**
     * @param description the description to set
     */
    /**public void setDescription(String description) {
        this.description = description;
    } */

    /**
     * @return the category
     */
    public Identitas_1049 getIdentitas_1049() {
        return identitas_1049;
    }

    /**
     * @param category the category to set
     */
    public void setIdentitas_1049(Identitas_1049 identitas_1049) {
        this.identitas_1049 = identitas_1049;
    }
    
    
}
