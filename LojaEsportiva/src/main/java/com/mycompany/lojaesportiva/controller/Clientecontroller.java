
package com.mycompany.lojaesportiva.controller;

import com.mycompany.lojaesportiva.DAO.ClienteDAO;
import com.mycompany.lojaesportiva.model.Cliente;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Clientecontroller {
    
    public static boolean Cadastrar(String pnome,String pemail,String pcpf,Date pnascimento, String psexo, String pestadocivil, String ptelefone, String pendereco) throws SQLException {
        Cliente cli = new Cliente();
        cli.setNome(pnome);
        cli.setEmail(pemail);
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
            
            SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
            
            for (Cliente cli : ListaCliente) {
                ListaClienteRetorno.add(new String []{String.valueOf(cli.getIdCliente()),
                                                      cli.getNome(),
                                                      cli.getEmail(),
                                                      cli.getCPF(),
                                                      String.valueOf(formatador.format(cli.getNascimento())),
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
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        if(cli.getIdCliente()>0){
           ClienteRetorno = new String []{String.valueOf(cli.getIdCliente()),
                                            cli.getNome(),
                                            cli.getEmail(),
                                            cli.getCPF(),
                                            String.valueOf(formatador.format(cli.getNascimento())),
                                            cli.getSexo(),
                                            cli.getEstadoCivil(),
                                            cli.getTelefone(),
                                            cli.getEndereço()};   
        }
        
        return ClienteRetorno;
    }
    
    public static boolean Alterar(String pnome,String pemail,String pcpf,Date pnascimento, String psexo, String pestadocivil, String ptelefone, String pendereco, int IdCLiente ) throws SQLException {
        Cliente cli = new Cliente();
        cli.setIdCliente(IdCLiente);
        cli.setNome(pnome);
        cli.setEmail(pemail);
        cli.setCPF(pcpf);
        cli.setNascimento(pnascimento);
        cli.setSexo(psexo);
        cli.setEstadoCivil(pestadocivil);
        cli.setTelefone(ptelefone);
        cli.setEndereço(pendereco);
    
        return ClienteDAO.Alterar(cli);
    }
    
    public static boolean Excluir(int pID) throws SQLException{
        Cliente cli = new Cliente();
        
        cli.setIdCliente(pID);
        
        return ClienteDAO.Excluir(pID);
    }
}
