/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lojaesportiva.DAO;

import static com.mycompany.lojaesportiva.DAO.ClienteDAO.URL;
import com.mycompany.lojaesportiva.model.Vendas;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author rrmat
 */
public class VendaDAO {
  static String URL = "jdbc:mysql://localhost:3306/lojaesportiva?useTimezone=true&serverTimezone=UTC&useSSL=false";
    static String LOGIN = "root";
    static String SENHA = "";
    
    public static boolean CadastrarVenda(Vendas venda){
      boolean retorno = false;
        Connection conexao = null;
        PreparedStatement InstrucaoSQL = null;
        
        try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           conexao = DriverManager.getConnection(URL,LOGIN,SENHA);
           
           InstrucaoSQL = conexao.prepareStatement("INSERT INTO Venda(dataVenda,ValorTotal,idCliente) VALUES(?,?,?)", Statement.RETURN_GENERATED_KEYS);
           InstrucaoSQL.setDate(1, new java.sql.Date(venda.getData().getTime()));
           InstrucaoSQL.setDouble(2, venda.getValorFinal());
           InstrucaoSQL.setInt(3, venda.getFKIDCLiente());
           int linhasafetadas = InstrucaoSQL.executeUpdate();
           
           if(linhasafetadas>0){
               retorno = true;
               
                ResultSet generatedKeys = InstrucaoSQL.getGeneratedKeys(); //Recupero o ID do cliente
                if (generatedKeys.next()) {
                        venda.setIdVenda(generatedKeys.getInt(1));
                }else {
                        throw new SQLException("Falha ao obter o ID da Nota Fiscal!.");
                }
           }
           
        } catch (Exception e) {
        }finally{
            if(InstrucaoSQL!=null){
                try {
                    InstrucaoSQL.close();
                } catch (SQLException ex) {
                    Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            if(conexao!=null){
                try {
                    conexao.close();
                } catch (SQLException ex) {
                    Logger.getLogger(VendaDAO.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        
        return retorno;
    }
    
}
