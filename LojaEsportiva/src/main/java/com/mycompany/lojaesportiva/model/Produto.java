package com.mycompany.lojaesportiva.model;

/**
 * Classe cria os atributos e métodos especiais do produto
 * @author Wesley
 */
public class Produto {
    
    private int IdProduto;
    private String nomeProduto;
    private int quantidadeProduto;
    private String descricao;
    private double valor;

    /**
     * Método cria um construtor vazio
     */
    public Produto() {
    }

    public int getIdProduto() {
        return IdProduto;
    }

    public void setIdProduto(int IdProduto) {
        this.IdProduto = IdProduto;
    }
    
    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQuantidadeProduto() {
        return quantidadeProduto;
    }

    public void setQuantidadeProduto(int quantidadeProduto) {
        this.quantidadeProduto = quantidadeProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}