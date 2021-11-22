package br.edu.infnet.autenticacaousuario.controller;

import br.edu.infnet.autenticacaousuario.model.domain.Usuario;
import br.edu.infnet.autenticacaousuario.model.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/")
    public String telaCadastro(){
        return "cadastro";
    }

    @PostMapping("/usuarios")
    public String telaLista(Model model, Usuario usuario){
        usuarioService.salvar(usuario);
        model.addAttribute("usuario",usuario);
        return "confirmacao";
    }
}
