/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lojaesportiva.controller;

import com.mycompany.lojaesportiva.DAO.VendaDAO;
import static com.mycompany.lojaesportiva.controller.VendaController.CadastrarVenda;
import com.mycompany.lojaesportiva.model.Vendas;
import java.util.Date;

/**
 *
 * @author rrmat
 */
public class VendaController {
    
    public static boolean CadastrarVenda(Date pData,double pValorTotal,int pFKIDCLiente){
     
    Vendas venda = new Vendas();
    venda.setData(pData);
    venda.setValorFinal(pValorTotal);
    venda.setFKIDCLiente(pFKIDCLiente);
        
  return VendaDAO.CadastrarVenda(venda);  
    }
}
