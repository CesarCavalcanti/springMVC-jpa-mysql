package br.edu.infnet.autenticacaousuario.controller;

import br.edu.infnet.autenticacaousuario.model.domain.Usuario;
import br.edu.infnet.autenticacaousuario.model.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AcessoController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/login")
    public String telaLogin (){
        return "login";
    }

    @PostMapping("/autenticar")
    public String autenticar(Model model, @RequestParam String email, String senha){
        Usuario usuario = usuarioService.autenticacao(email,senha);

        if (usuario != null){
            model.addAttribute("user", usuario);
            return "confirmacao";
        }
        model.addAttribute("msg", "Usuario não cadastrado");
        return "login";
    }
}
