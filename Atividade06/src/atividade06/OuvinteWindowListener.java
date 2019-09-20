
package atividade06;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;


public class OuvinteWindowListener implements WindowListener {

    @Override
    public void windowOpened(WindowEvent we) {
        System.out.println("Janela Aberta");
    }

    @Override
    public void windowClosing(WindowEvent we) {
         System.out.println("Fechando a Janela ");
         System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent we) {
         System.out.println("Janela Fechada");
         
    }

    @Override
    public void windowIconified(WindowEvent we) {
         System.out.println("Janela Minimizada");
    }

    @Override
    public void windowDeiconified(WindowEvent we) {
         System.out.println("Janela Restaurada");
    }

    @Override
    public void windowActivated(WindowEvent we) {
         System.out.println("Janela Ativa");
    }

    @Override
    public void windowDeactivated(WindowEvent we) {
        System.out.println("Janela Inativa");
    }
    
    
}
