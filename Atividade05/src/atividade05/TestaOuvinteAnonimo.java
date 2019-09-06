
package atividade05;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


public class TestaOuvinteAnonimo {
    public static void main(String[] args) {
        JButton botao = new JButton(" acorda Thiago ");
        botao.addActionListener(new ActionListener() { public void actionPerformed(ActionEvent e) { } });
        
    }
    
}
