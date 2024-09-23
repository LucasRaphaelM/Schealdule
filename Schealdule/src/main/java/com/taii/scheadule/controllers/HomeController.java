package com.taii.scheadule.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.taii.scheadule.model.Administradores;
import com.taii.scheadule.model.Agendamento;
import com.taii.scheadule.model.Medico;
import com.taii.scheadule.model.Paciente;
//import com.taii.scheadule.model.Usuario;
import com.taii.scheadule.respository.AdministradorRepo;
import com.taii.scheadule.respository.AgendamentoRepo;
import com.taii.scheadule.respository.MedicoRepo;
import com.taii.scheadule.respository.PacienteRepo;
import com.taii.scheadule.respository.UsuarioRepo;
//import com.taii.scheadule.model.Agenda;





@Controller
public class HomeController {
    
    @Autowired
    AdministradorRepo administradoresRepo;

    @Autowired
    AgendamentoRepo agendamentoRepo;

    @Autowired
    UsuarioRepo clienteRepo;

    @Autowired
    MedicoRepo medicosRepo;

    @Autowired
    PacienteRepo pacienteRepo;

    @PostMapping("/logar") //confere o login e permite ou não o acesso
    public String getUser(Model model, @ModelAttribute Administradores administradores){ 
      Administradores administradoresLogados = administradoresRepo.loginValidation(administradores.getEmail_adm(), administradores.getSenha_adm());
    
      if(administradoresLogados != null){
            return "redirect:/inicio";
      }
          model.addAttribute("erro", "Usuário ou senha incorreto.");
          return "/home/login";

    }

    @GetMapping("/") //isso aqui define a rota para onde vou ir
    public String landpage(){
        return "home/landpage";

    }

    @GetMapping("/medicos") //isso aqui define a rota para onde vou ir
    public String medicos(){
        return "home/medico";


    }

    @GetMapping("/inicio")
    public String inicio(Model model) {
        
        List<Agendamento> agendamentos = (List<Agendamento>) agendamentoRepo.findAll();
        model.addAttribute("agendamentos", agendamentos);

        List<Medico> medicos = (List<Medico>) medicosRepo.findAll();
        model.addAttribute("medicos", medicos);

        return "home/pagina";


    }
    @GetMapping("/login")
    public String index(Model model) {
        return "home/login";
    }

    @PostMapping("/medico/cadastrar")
    public String cadastrarMedico(Medico medico){
        medicosRepo.save(medico);

        return "redirect:/inicio";
    }

    @PostMapping("/agendar")
    public String agendar( Paciente cliente,String data, String horario, String motivo, String idmedico) {
       
       
       
       
       //Agendamento agendamento = new Agendamento();
       //agendamento.setData(null);
        // System.out.println("=========================="+cliente.getNome_Paciente()+cliente.getCpf_Paciente());
       // System.out.println("==================="+idmedico);
       // PacienteRepo.save(cliente);
       // Agendamento agendamento = new Agendamento();
       // agendamento.setPaciente(cliente);
       // Medico medico = medicosRepo.findById(Integer.valueOf(idmedico)).get();
       // agendamento.setMedico(medico);
       /// agendamento.setMotivo_consulta(motivo);
       // AgendamentoRepo.save(agendamento);
        return "redirect:/inicio";
    }
}