package com.mycompany.lojaesportiva.model;

/**
 * Classe pega os dados da venda
 * @author Gabriel
 */
public class Relatorio {
    
    private String periodoInicial;
    private String periodoFinal;

    /**
     * Método cria um construtor vazio
     */
    public Relatorio() {
    }

    public String getPeriodoInicial() {
        return periodoInicial;
    }

    public void setPeriodoInicial(String periodoInicial) {
        this.periodoInicial = periodoInicial;
    }

    public String getPeriodoFinal() {
        return periodoFinal;
    }

    public void setPeriodoFinal(String periodoFinal) {
        this.periodoFinal = periodoFinal;
    }
}
