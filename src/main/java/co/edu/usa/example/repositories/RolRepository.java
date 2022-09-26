/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.usa.example.repositories;

import co.edu.usa.example.model.Roles;
import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

/**
 *
 * @author RAF
 */
@Repository
public interface RolRepository extends CrudRepository<Roles, Integer> {
    
}
