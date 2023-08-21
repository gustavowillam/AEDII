import javax.swing.JOptionPane;

public class Funcao
{
    public static void main(String[] args) 
    {
        long number, result;
        String strnumber; 
        //calcula o fatorial de um numero digitado pelo usuario
  
        strnumber = JOptionPane.showInputDialog("Digite um numero");
        number = Integer.parseInt(strnumber); 
        result = fatorial(number); 
        //result = fatorial_recursivo(number); 
        JOptionPane.showMessageDialog(null, "Fatorial  de " + number + " é: " + result, "Fatorial" , JOptionPane.INFORMATION_MESSAGE);
  
    }


   //definicao do metodo fatorial recursivo 
   public static long fatorial( long num)
   {
      long fat = 1; 
      for (int i = 1; i <= num; i++ )
      {
          fat = fat * i; 
      }
      return fat; 
   }

    //definicao do metodo fatorial recursivo 
   public static long fatorial_recursivo( long num)
   {
      if (num <= 1 )
        return 1;
      else
        return num * fatorial_recursivo (num -1); 
   }


}
