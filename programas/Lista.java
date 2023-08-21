import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

public class Lista 
{
    public static void main(String[] args) 
    {
        List<Integer> numeros = new ArrayList<Integer>();
        int n;  

        for (int i = 1; i <= 5; i++)
        {
            n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número"));
            numeros.add(n);            
        }

        //digite um número para pesquisar 
        n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número para pesquisar"));
        
        if (numeros.contains(n))
        System.out.println(n + " está na lista");

        int posicao = numeros.indexOf(n);
        System.out.println("Posição:  " + posicao);

        //remover elemento da lista 
        if (posicao >= 0)
            numeros.remove(posicao); 

        //imprimindo os elementos da lista 
        System.out.println("Elemntos da lista:  " + numeros);

        //somar os elementos da lista 
        long soma = numeros.stream()
            .mapToLong(Integer::longValue)
            .sum(); 

        System.out.println("Soma dos elemntos da lista usando sum :  " + soma);

        //somar usando laço de repetição
        soma = 0;
        for(int i = 0; i < numeros.size(); i++)
        {
            soma = soma + numeros.get(i);
        }
        System.out.println("Soma dos elemntos da lista usando for :  " + soma);

        //ordenando os elementos da lista 
        Collections.sort(numeros);
        System.out.println("Elemntos da lista ordenado:  " + numeros);

    }
}
