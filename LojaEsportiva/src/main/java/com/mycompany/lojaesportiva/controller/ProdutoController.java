
package com.mycompany.lojaesportiva.controller;

import com.mycompany.lojaesportiva.DAO.ProdutoDAO;
import com.mycompany.lojaesportiva.model.Produto;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProdutoController {
    
    public static boolean Cadastrar(String pnome, int pquantidade, String pdescricao, float pvalor) throws SQLException {
        Produto prod = new Produto();
        prod.setNomeProduto(pnome);
        prod.setQuantidadeProduto(pquantidade);
        prod.setDescricao(pdescricao);
        prod.setValor(pvalor);
    
        return ProdutoDAO.Cadastrar(prod);
    }
    
    public static ArrayList<String[]> ListarProduto(String pnome, String pdescricao){
        
        ArrayList <Produto> ListaProduto = ProdutoDAO.ListarProduto(pnome, pdescricao);
        ArrayList <String[]> ListaProdutoRetorno = new ArrayList<>();
        for (Produto prod : ListaProduto) {
            ListaProdutoRetorno.add(new String []{String.valueOf(prod.getIdProduto()), prod.getNomeProduto(), String.valueOf(prod.getQuantidadeProduto()), prod.getDescricao(), String.valueOf(prod.getValor())});
        }
        return ListaProdutoRetorno; 
    }
    
    public static String[] ProdutoID(int IdProduto){
        Produto prod = ProdutoDAO.ProdutoId(IdProduto);
        String [] ProdutoRetorno = null;
        
        if(prod.getIdProduto()>0){
           ProdutoRetorno = new String []{String.valueOf(prod.getIdProduto()), prod.getNomeProduto(), String.valueOf(prod.getQuantidadeProduto()), prod.getDescricao(), String.valueOf(prod.getValor())};   
        }
        
        return ProdutoRetorno;
    }
    
    public static boolean Alterar(int pIdProduto, String pnome, int quantidade, String descricao, float valor) throws SQLException {
        Produto prod = new Produto();
        prod.setIdProduto(pIdProduto);
        prod.setNomeProduto(pnome);
        prod.setQuantidadeProduto(quantidade);
        prod.setDescricao(descricao);
        prod.setValor(valor);
    
        return ProdutoDAO.Alterar(prod);
    }
}
