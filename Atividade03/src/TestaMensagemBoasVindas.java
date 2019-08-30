
import javax.swing.JOptionPane;

public class TestaMensagemBoasVindas {

    public static void main(String[] args) {
        int opcao = JOptionPane.showConfirmDialog(null, "Deseja iniciar o programa?", "Confirmação", JOptionPane.YES_NO_OPTION);
        if (opcao == JOptionPane.YES_OPTION) {
            String nome = JOptionPane.showInputDialog(null, "Informe seu nome");
            if (nome != null) {
                JOptionPane.showMessageDialog(null, "Bem vindo" + nome, "Aviso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "NOme náo Informado!", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showInternalMessageDialog(null, "O programa foi encerrado.", "Alerta", JOptionPane.WARNING_MESSAGE);

        }

    }

}
