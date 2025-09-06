package com.br.domain.entity;
public class Acesso{

    private String usuario;
    private String senha;

    //construtor

    public Acesso(String senha, String usuario){
        this.senha = senha;
        this.usuario = usuario;
    }



    //getters


    public String getSenha() {
        return senha;
    }

    public String getUsuario() {
        return usuario;
    }

    //setters


    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
}



