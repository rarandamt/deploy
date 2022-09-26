/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.usa.example;

import co.edu.usa.example.model.Roles;
import co.edu.usa.example.repositories.RolRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service    
public class RolService {
    
    @Autowired
    private RolRepository rolRepo;
    
    public List<Roles> getAll(){
        return (List<Roles>) rolRepo.findAll();
    }
    
}
