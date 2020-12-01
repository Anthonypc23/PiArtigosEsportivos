package com.mycompany.lojaesportiva.DAO;

import com.mycompany.lojaesportiva.model.Vendas;
import com.mycompany.lojaesportiva.model.itemVenda;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Classe responsável para fazer todas as manipulações com o jdbc
 * @author Wesley
 */
public class VendaDAO {
   static String URL = "jdbc:mysql://localhost:3307/lojaesportiva?useTimezone=true&serverTimezone=UTC&useSSL=false";
    static String LOGIN = "root";
    static String SENHA = "";
    
    /**
     * Método resgata o objeto e faz o cadastro no jdbc
     * @param venda objeto da classe vendas
     * @return boolean true: insere a venda no banco de dados | false: erro no cadastro
     * @throws SQLException lança para fora a exceção
     */
    public static boolean CadastrarVenda(Vendas venda) throws SQLException{
      boolean retorno = false;
        Connection conexao = null;
        PreparedStatement InstrucaoSQL = null;
        
        try {
           Class.forName("com.mysql.cj.jdbc.Driver");
           conexao = DriverManager.getConnection(URL,LOGIN,SENHA);
           
           InstrucaoSQL = conexao.prepareStatement("INSERT INTO Venda(dataVenda,ValorTotal,idCliente) VALUES(?,?,?)", Statement.RETURN_GENERATED_KEYS);
           InstrucaoSQL.setDate(1, new java.sql.Date(venda.getData().getTime()));
           InstrucaoSQL.setFloat(2, venda.getValorFinal());
           InstrucaoSQL.setInt(3, venda.getFKIDCLiente());
           int linhasafetadas = InstrucaoSQL.executeUpdate();
           
           if(linhasafetadas>0){
               retorno = true;
               
               ResultSet chavesGeradas = InstrucaoSQL.getGeneratedKeys(); //Recupero o ID da nota fiscal
                if (chavesGeradas.next()) {
                        venda.setIdVenda(chavesGeradas.getInt(1));
                        
                        for (itemVenda item : venda.getListaVenda()) {
                            
                             PreparedStatement instrucaoSQLItem = conexao.prepareStatement("INSERT INTO itemVenda (idVenda,descricao,qtd,valor,idProduto) VALUES(?,?,?,?,?)"
                                                    , Statement.RETURN_GENERATED_KEYS);  //Caso queira retornar o ID
            
                            //Adiciono os parâmetros ao meu comando SQL
                            instrucaoSQLItem.setInt(1, venda.getIdVenda());
                            instrucaoSQLItem.setString(2, item.getDescricao());
                            instrucaoSQLItem.setInt(3, item.getQuantidade());
                            instrucaoSQLItem.setFloat(4, item.getValor());
                            instrucaoSQLItem.setInt(5, item.getIdProduto());
                            
                          PreparedStatement  instrucaoSQLDecrementacao = conexao.prepareStatement("UPDATE Produto SET QuantidadeProduto = QuantidadeProduto-? where idProduto = ?;");
                            instrucaoSQLDecrementacao.setInt(1, item.getQuantidade());
                            instrucaoSQLDecrementacao.setInt(2, item.getIdProduto());

                            int itensAfetados = instrucaoSQLItem.executeUpdate();
                             int itensAfetados2 = instrucaoSQLDecrementacao.executeUpdate();
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
    
    /**
     * Método resgata os dados e cria uma lista de vendas
     * @param pInicial date a ser vefificada
     * @param pFinal date a ser vefificada
     * @return arrayList uma lista da venda
     */
    public static ArrayList <Vendas> ListarVendas (Date pInicial,Date pFinal){
       Connection conexao = null;
       PreparedStatement InstrucaoSQL = null;
       ResultSet rs = null;
       ArrayList<Vendas> ListarVenda = new ArrayList<>();
       
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(URL,LOGIN,SENHA);
            
            InstrucaoSQL = conexao.prepareStatement("SELECT * FROM Venda WHERE dataVenda between ? and ?");
            InstrucaoSQL.setDate(1, new java.sql.Date(pInicial.getTime()));
            InstrucaoSQL.setDate(2, new java.sql.Date(pFinal.getTime()));
            
            rs = InstrucaoSQL.executeQuery();
            
            while(rs.next()){
            Vendas vend = new Vendas();
            vend.setIdVenda(rs.getInt("IdVenda"));
            vend.setData(new Date (rs.getDate("dataVenda").getTime()));
            vend.setValorFinal(rs.getFloat("valorTotal"));
            vend.setFKIDCLiente(rs.getInt("IdCliente"));
            ListarVenda.add(vend);
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
        
        return ListarVenda;
    }
    
    /**
     * Método pega os ítens da venda e faz uma lista
     * @param pIdVenda int a ser verificado
     * @return retorna a lista dos itens da venda
     */
    public static ArrayList <itemVenda> ListarItemVenda (int pIdVenda){
       Connection conexao = null;
       PreparedStatement InstrucaoSQL = null;
       ResultSet rs = null;
       ArrayList<itemVenda> ListarItemVenda = new ArrayList<>();
       
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexao = DriverManager.getConnection(URL,LOGIN,SENHA);
            
            InstrucaoSQL = conexao.prepareStatement("SELECT * FROM ItemVenda WHERE IdVenda = ?");
            InstrucaoSQL.setInt(1,pIdVenda);
            
            rs = InstrucaoSQL.executeQuery();
            
            while(rs.next()){
            itemVenda itemV = new itemVenda();
            itemV.setDescricao(rs.getString("descricao"));
            itemV.setQuantidade(rs.getInt("qtd"));
            ListarItemVenda.add(itemV);
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
        
        return ListarItemVenda;
    }
}
