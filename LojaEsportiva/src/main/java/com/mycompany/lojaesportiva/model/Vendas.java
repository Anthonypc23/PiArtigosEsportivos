package com.mycompany.lojaesportiva.model;

import java.util.ArrayList;
import java.util.Date;

/**
 * Classe cria atributos e métodos especiais da venda
 * @author Ingrid
 */
public class Vendas {
    
    private Date data;
    private int FKIDCLiente;
    private float ValorFinal;
    private int IdVenda;
    private Date pInicial;
    private Date pFinal;
    ArrayList<itemVenda> ListaVenda;

    public ArrayList<itemVenda> getListaVenda() {
        return ListaVenda;
    }

    public void setListaVenda(ArrayList<itemVenda> ListaVenda) {
        this.ListaVenda = ListaVenda;
    }
    
    /**
     * Método cria um construtor vazio
     */
    public Vendas() {
    }

    public int getIdVenda() {
        return IdVenda;
    }

    public void setIdVenda(int IdVenda) {
        this.IdVenda = IdVenda;
    }
    
    public float getValorFinal() {
        return ValorFinal;
    }

    public void setValorFinal(float ValorFinal) {
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
}
