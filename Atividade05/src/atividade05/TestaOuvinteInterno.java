
package atividade05;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class TestaOuvinteInterno {
     static class OuvinteInterno implements ActionListener { 

        @Override
        public void actionPerformed(ActionEvent e) {
            throw new UnsupportedOperationException("actionPerformed disparado..."); 
            
        }
      }
     public static void main(String[] args) {
        OuvinteInterno ouvinte = new OuvinteInterno();
        JButton botao = new JButton(" acorda Thiago ");
        botao.addActionListener(ouvinte);
        JPanel painel = new  JPanel();
         painel.add(botao);
         JFrame janela = new JFrame();
        janela.add (painel);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(300, 200);
        janela.setVisible(true);
        
         
    }
    
}
