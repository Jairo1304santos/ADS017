
package atividade06;

import java.awt.event.WindowFocusListener;
import javax.swing.JFrame;


public class TestaWindowStateListener {
    public static void main(String[] args) {
        OuvinteWindowStateListener ouvinte = new OuvinteWindowStateListener();
        JFrame janela = new JFrame();
        janela.addWindowStateListener(ouvinte);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(500, 300);
        janela.setVisible(true);
        
    }
    
}
