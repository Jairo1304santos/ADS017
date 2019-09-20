
package atividade06;


import javax.swing.JFrame;


public class TestaWindowListener {
    public static void main(String[] args) {
       OuvinteWindowListener ouvinte = new OuvinteWindowListener();
       JFrame janela = new JFrame();
       janela.addWindowListener(ouvinte);
       janela.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
       janela.setSize(300, 200);
       janela.setVisible(true);
       
     }
}
