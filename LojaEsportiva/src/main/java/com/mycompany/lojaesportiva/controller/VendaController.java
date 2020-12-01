package com.mycompany.lojaesportiva.controller;

import com.mycompany.lojaesportiva.DAO.VendaDAO;
import com.mycompany.lojaesportiva.model.Vendas;
import com.mycompany.lojaesportiva.model.itemVenda;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Classe faz toda a manipulação com os dados da venda
 * @author Anthony
 */
public class VendaController {
    
    /**
     * Método pega todos os dados, altera a model e chama a função da DAO
     * @param pData date a ser verificada
     * @param pValorTotal float a ser verificado
     * @param pFKIDCLiente int a ser verificado
     * @param pItensVenda arrayList a ser verificada
     * @return boolean true: retorna a classe DAO | false: erro no cadastro
     */
    public static boolean CadastrarVenda(Date pData,float pValorTotal,int pFKIDCLiente,ArrayList<String[]> pItensVenda) throws SQLException, SQLException{
    Vendas venda = new Vendas();
    venda.setData(pData);
    venda.setValorFinal(pValorTotal);
    venda.setFKIDCLiente(pFKIDCLiente);
    
    ArrayList<itemVenda> ListaItemVenda = new ArrayList<itemVenda>();
        
        for (String[] item : pItensVenda) {
            itemVenda itemAdicionar = new itemVenda();
            itemAdicionar.setIdProduto(Integer.parseInt(item[0]));
            itemAdicionar.setDescricao(item[1]);
            itemAdicionar.setQuantidade(Integer.parseInt(item[2]));
            itemAdicionar.setTamanho(item[3]);
            itemAdicionar.setValor(Float.parseFloat(item[4]));
            ListaItemVenda.add(itemAdicionar);
        }
        
        venda.setListaVenda(ListaItemVenda);
        
    return VendaDAO.CadastrarVenda(venda);  
    }
    
    /**
     * Método pega os dados e faz uma lista
     * @param pInicial date a ser verificada
     * @param pFinal date a ser verificada
     * @return retorna a lista da venda
     */
    public static ArrayList<String[]> ListarVenda(Date pInicial, Date pFinal){
            ArrayList <Vendas> ListarVenda = VendaDAO.ListarVendas(pInicial, pFinal);
            ArrayList <String[]> ListaVendaRetorno = new ArrayList<>();
            SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
            
            for (Vendas vend : ListarVenda) {
                ListaVendaRetorno.add(new String []{String.valueOf(vend.getIdVenda()),
                                                      String.valueOf(vend.getFKIDCLiente()),
                                                      String.valueOf(formatador.format(vend.getData())),
                                                      String.valueOf(vend.getValorFinal())});
                
            }
            
        return ListaVendaRetorno; 
    }
    
    /**
     * Método pega os ítens da venda e faz uma lista
     * @param pIdVenda int a ser verificado
     * @return retorna a lista dos itens da venda
     */
    public static ArrayList<String[]> ListarItemVenda(int pIdVenda){
            ArrayList <itemVenda> ListarItemVenda = VendaDAO.ListarItemVenda(pIdVenda);
            ArrayList <String[]> ListaVendaRetorno = new ArrayList<>();
            
            for (itemVenda ItemValor : ListarItemVenda) {
                ListaVendaRetorno.add(new String []{String.valueOf(ItemValor.getDescricao()),
                                                      String.valueOf(ItemValor.getQuantidade())});
            }
            
        return ListaVendaRetorno; 
    }
}
