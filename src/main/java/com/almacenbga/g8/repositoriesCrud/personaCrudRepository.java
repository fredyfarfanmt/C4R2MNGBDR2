/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.almacenbga.g8.repositoriesCrud;

import com.almacenbga.g8.entities.Persona;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 *
 * @author Fmfarfan
 */
public interface personaCrudRepository extends MongoRepository<Persona, Integer>{
    
}
