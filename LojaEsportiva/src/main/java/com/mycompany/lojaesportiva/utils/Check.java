package com.mycompany.lojaesportiva.utils;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.ButtonGroup;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JPasswordField;

/**
 * Classe para validar os campos e dados do sistema
 * @author Anthony
 */
public class Check {
    
    ArrayList <String> msgErro = new ArrayList<>();
    
    /**
     * Método resgata o valor do txt e converte para double
     * @param txt string a ser convertida
     */
    public void ValidNumber (JTextField txt){
        try {
            if(txt.getText().trim().equals("")){
                throw new IllegalArgumentException();
            }
            
            double conversao = Double.parseDouble(txt.getText());
        } catch (NumberFormatException e) {
            msgErro.add("Falha na conversão do campo " + txt.getName());
            txt.setBackground(Color.yellow);
            txt.setText("");
        } catch(IllegalArgumentException e){
            msgErro.add("Não foi preenchido o campo " + txt.getName());
            txt.setBackground(Color.yellow);
        }
    }
    
    /**
     * Método verifica se o botão foi selecionado
     * @param btn botão a ser verificado
     */
    public void ValidSex(ButtonGroup btn ){
        try {
            String sex = btn.getSelection().getActionCommand();
        } catch (Exception e) {
            msgErro.add("Você não selecionou um sexo!");
        }
    }
    
    /**
     * Método verifica se o campo formatado foi preenchido
     * @param txt string a ser verificado
     */
    public void validNasc(JFormattedTextField txt){
        if(txt.getText().trim().equals("")){
            msgErro.add("Não foi preenchido o campo " + txt.getName());
            txt.setBackground(Color.yellow);
        }
    }
    
    /**
     * Método verifica se o campo foi preenchido ou se está incompleto
     * @param txt string a ser verificada
     */
    public void ValidVoid (JPasswordField  txt){
       char[] senhac = txt.getPassword();
       String Senha = String.valueOf(senhac);
      
        if(Senha.trim().equals("")){
            msgErro.add("Não foi preenchido o campo " + txt.getName());
            txt.setBackground(Color.yellow);
        }else  
        if(Senha.trim().length()<6){
           msgErro.add("Você não completou o campo " + txt.getName());
           txt.setBackground(Color.yellow);
        }    
    }
    
    /**
     * Método verifica se o campo foi preenchido
     * @param txt string a ser verificada
     */
    public void ValidVoid (JTextField txt){
        if(txt.getText().trim().equals("")){
            msgErro.add("Não foi preenchido o campo " + txt.getName());
            txt.setBackground(Color.yellow);
        }
    }
    
    /**
     * Método verifica se o campo foi preenchido completamente
     * @param txt string a ser verificada
     */
    public void Validsize(JTextField txt){
        if(txt.getText().trim().length()<11){
           msgErro.add("Você não completou o campo " + txt.getName());
           txt.setBackground(Color.yellow);
        }
    }
    
    /**
     * Método verifica se o campo foi selecionado
     * @param i int a ser verificado
     */
    public void ValidCBO(int i){
        if(i == 0){
         msgErro.add("Você não selecionou um Estado Civil!");   
        }
    }
    
    /**
     * Método verifica a mensagem de erro
     */
    public void clearMSG(){
        this.msgErro.clear();
    }
    
    /**
     * Método mostra a mensagem de erro
     * @return String retorna a mensagem
     */
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
    
    /**
     * 
     * @return boolean true: se tem erro | false: se não tem erro
     */
    public boolean temErro(){
        if(msgErro.size()>0){
            return true;
        }else
            
        return false; 
    }
}
