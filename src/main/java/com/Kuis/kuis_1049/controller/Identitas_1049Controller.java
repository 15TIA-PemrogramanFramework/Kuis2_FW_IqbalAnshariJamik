/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Kuis.Kuis_1049.controller;

import com.Kuis.Kuis_1049.entity.Identitas_1049;
import com.Kuis.Kuis_1049.service.Identitas_1049Service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Hendro Steven
 */
@RestController
@RequestMapping("/identitas_1049")
public class Identitas_1049Controller {

    @Autowired
    private Identitas_1049Service identitas_1049Service;

    @RequestMapping(method = RequestMethod.POST)
    public Identitas_1049 insert(@RequestBody Identitas_1049 identitas_1049) {
        return identitas_1049Service.insert(identitas_1049);
    }

    @RequestMapping(method = RequestMethod.PUT)
    public Identitas_1049 update(@RequestBody Identitas_1049 identitas_1049) {
        return identitas_1049Service.update(identitas_1049);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/{id}")
    public boolean delete(@PathVariable("id") Long id) {
        return identitas_1049Service.delete(id);
    }
    
    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public Identitas_1049 getById(@PathVariable("id") Long id){
        return identitas_1049Service.getById(id);
    }
    
    @RequestMapping(method = RequestMethod.GET)
    public List<Identitas_1049> getAll(){
        return identitas_1049Service.getAll();
    }
}
