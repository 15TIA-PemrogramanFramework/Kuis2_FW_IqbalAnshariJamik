/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Kuis.Kuis_1049.controller;

import com.Kuis.Kuis_1049.entity.Ipk_1049;
import com.Kuis.Kuis_1049.entity.Ipk_1049;
import com.Kuis.Kuis_1049.service.Ipk_1049Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.Kuis.Kuis_1049.repo.Ipk_1049Repo;
import com.Kuis.Kuis_1049.service.Ipk_1049Service;
import java.util.List;
import org.springframework.web.bind.annotation.PathVariable;

/**
 *
 * @author Hendro Steven
 */
@RestController
@RequestMapping("/ipk_1049")
public class Ipk_1049Controller {
    
    @Autowired
    private Ipk_1049Service ipk_1049Service;

    @RequestMapping(method = RequestMethod.POST)
    public Ipk_1049 insert(@RequestBody Ipk_1049 ipk_1049) {
        return ipk_1049Service.insert(ipk_1049);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Ipk_1049 update(@RequestBody Ipk_1049 ipk_1049) {
        return ipk_1049Service.update(ipk_1049);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return ipk_1049Service.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Ipk_1049 getById(@PathVariable("id") Long id){
        return ipk_1049Service.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Ipk_1049> getAll(){
        return ipk_1049Service.getAll();
    }
  
}
