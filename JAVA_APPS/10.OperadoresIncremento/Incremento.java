public class Incremento {

    public static void main(String[] args) {
        // int a = 1;
        // int b  = 2;


        // post-incremento
        // System.out.println(a++);
        // System.out.println(b++);

        // pre-incremento
        // System.out.println(++a);
        // System.out.println(++b);

        // ejemplo de post-incremento en un ciclo for
        // el valor de i se muestra antes de ser incrementado
        // for (int i = 6; i <=5; i++) {  //5 a 6
        //     System.out.println(1);
        //     System.out.println(2);
        //     System.out.println(3);
        //     System.out.println(4);
        //     System.out.println(5);
        // }
        

        // ejemplo de pre-incremento en un ciclo for
        // el valor de i se muestra después de ser incrementado
        for (int i = 1; i <= 5; ++i) {
            System.out.println(1);
            System.out.println(2);
            System.out.println(3);
            System.out.println(4);
            System.out.println(5);
        }

        // int a = 5;
        // int b = 5;

        // System.out.println(a++); // Imprime 5 (Aumenta a 6 después de imprimir)
        // System.out.println(a);   // Imprime 6 (Valor actual de a)
        // System.out.println(++b); // Imprime 6 (Aumenta a 6 antes de imprimir)

    }
    
}
