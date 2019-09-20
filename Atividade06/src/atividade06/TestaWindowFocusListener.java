
package atividade06;

import java.awt.event.WindowFocusListener;
import javax.swing.JFrame;


public class TestaWindowFocusListener {
    public static void main(String[] args) {
        OuvinteWindowFocusListener ouvinte = new OuvinteWindowFocusListener();
        
        JFrame janela = new JFrame();
        janela.addWindowFocusListener((WindowFocusListener) ouvinte);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(500, 400);
        janela.setVisible(true);
       
    }
    
}
