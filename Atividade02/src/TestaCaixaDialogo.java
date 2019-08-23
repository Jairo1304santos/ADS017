
import java.awt.Frame;
import javax.swing.JDialog;
import javax.swing.JFrame;


public class TestaCaixaDialogo {
    
    public static void main(String[] args) {
           
                    
        JDialog caixaDialogo = new JDialog();
        caixaDialogo.setTitle("Caixa de diálogo");
        //dialogo.setModal(true);
        caixaDialogo.setSize(320,240);
        caixaDialogo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        caixaDialogo.setLocationRelativeTo(null);
        caixaDialogo.setVisible(true);

    }
}
