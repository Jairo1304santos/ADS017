
import javax.swing.JDialog;
import javax.swing.JFrame;

public class TestaModoExibicao {

    public static void main(String[] args) {
        JFrame janela = new JFrame();
        janela.setSize(640, 480);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);

        JDialog caixaDialogo = new JDialog(janela,false);
        caixaDialogo.setTitle("Caixa dialogo");
        caixaDialogo.setSize(320, 240);
       caixaDialogo.setVisible(true);

    }

}
