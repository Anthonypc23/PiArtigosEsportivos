package com.mycompany.lojaesportiva.controller;

import com.mycompany.lojaesportiva.DAO.ClienteDAO;
import com.mycompany.lojaesportiva.DAO.VendaDAO;
import com.mycompany.lojaesportiva.model.Cliente;
import com.mycompany.lojaesportiva.model.Vendas;
import com.mycompany.lojaesportiva.model.itemVenda;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author rrmat
 */
public class VendaController {
    
    public static boolean CadastrarVenda(Date pData,float pValorTotal,int pFKIDCLiente,ArrayList<String[]> pItensVenda){
     
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
