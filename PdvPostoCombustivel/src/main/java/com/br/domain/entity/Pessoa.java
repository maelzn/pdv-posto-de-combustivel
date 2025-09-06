package com.br.domain.entity;

import java.util.Date;

public class Pessoa {

    // Atributos
    private String nomeCompleto;
    private String cpfCnpj;
    private Date dataNascimento;
    private Integer numeroCtps;

    // Construtor
    public Pessoa(String nomeCompleto, String cpfCnpj, Date dataNascimento, Integer numeroCtps) {
        this.nomeCompleto = nomeCompleto;
        this.cpfCnpj = cpfCnpj;
        this.dataNascimento = dataNascimento;
        this.numeroCtps = numeroCtps;
    }

    // Getters
    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public Integer getNumeroCtps() {
        return numeroCtps;
    }

    // Setters
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setNumeroCtps(Integer numeroCtps) {
        this.numeroCtps = numeroCtps;
    }

}
