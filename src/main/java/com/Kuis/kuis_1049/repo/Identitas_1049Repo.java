/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Kuis.Kuis_1049.repo;

import com.Kuis.Kuis_1049.entity.Identitas_1049;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Hendro Steven
 */
public interface Identitas_1049Repo extends CrudRepository<Identitas_1049, Long> {

    @Query("select c from Identitas_1049 c")
    public List<Identitas_1049> findAllIdentitas_1049();
}
