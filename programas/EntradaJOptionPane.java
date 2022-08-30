import javax.swing.JOptionPane;

public class EntradaJOptionPane 
{

    public static void main(String[] args)
    {

        String nome;
        int idade;
        double altura;
    

        nome = JOptionPane.showInputDialog("Digite o nome"); 
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade"));
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite a altura"));

        JOptionPane.showMessageDialog(null, "nome:" + nome, "Titulo", JOptionPane.PLAIN_MESSAGE );
        JOptionPane.showMessageDialog(null, "idade:" + idade, "Titulo", JOptionPane.INFORMATION_MESSAGE );
        JOptionPane.showMessageDialog(null, "altura" + altura, "Titulo", JOptionPane.WARNING_MESSAGE );
    }

}
