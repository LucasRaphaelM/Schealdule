package com.taii.scheadule.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import com.taii.scheadule.respository.AdministradorRepo;
import com.taii.scheadule.model.Administradores;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class AdministradorCotroller {
   
    @Autowired
    private AdministradorRepo repo;

    @GetMapping("/login/administradores")
    public String index(Model model){
        List<Administradores> administradores = (List<Administradores>) repo.findAll();
        model.addAttribute("Administradores", administradores);
        return "/logar";
   }
}
