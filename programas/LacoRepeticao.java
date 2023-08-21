import javax.swing.JOptionPane;

public class LacoRepeticao 
{
    public static void main(String[] args) 
    {
        int total;   //armazena o total de notas
        int media;   //armazena a media das notas
        int nota;    //armazena a nota digitada
        int counter; //indica quantas notas serao digitadas
        int i = 1;   //variavel auxiliar para controle do laco
   
        String strcounter;
        String strnota;
   
        total = 0; // inicializa a variavel total
   
        strcounter = JOptionPane.showInputDialog("Digite a quantidade de notas a serem processadas");
   
        counter = Integer.parseInt(strcounter); //converte de string para inteiro
   
        while ( i <= counter )
        {
          strnota = JOptionPane.showInputDialog("Digite a nota " + i);
   
          nota = Integer.parseInt(strnota);
          total = total + nota;
   
          i = i + 1; 
        }
   
        media = total / counter;
   
        JOptionPane.showMessageDialog(null, "A media das notas digitadas sao " + media, "Classe media", JOptionPane.INFORMATION_MESSAGE);
   
        System.exit (0);

        /*
        while ( nota != -1 )
        {
           nota = Integer.parseInt(strnota);
           total = total + nota;
           strnota = JOptionPane.showInputDialog("Digite a nota ou - 1 para sair");
           nota = Integer.parseInt(strnota);
           counter = counter + 1; //incrementa o contador
        }
    
        DecimalFormat twoDigits = new DecimalFormat("0.00"); 
    
        if ( counter != 0 )
        {
          media = total / counter;
    
        JOptionPane.showMessageDialog(null, "A media das notas digitadas sao " + twoDigits.format(media), "Classe media", JOptionPane.INFORMATION_MESSAGE);
        }
        else
          JOptionPane.showMessageDialog(null, "Nenhuma nota digitada", "Classe media", JOptionPane.INFORMATION_MESSAGE);        

        System.exit (0);          

      */

    }
}
