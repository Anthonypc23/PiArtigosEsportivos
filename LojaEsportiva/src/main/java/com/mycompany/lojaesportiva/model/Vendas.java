
package com.mycompany.lojaesportiva.model;

import java.util.ArrayList;
import java.util.Date;

public class Vendas {
    private Date data;
    private int FKIDCLiente;
    private double ValorFinal;
    private double[] Valor;
    private int []  quantidade;
    private int IdVenda;
    ArrayList<itemVenda> ListaVenda;

    public ArrayList<itemVenda> getListaVenda() {
        return ListaVenda;
    }

    public void setListaVenda(ArrayList<itemVenda> ListaVenda) {
        this.ListaVenda = ListaVenda;
    }

   
    
    public Vendas() {
    }

    public int getIdVenda() {
        return IdVenda;
    }

    public void setIdVenda(int IdVenda) {
        this.IdVenda = IdVenda;
    }
    
    
    public double getValorFinal() {
        return ValorFinal;
    }

    public void setValorFinal(double ValorFinal) {
        this.ValorFinal = ValorFinal;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getFKIDCLiente() {
        return FKIDCLiente;
    }

    public void setFKIDCLiente(int FKIDCLiente) {
        this.FKIDCLiente = FKIDCLiente;
    }
    
    

    public double[] getValor() {
        return Valor;
    }

    public void setValor(double[] Valor) {
        this.Valor = Valor;
    }

    public int[] getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int[] quantidade) {
        this.quantidade = quantidade;
    }

 

    
}
