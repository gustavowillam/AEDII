import java.util.Scanner; 

public class EntradaScanner
{
   public static void main(String[] args)
   {
      Scanner ler = new Scanner(System.in);    

      int idade;
      double altura;
      String nome;

      System.out.println("Informe o nome: "); 
      nome = ler.next(); 

      System.out.println("Informe a idade: ");
      idade = ler.nextInt();

      System.out.println("Informe a altura: "); 
      altura = ler.nextDouble(); 

      System.out.println("Nome  : " + nome   + "\n");
      System.out.println("Idade : " + idade  + "\n");
      System.out.println("Altura: " + altura + "\n");

   }

}
