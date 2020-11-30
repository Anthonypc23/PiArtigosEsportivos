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
    
    public static boolean CadastrarVenda(Date pData,double pValorTotal,int pFKIDCLiente,ArrayList<String[]> pItensVenda){
     
    Vendas venda = new Vendas();
    venda.setData(pData);
    venda.setValorFinal(pValorTotal);
    venda.setFKIDCLiente(pFKIDCLiente);
    
    ArrayList<itemVenda> ListaItemVenda = new ArrayList<itemVenda>();
        
        for (String[] item : pItensVenda) {
            itemVenda itemAdicionar = new itemVenda();
            itemAdicionar.setDescricao(item[0]);
            itemAdicionar.setQuantidade(Integer.parseInt(item[1]));
            itemAdicionar.setTamanho(item[2]);
            itemAdicionar.setValor(Double.parseDouble(item[3]));
            
            ListaItemVenda.add(itemAdicionar);
        }
        
        venda.setListaVenda(ListaItemVenda);
        
  return VendaDAO.CadastrarVenda(venda);  
    }
}
