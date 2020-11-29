/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lojaesportiva.model;

import java.util.Date;

/**
 *
 * @author rrmat
 */
public class Cliente {
    private int IdCliente;
    private String Nome;
    private String Email;
    private String CPF;
    private Date Nascimento;
    private String Sexo;
    private String EstadoCivil;
    private String Telefone;
    private String Endereço;

    public Cliente() {
   
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }
    

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public Date getNascimento() {
        return Nascimento;
    }

    public void setNascimento(Date Nascimento) {
        this.Nascimento = Nascimento;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getEstadoCivil() {
        return EstadoCivil;
    }

    public void setEstadoCivil(String EstadoCivil) {
        this.EstadoCivil = EstadoCivil;
    }

    public String getTelefone() {
        return Telefone;
    }

    public void setTelefone(String Telefone) {
        this.Telefone = Telefone;
    }

    public String getEndereço() {
        return Endereço;
    }

    public void setEndereço(String Endereço) {
        this.Endereço = Endereço;
    }
}
