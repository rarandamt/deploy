/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.usa.example.controller;

import co.edu.usa.example.RolService;
import co.edu.usa.example.model.Roles;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("rol")
public class RolController {
    
    @Autowired
    private RolService rs;
    
    @GetMapping("all")
    public List<Roles> obtenerTodos(){
        return rs.getAll();
    }
    
}
