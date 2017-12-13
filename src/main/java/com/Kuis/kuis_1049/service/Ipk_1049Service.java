/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Kuis.Kuis_1049.service;

import com.Kuis.Kuis_1049.entity.Ipk_1049;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Kuis.Kuis_1049.repo.Ipk_1049Repo;

/**
 *
 * @author Hendro Steven
 */
@Service("ipk_1049Service")
@Transactional
public class Ipk_1049Service {

    @Autowired
    private Ipk_1049Repo repo;

    public Ipk_1049 insert(Ipk_1049 Ipk_1049) {
        return repo.save(Ipk_1049);
    }

    public Ipk_1049 update(Ipk_1049 Ipk_1049) {
        return repo.save(Ipk_1049);
    }

    public boolean delete(Long id) {
        repo.delete(id);
        return true;
    }

    public Ipk_1049 getById(Long id) {
        return repo.findOne(id);
    }

    public List<Ipk_1049> getAll() {
        return repo.findAllIpk_1049();
    }
}
