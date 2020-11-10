/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.lojaesportiva.model;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;

/**
 *
 * @author rrmat
 */
public class Check {
    
    ArrayList <String> msgErro = new ArrayList<>();
    
    public void ValidNumber (JTextField txt){
        
        try {
            if(txt.getText().trim().equals("")){
                throw new IllegalArgumentException();
            }
            
            int conversao = Integer.parseInt(txt.getText());
        } catch (NumberFormatException e) {
            msgErro.add("Falha na conversão do campo " + txt.getName());
            txt.setBackground(Color.yellow);
            txt.setText("");
        } catch(IllegalArgumentException e){
            msgErro.add("Não foi preenchido o campo " + txt.getName());
            txt.setBackground(Color.yellow);
        }
        
    }
    
    public void ValidSex(ButtonGroup btn ){
        
        try {
            String sex = btn.getSelection().getActionCommand();
        } catch (Exception e) {
            msgErro.add("Você não selecionou um sexo");
        }
        
    }
    
    
    public void validNasc(JFormattedTextField txt){
        if(txt.getText().trim().equals("")){
            msgErro.add("Não foi preenchido o campo " + txt.getName());
            txt.setBackground(Color.yellow);
        }
    }
    
    public void ValidVoid (JPasswordField  txt){
       char[] senhac = txt.getPassword();
       String Senha = String.valueOf(senhac);
      
        if(Senha.trim().equals("")){
            msgErro.add("Não foi preenchido o campo " + txt.getName());
            txt.setBackground(Color.yellow);
        }else  
        if(Senha.trim().length()<6){
           msgErro.add("Você não Completou o campo " + txt.getName());
           txt.setBackground(Color.yellow);
        }    
        
    }
    
    public void ValidVoid (JTextField txt){
        if(txt.getText().trim().equals("")){
            msgErro.add("Não foi preenchido o campo " + txt.getName());
            txt.setBackground(Color.yellow);
        }
    }
    
    public void Validsize(JTextField txt){
        if(txt.getText().trim().length()<11){
           msgErro.add("Você não Completou o campo " + txt.getName());
           txt.setBackground(Color.yellow);
        }
    }
    
   
    
    
    public void clearMSG(){
     
         this.msgErro.clear();
     }
    
    public String getMsgErro(){
        String erros = "";
        for(String msg : msgErro){
            erros += msg + "\n";
        }
        
        if(!erros.equals("")){
            clearMSG();
        }
        
        return erros;
    }
    
    public boolean temErro(){
        if(msgErro.size()>0){
            return true;
        }else
            
             return false; 
    }
   
}
