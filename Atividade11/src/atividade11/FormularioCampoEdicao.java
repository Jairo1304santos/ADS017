
package atividade11;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;


public class FormularioCampoEdicao extends JFrame{
    
    JButton botaoAdicionar = new JButton();
    JTextField campoTexto = new JTextField();
    JTextArea areaTexto = new JTextArea();

    public FormularioCampoEdicao() throws HeadlessException {
        botaoAdicionar = new JButton("Adicionar");
        campoTexto = new JTextField(20);
        areaTexto = new JTextArea(20, 5);
        areaTexto.setEditable(false);
        areaTexto.setLineWrap(true);
        areaTexto.setWrapStyleWord(true);
        
        JScrollPane painelRolagem = new JScrollPane();
        painelRolagem.setViewportView(areaTexto);
        
        JLabel rotulo = new JLabel("Digite um texto:");
        
        JPanel painel = new JPanel();
        painel.add(botaoAdicionar);
        
        botaoAdicionar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                areaTexto.append(campoTexto.getText());
                campoTexto.setText("");
            }
        });
        
        JPanel painelPrincipal = new JPanel(new GridLayout(5, 1));
        painelPrincipal.add(rotulo);
        painelPrincipal.add(campoTexto);
        painelPrincipal.add(painelRolagem);
        add(painelPrincipal);
        add(painel, BorderLayout.SOUTH);
        setSize(640, 480);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        
        
    }
    
    
    
}
