package com.mycompany.lojaesportiva.DAO;

import com.mycompany.lojaesportiva.model.Cliente;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe responsável para fazer todas as manipulações com o jdbc
 * @author Anthony
 */
public class ClienteDAO {
    static String URL = "jdbc:mysql://localhost:3306/lojaesportiva?useTimezone=true&serverTimezone=UTC&useSSL=false";
    static String LOGIN = "root";
    static String SENHA = "";
    
    /**
     * Método resgata o objeto e faz o cadastro no jdbc
     * @param cli objeto da classe cliente
     * @return boolean true: insere o cliente no banco de dados | false: erro no cadastro
     * @throws SQLException lança para fora a exceção
     */
    public static boolean Cadastrar (Cliente cli) throws SQLException{
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement InstrucaoSQL = null;
        
        try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           conexao = DriverManager.getConnection(URL,LOGIN,SENHA);
           
           InstrucaoSQL = conexao.prepareStatement("INSERT INTO Cliente(nome,email,CPF,nascimento,sexo,estadocivil,telefone,endereco) VALUES(?,?,?,?,?,?,?,?)");
           InstrucaoSQL.setString(1, cli.getNome());
           InstrucaoSQL.setString(2, cli.getEmail());
           InstrucaoSQL.setString(3, cli.getCPF());
           InstrucaoSQL.setDate(4, new java.sql.Date(cli.getNascimento().getTime()));
           InstrucaoSQL.setString(5, cli.getSexo());
           InstrucaoSQL.setString(6, cli.getEstadoCivil());
           InstrucaoSQL.setString(7, cli.getTelefone());
           InstrucaoSQL.setString(8, cli.getEndereço());
           int linhasafetadas = InstrucaoSQL.executeUpdate();
           
           if(linhasafetadas>0){
               retorno = true;
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
    
    /**
     * Método resgata os dados e cria uma lista de clientes
     * @param pnome string a ser verificada
     * @param pCPF string a ser verificada
     * @return arrayList uma lista de clientes
     */
    public static ArrayList <Cliente> ListarCliente (String pnome,String pCPF){
       Connection conexao = null;
       PreparedStatement InstrucaoSQL = null;
       ResultSet rs = null;
       ArrayList<Cliente> ListaCLiente = new ArrayList<>();
       
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(URL,LOGIN,SENHA);
            
            InstrucaoSQL = conexao.prepareStatement("SELECT * FROM Cliente WHERE nome like ? or CPF like ?");
            InstrucaoSQL.setString(1, pnome+"%");
            InstrucaoSQL.setString(2, pCPF+"%");
            
            rs = InstrucaoSQL.executeQuery();
            
            while(rs.next()){
            Cliente cli = new Cliente();
            cli.setIdCliente(rs.getInt("IdCliente"));
            cli.setNome(rs.getString("nome"));
            cli.setEmail(rs.getString("email"));
            cli.setCPF(rs.getString("CPF"));
            cli.setNascimento(new Date (rs.getDate("nascimento").getTime()));
            cli.setSexo(rs.getString("sexo"));
            cli.setEstadoCivil(rs.getString("estadocivil"));
            cli.setTelefone(rs.getString("telefone"));
            cli.setEndereço(rs.getString("endereco"));
            ListaCLiente.add(cli);
            }
            
        } catch (Exception e) {
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
        
        return ListaCLiente;
    }
    
    /**
     * Método resgata o id e faz as alterações
     * @param IdCliente int a ser verificado
     * @return retorna um objeto 
     */
    public static Cliente ClienteId(int IdCliente){
       Connection conexao = null;
       PreparedStatement InstrucaoSQL = null;
       ResultSet rs = null;
       Cliente cliente = new Cliente();
       
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(URL,LOGIN,SENHA);
            
            InstrucaoSQL = conexao.prepareStatement("SELECT * FROM Cliente WHERE IdCliente = ?");
            InstrucaoSQL.setInt(1, IdCliente);
            
            rs = InstrucaoSQL.executeQuery();
            
            while(rs.next()){
              Cliente cli = new Cliente();
              cli.setIdCliente(rs.getInt("IdCLiente"));
              cli.setNome(rs.getString("nome"));
              cli.setEmail(rs.getString("email"));
              cli.setCPF(rs.getString("CPF"));
              cli.setNascimento(new Date (rs.getDate("nascimento").getTime()));
              cli.setSexo(rs.getString("sexo"));
              cli.setEstadoCivil(rs.getString("estadocivil"));
              cli.setTelefone(rs.getString("telefone"));
              cli.setEndereço(rs.getString("endereco"));
              cliente = cli;
            }
            
        } catch (Exception e) {
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
       
        return cliente;
    }
    
    /**
     * Método resgata o objeto e faz a alteração no jdbc
     * @param cli objeto da classe cliente
     * @return boolean true: altera os dados | false: erro na alteração 
     * @throws SQLException lança para fora a exceção
     */
  public static boolean Alterar(Cliente cli) throws SQLException {
        boolean retorno = false;
        Connection conexao = null;
        PreparedStatement InstrucaoSQL = null;
        
        try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           conexao = DriverManager.getConnection(URL,LOGIN,SENHA);
           
           InstrucaoSQL = conexao.prepareStatement("UPDATE Cliente SET nome = ?, email = ?, CPF = ?, nascimento = ?, Sexo = ?, estadocivil = ?, telefone = ?, endereco = ? WHERE IdCliente = ?");
           InstrucaoSQL.setString(1, cli.getNome());
           InstrucaoSQL.setString(2, cli.getEmail());
           InstrucaoSQL.setString(3, cli.getCPF());
           InstrucaoSQL.setDate(4, new java.sql.Date(cli.getNascimento().getTime()));
           InstrucaoSQL.setString(5, cli.getSexo());
           InstrucaoSQL.setString(6, cli.getEstadoCivil());
           InstrucaoSQL.setString(7, cli.getTelefone());
           InstrucaoSQL.setString(8, cli.getEndereço());
           InstrucaoSQL.setInt(9, cli.getIdCliente());

           
           int linhasafetadas = InstrucaoSQL.executeUpdate();
           
           if(linhasafetadas>0){
               retorno = true;
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
  
  /**
   * Método restaga o id e faz a exclução no jdbc
   * @param pID int a ser verificado
   * @return boolean true: exclui os dados | false: erro na exclução
   * @throws SQLException lança para fora as exceções
   */
  public static boolean Excluir(int pID) throws SQLException{
      boolean retorno = false;
      Connection conexao = null;
      PreparedStatement InstrucaoSQL = null;
      
      try {
        Class.forName("com.mysql.cj.jdbc.Driver");
        conexao = DriverManager.getConnection(URL,LOGIN,SENHA);
        
        InstrucaoSQL = conexao.prepareStatement("DELETE FROM Cliente WHERE IdCliente = ?");
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
  
  /**
   * Método faz a consulta cliente
   * @param CPF string a ser verificada
   * @return retorna o objeto cliente
   */
  public static Cliente ConsultaCPF(String CPF){
       Connection conexao = null;
       PreparedStatement InstrucaoSQL = null;
       ResultSet rs = null;
       Cliente cliente = new Cliente();
       
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(URL,LOGIN,SENHA);
            
            InstrucaoSQL = conexao.prepareStatement("SELECT * FROM Cliente WHERE CPF LIKE ?");
            InstrucaoSQL.setString(1, CPF);
            rs = InstrucaoSQL.executeQuery();
            
            while(rs.next()){
              Cliente cli = new Cliente();
              cli.setIdCliente(rs.getInt("IdCliente"));
              cliente = cli;
            }
            
        } catch (Exception e) {
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
       
        return cliente;
    }
}
