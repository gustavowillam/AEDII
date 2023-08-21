public class Incremento {
    public static void main(String[] args) 
    {
        int c;

        c = 5;
        System.out.println( c ); //imprime 5
        System.out.println( c++ ) ; // imprime 5 entao pos-incrementa
        System.out.println( c ) ; // imprime 6
   
        System.out.println (); // pula uma linha
   
        c = 5; 
        System.out.println ( c ); // imprime 5
        System.out.println( ++c ) ; // pre-incrementa e imprime 6 
        System.out.println( c ) ; // imprime 6
    }
}
