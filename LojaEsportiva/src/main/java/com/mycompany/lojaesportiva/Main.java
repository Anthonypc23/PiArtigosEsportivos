package com.mycompany.lojaesportiva;

import com.mycompany.lojaesportiva.view.TelaPrincipalView;
import com.sun.java.swing.plaf.windows.WindowsLookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;

/**
 * Classe main faz com que a tela principal seja instanciada no padrão windows
 * @author Wesley
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnsupportedLookAndFeelException {
        UIManager.setLookAndFeel(new WindowsLookAndFeel());
        TelaPrincipalView telap = new TelaPrincipalView();
        telap.setVisible(true);
    }
}
