package org.generation.blogPessoal.model;

import lombok.Data;

@Data
public class UsuarioLogin {

    private String nome;

    private String usuario;

    private String senha;

    private String token;
}
