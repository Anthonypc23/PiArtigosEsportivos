package com.mycompany.lojaesportiva.DAO;

import com.mycompany.lojaesportiva.model.Vendas;
import com.mycompany.lojaesportiva.model.itemVenda;
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
               
               ResultSet chavesGeradas = InstrucaoSQL.getGeneratedKeys(); //Recupero o ID da nota fiscal
                if (chavesGeradas.next()) {
                        venda.setIdVenda(chavesGeradas.getInt(1));
                        
                        for (itemVenda item : venda.getListaVenda()) {
                            
                             PreparedStatement instrucaoSQLDetalhe = conexao.prepareStatement("INSERT INTO itemVenda (idVenda,descricao,qtd) VALUES(?,?,?)"
                                                    , Statement.RETURN_GENERATED_KEYS);  //Caso queira retornar o ID
            
                            //Adiciono os parâmetros ao meu comando SQL
                            instrucaoSQLDetalhe.setInt(1, venda.getIdVenda());
                            instrucaoSQLDetalhe.setString(2, item.getDescricao());
                            instrucaoSQLDetalhe.setInt(3, item.getQuantidade());
                            
                            
                             int itensAfetados = instrucaoSQLDetalhe.executeUpdate();
                             if(itensAfetados<0){
                                 throw new SQLException("Falha ao inserir itens da Nota Fiscal!.");
                             }
                        }
                        
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
