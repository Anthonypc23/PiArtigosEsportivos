
package com.mycompany.lojaesportiva.controller;

import com.mycompany.lojaesportiva.DAO.ClienteDAO;
import com.mycompany.lojaesportiva.model.Cliente;
import java.sql.SQLException;
import java.util.ArrayList;

public class Clientecontroller {
    
    public static boolean Cadastrar(String pnome,String pemail, String psenha,String pcpf,String pnascimento, String psexo, String pestadocivil, String ptelefone, String pendereco) throws SQLException {
        Cliente cli = new Cliente();
        cli.setNome(pnome);
        cli.setEmail(pemail);
        cli.setSenha(psenha);
        cli.setCPF(pcpf);
        cli.setNascimento(pnascimento);
        cli.setSexo(psexo);
        cli.setEstadoCivil(pestadocivil);
        cli.setTelefone(ptelefone);
        cli.setEndereço(pendereco);
    
        return ClienteDAO.Cadastrar(cli);
    }
    
    public static ArrayList<String[]> ListarCLiente(String pnome,String pCPF){
        
            ArrayList <Cliente> ListaCliente = ClienteDAO.ListarCliente(pnome, pCPF);
            ArrayList <String[]> ListaClienteRetorno = new ArrayList<>();
            for (Cliente cli : ListaCliente) {
                ListaClienteRetorno.add(new String []{String.valueOf(cli.getIdCliente()),
                                                      cli.getNome(),
                                                      cli.getEmail(),
                                                      cli.getSenha(),
                                                      cli.getCPF(),
                                                      cli.getNascimento(),
                                                      cli.getSexo(),
                                                      cli.getEstadoCivil(),
                                                      cli.getTelefone(),
                                                      cli.getEndereço()});
                
            }
            return ListaClienteRetorno; 
          
    }
    
    public static String[] CLienteID(int IdCliente){
    
        Cliente cli = ClienteDAO.ClienteId(IdCliente);
        String [] ClienteRetorno = null;
        
        if(cli.getIdCliente()>0){
           ClienteRetorno = new String []{String.valueOf(cli.getIdCliente()),
                                            cli.getNome(),
                                            cli.getEmail(),
                                            cli.getSenha(),
                                            cli.getCPF(),
                                            cli.getNascimento(),
                                            cli.getSexo(),
                                            cli.getEstadoCivil(),
                                            cli.getTelefone(),
                                            cli.getEndereço()};   
        }
        
        
        return ClienteRetorno;
    }
    
    public static boolean Alterar(String pnome,String pemail, String psenha,String pcpf,String pnascimento, String psexo, String pestadocivil, String ptelefone, String pendereco, int IdCLiente ) throws SQLException {
        Cliente cli = new Cliente();
        cli.setIdCliente(IdCLiente);
        cli.setNome(pnome);
        cli.setEmail(pemail);
        cli.setSenha(psenha);
        cli.setCPF(pcpf);
        cli.setNascimento(pnascimento);
        cli.setSexo(psexo);
        cli.setEstadoCivil(pestadocivil);
        cli.setTelefone(ptelefone);
        cli.setEndereço(pendereco);
    
        return ClienteDAO.Alterar(cli);
    }
}
