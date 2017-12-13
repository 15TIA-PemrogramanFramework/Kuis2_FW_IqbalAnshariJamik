/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Kuis.Kuis_1049.repo;

import com.Kuis.Kuis_1049.entity.Ipk_1049;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;


/**
 *
 * @author Hendro Steven
 */
public interface Ipk_1049Repo extends CrudRepository<Ipk_1049, Long>{
    
    @Query("select p from Ipk_1049 p")
    public List<Ipk_1049> findAllIpk_1049();
}
