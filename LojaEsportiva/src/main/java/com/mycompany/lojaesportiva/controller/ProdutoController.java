package com.mycompany.lojaesportiva.controller;

import com.mycompany.lojaesportiva.DAO.ProdutoDAO;
import com.mycompany.lojaesportiva.model.Produto;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Classe faz toda a manipulação dos dados do produto
 * @author Wesley
 */
public class ProdutoController {
    
    /**
     * Método pega todos os dados, altera a model e chama a função da DAO
     * @param pnome string a ser verificada
     * @param pquantidade string a ser verificada
     * @param pdescricao string a ser verificada
     * @param pvalor string a ser verificada
     * @return boolean true: retorna a classe DAO | false: erro no cadastro
     * @throws SQLException lança para fora a exceção
     */
    public static boolean Cadastrar(String pnome, int pquantidade, String pdescricao, double pvalor) throws SQLException {
        Produto prod = new Produto();
        prod.setNomeProduto(pnome);
        prod.setQuantidadeProduto(pquantidade);
        prod.setDescricao(pdescricao);
        prod.setValor(pvalor);
    
        return ProdutoDAO.Cadastrar(prod);
    }
    
    /**
     * Método pega os dados e faz uma lista
     * @param pnome string a ser verificada
     * @param pdescricao string a ser verificada
     * @return retorna a lista do produto
     */
    public static ArrayList<String[]> ListarProduto(String pnome, String pdescricao){
        ArrayList <Produto> ListaProduto = ProdutoDAO.ListarProduto(pnome, pdescricao);
        ArrayList <String[]> ListaProdutoRetorno = new ArrayList<>();
        for (Produto prod : ListaProduto) {
            ListaProdutoRetorno.add(new String []{String.valueOf(prod.getIdProduto()), prod.getNomeProduto(), String.valueOf(prod.getQuantidadeProduto()), prod.getDescricao(), String.valueOf(prod.getValor())});
        }
        return ListaProdutoRetorno; 
    }
    
    /**
     * Método verifica o id do produto e cria um vetor
     * @param IdProduto string a ser verificada
     * @return string[] retorna um vetor com os produtos
     */
    public static String[] ProdutoID(int IdProduto){
        Produto prod = ProdutoDAO.ProdutoId(IdProduto);
        String [] ProdutoRetorno = null;
        
        if(prod.getIdProduto()>0){
           ProdutoRetorno = new String []{String.valueOf(prod.getIdProduto()), prod.getNomeProduto(), String.valueOf(prod.getQuantidadeProduto()), prod.getDescricao(), String.valueOf(prod.getValor())};   
        }
        
        return ProdutoRetorno;
    }
    
    /**
     * Método resgata os dados e faz a alteração
     * @param pIdProduto string a ser verificada
     * @param pnome string a ser verificada
     * @param quantidade string a ser verificada
     * @param descricao string a ser verificada
     * @param valor string a ser verificada
     * @return boolean true: retorna a classe DAO | false: erro ao alterar
     * @throws SQLException lança para fora a exceção
     */
    public static boolean Alterar(int pIdProduto, String pnome, int quantidade, String descricao, double valor) throws SQLException {
        Produto prod = new Produto();
        prod.setIdProduto(pIdProduto);
        prod.setNomeProduto(pnome);
        prod.setQuantidadeProduto(quantidade);
        prod.setDescricao(descricao);
        prod.setValor(valor);
    
        return ProdutoDAO.Alterar(prod);
    }
    
    /**
     * Método pega o id do produto e chama a função DAO
     * @param pID int a ser verificado
     * @return boolean true: retorna a classe DAO | false: erro na exclusão
     * @throws SQLException lança para fora a exceção
     */
    public static boolean Excluir(int pID) throws SQLException{
        Produto prod = new Produto();
        prod.setIdProduto(pID);
        
        return ProdutoDAO.Excluir(pID);
    }
}
