package com.mycompany.lojaesportiva.controller;

import com.mycompany.lojaesportiva.DAO.VendaDAO;
import com.mycompany.lojaesportiva.model.Vendas;
import com.mycompany.lojaesportiva.model.itemVenda;
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
}
