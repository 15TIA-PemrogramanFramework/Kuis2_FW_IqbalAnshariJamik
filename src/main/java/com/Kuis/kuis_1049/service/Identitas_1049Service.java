/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Kuis.Kuis_1049.service;

import com.Kuis.Kuis_1049.entity.Identitas_1049;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Kuis.Kuis_1049.repo.Identitas_1049Repo;

/**
 *
 * @author Hendro Steven
 */
@Service("identitas_1049Service")
@Transactional
public class Identitas_1049Service {

    @Autowired
    private Identitas_1049Repo repo;

    public Identitas_1049 insert(Identitas_1049 identitas_1049) {
        return repo.save(identitas_1049);
    }
    
    public Identitas_1049 update(Identitas_1049 identitas_1049) {
        return repo.save(identitas_1049);
    }
    
    public boolean delete(Long id){
        repo.delete(id);
        return true;
    }
    
    public Identitas_1049 getById(Long id){
        return repo.findOne(id);
    }
    
    public List<Identitas_1049> getAll(){
        return repo.findAllIdentitas_1049();
    }
}
