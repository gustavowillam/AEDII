import javax.swing.JOptionPane;

public class Arranjo {
    public static void main(String[] args) 
    {
        int  numeros[];  //definição do vetor 
        numeros = new int[100];  //alocação de memoria para o vetor 

        //numeros = new int [100];   //definição e alocação direta 

        //int numeros[]  = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};  //definir e já alocar os valores 

        //int[] numeros2 = {32, 27, 64, 18, 95, 14, 90, 70, 60, 37};  //outra forma de definir e aloar os valores 
 

        for ( int i = 0; i < numeros.length; i++ )
            numeros [ i ] = 2 * i;   //prenchimento automatico 

        System.out.println("Elemento    Valor");
        // Exibindo os elementos do array                    
        for ( int j = 0; j < numeros.length; j++ )          
           System.out.println(j + "           " + numeros[j]);    
        
        //pesquisa no array   
        String searchKey = JOptionPane.showInputDialog(null, "Digite um número para pesquisar");

        int posicao = linearSearch ( numeros, Integer.parseInt( searchKey ) );

        if ( posicao != -1 )
            System.out.println("Valor encontrado na posição: " + posicao);
        else
            System.out.println ( "Valor nao encontrado" );            
  
    }

    public static int linearSearch ( int array[], int key )
    {
       for ( int n = 0; n < array.length; n++ )
         if ( array[n] == key )
            return n; 

       return -1; 
    }    


}
