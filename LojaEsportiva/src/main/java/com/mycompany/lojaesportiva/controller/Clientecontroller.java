package com.mycompany.lojaesportiva.controller;

import com.mycompany.lojaesportiva.DAO.ClienteDAO;
import com.mycompany.lojaesportiva.model.Cliente;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Classe faz toda a manipulação dos dados do cliente
 * @author Anthony
 */
public class Clientecontroller {
    
    /**
     * Método pega todos os dados, altera a model e chama a função da DAO
     * @param pnome string a ser verificada
     * @param pemail string a ser verificada
     * @param pcpf string a ser verificada
     * @param pnascimento string a ser verificada
     * @param psexo string a ser verificada
     * @param pestadocivil string a ser verificada
     * @param ptelefone string a ser verificada
     * @param pendereco string a ser verificada
     * @return boolean true: retorna a classe DAO | false: erro no cadastro
     * @throws SQLException lança para fora a exceção
     */
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
    
    /**
     * Método pega os dados e faz uma lista
     * @param pnome string a ser verificada
     * @param pCPF string a ser verificada
     * @return retorna a lista do cliente
     */
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
    
    /**
     * Método verifica o id do cliente e cria um vetor
     * @param IdCliente int a ser verificado
     * @return string[] retorna um vetor com os clientes
     */
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
    
    /**
     * Método resgata os dados e faz a alteração
     * @param pnome string a ser verificada
     * @param pemail string a ser verificada
     * @param pcpf string a ser verificada
     * @param pnascimento string a ser verificada
     * @param psexo string a ser verificada
     * @param pestadocivil string a ser verificada
     * @param ptelefone string a ser verificada
     * @param pendereco string a ser verificada
     * @param IdCLiente string a ser verificada
     * @return boolean true: retorna a classe DAO | false: erro ao alterar
     * @throws SQLException lança para fora a exceção
     */
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
    
    /**
     * Método pega o id do cliente e chama a função DAO
     * @param pID int a ser verificado
     * @return boolean true: retorna a classe DAO | false: erro na exclusão
     * @throws SQLException lança para fora a exceção
     */
    public static boolean Excluir(int pID) throws SQLException{
        Cliente cli = new Cliente();
        cli.setIdCliente(pID);
        
        return ClienteDAO.Excluir(pID);
    }
    
    /**
     * Método verifica o CPF do cliente e chama a função DAO
     * @param CPF string a ser verificado
     * @return int retorna o id do cliente
     */
    public static int ConsultaCPF(String CPF){
        Cliente cli = ClienteDAO.ConsultaCPF(CPF);
        int ClienteRetorno = cli.getIdCliente();
           
        return ClienteRetorno;
    }
}
