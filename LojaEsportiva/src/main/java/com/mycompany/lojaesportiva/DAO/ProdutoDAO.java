
package com.mycompany.lojaesportiva.DAO;

import com.mycompany.lojaesportiva.model.Produto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProdutoDAO {

    static String URL = "jdbc:mysql://localhost:3306/lojaesportiva?useTimezone=true&serverTimezone=UTC&useSSL=false";
    static String LOGIN = "root";
    static String SENHA = "";
    
    public static boolean Cadastrar (Produto prod) throws SQLException{
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement InstrucaoSQL = null;
        
        try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           conexao = DriverManager.getConnection(URL,LOGIN,SENHA);
           
           InstrucaoSQL = conexao.prepareStatement("INSERT INTO Produto(nomeProduto, quantidadeProduto, descricao, valor) VALUES(?,?,?,?)");
           InstrucaoSQL.setString(1, prod.getNomeProduto());
           InstrucaoSQL.setInt(2, prod.getQuantidadeProduto());
           InstrucaoSQL.setString(3, prod.getDescricao());
           InstrucaoSQL.setDouble(4, prod.getValor());
           
           int linhasafetadas = InstrucaoSQL.executeUpdate();
           
           if(linhasafetadas>0){
               retorno = true;
           }
           
        } catch (ClassNotFoundException | SQLException e) {
        }finally{
            if(InstrucaoSQL!=null){
                InstrucaoSQL.close();
            }
            if(conexao!=null){
                    conexao.close();
            }
        }
        
        return retorno;
    }
    
    public static ArrayList <Produto> ListarProduto (String pnome, String pdescricao){
       Connection conexao = null;
       PreparedStatement InstrucaoSQL = null;
       ResultSet rs = null;
       ArrayList<Produto> ListaProduto = new ArrayList<>();
       
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(URL,LOGIN,SENHA);
            
            InstrucaoSQL = conexao.prepareStatement("SELECT * FROM Produto WHERE nomeProduto like ? or descricao like ?");
            InstrucaoSQL.setString(1, pnome + "%");
            InstrucaoSQL.setString(2, pdescricao + "%");
            
            rs = InstrucaoSQL.executeQuery();
            
            while(rs.next()){
                Produto prod = new Produto();
                prod.setIdProduto(rs.getInt("IdProduto"));
                prod.setNomeProduto(rs.getString("nomeProduto"));
                prod.setQuantidadeProduto(rs.getInt("quantidadeProduto"));
                prod.setDescricao(rs.getString("descricao"));
                prod.setValor(rs.getDouble("valor"));
                ListaProduto.add(prod);
            }
        } catch (ClassNotFoundException | SQLException e) {
        }finally{
            if(InstrucaoSQL!=null){
                try {
                    InstrucaoSQL.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conexao!=null){
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        return ListaProduto;
    }
    
    public static Produto ProdutoId(int IdProduto){
       Connection conexao = null;
       PreparedStatement InstrucaoSQL = null;
       ResultSet rs = null;
       Produto produto = new Produto();
       
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(URL,LOGIN,SENHA);
            
            InstrucaoSQL = conexao.prepareStatement("SELECT * FROM Produto WHERE IdProduto = ?");
            InstrucaoSQL.setInt(1, IdProduto);
            
            rs = InstrucaoSQL.executeQuery();
            
            while(rs.next()){
                Produto prod = new Produto();
                prod.setIdProduto(rs.getInt("IdProduto"));
                prod.setNomeProduto(rs.getString("nomeProduto"));
                prod.setQuantidadeProduto(rs.getInt("quantidadeProduto"));
                prod.setDescricao(rs.getString("descricao"));
                prod.setValor(rs.getDouble("valor"));
  
                produto = prod;
            }
            
        } catch (ClassNotFoundException | SQLException e) {
         }finally{
            if(InstrucaoSQL!=null){
                try {
                    InstrucaoSQL.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conexao!=null){
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
       
        return produto;
    }
    
    public static boolean Alterar(Produto prod) throws SQLException {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement InstrucaoSQL = null;
        
        try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           conexao = DriverManager.getConnection(URL,LOGIN,SENHA);
           
           InstrucaoSQL = conexao.prepareStatement("UPDATE Produto SET nomeProduto = ?, quantidadeProduto = ?, descricao = ?, valor = ? WHERE IdProduto = ?");
           InstrucaoSQL.setString(1, prod.getNomeProduto());
           InstrucaoSQL.setInt(2, prod.getQuantidadeProduto());
           InstrucaoSQL.setString(3, prod.getDescricao());
           InstrucaoSQL.setDouble(4, prod.getValor());
           InstrucaoSQL.setInt(5, prod.getIdProduto());

           int linhasafetadas = InstrucaoSQL.executeUpdate();
           
           if(linhasafetadas>0){
               retorno = true;
           }
           
        } catch (ClassNotFoundException | SQLException e) {
        }finally{
            if(InstrucaoSQL!=null){
                 InstrucaoSQL.close();
            }
            
            if(conexao!=null){
                conexao.close();
            }
        }
        
        return retorno;
    }
    
    public static boolean Excluir(int pID) throws SQLException{
      boolean retorno = false;
      Connection conexao = null;
      PreparedStatement InstrucaoSQL = null;
      
      try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conexao = DriverManager.getConnection(URL,LOGIN,SENHA);
        
        InstrucaoSQL = conexao.prepareStatement("DELETE FROM Produto WHERE IdProduto = ?");
        InstrucaoSQL.setInt(1, pID);
        int linhasafetadas = InstrucaoSQL.executeUpdate();
        if(linhasafetadas >0 ){
             return true;
      }
      } catch (Exception e) {
        }finally{
            if(InstrucaoSQL!=null){
              
                    InstrucaoSQL.close();
            }
            
            if(conexao!=null){
                    conexao.close();
            }
        }
      
      return retorno;
     }
}
