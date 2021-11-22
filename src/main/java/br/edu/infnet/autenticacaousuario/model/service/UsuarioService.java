package br.edu.infnet.autenticacaousuario.model.service;

import br.edu.infnet.autenticacaousuario.model.domain.Usuario;
import br.edu.infnet.autenticacaousuario.model.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public void salvar (Usuario usuario){
        usuarioRepository.save(usuario);
    }
    public Usuario autenticacao (String email, String senha){
        return usuarioRepository.autenticacao(email, senha);
    }
}
