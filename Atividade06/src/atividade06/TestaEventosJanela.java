
package atividade06;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.JOptionPane;


public class TestaEventosJanela {
    public static void main(String[] args) {
        Janela janela = new Janela();
        janela.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                JOptionPane.showMessageDialog(janela, "Quer sair da aplicação?");
            }

            @Override
            public void windowOpened(WindowEvent we) {
                JOptionPane.showMessageDialog(janela, "Dica do dia");
            }
            
});
        
        
        
    }
    
}
