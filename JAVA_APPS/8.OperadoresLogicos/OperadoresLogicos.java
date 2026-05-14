public class OperadoresLogicos {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;

        System.out.println("a==b:" + (a == b)); //true
        // no es un operador lógico que invierte el resultado de la comparación
        System.out.println("!(a==b):" + !(a == b)); //false

        // && es un operador lógico que devuelve true si ambas condiciones son verdaderas
        System.out.println("(a==b) && (a>0):" + ((a == b) && (a > 0))); //true
        System.out.println("(a==b) && (a>b):" + ((a == b) && (a > b))); //false
        System.out.println("(a==b) && (b<0):" + ((a < 0) && (b > 0))); //false
        System.out.println("(a!=b) && (b<0):" + ((a != b) && (b < 0))); //false

        // || es un operador lógico que devuelve true si al menos una de las condiciones es verdadera
        System.out.println("(a==b) || (a>0):" + ((a == b) || (a > 0))); //true
        System.out.println("(a==b) || (a>b):" + ((a == b) || (a > b))); //true
        System.out.println("(a==b) || (b<0):" + ((a == b) || (b < 0))); //true
        System.out.println("(a!=b) || (b<0):" + ((a != b) || (b < 0))); //false

        // combinación de operadores lógicos
        System.out.println("((a==b) && !(a>0)) || (b<0):" + (((a == b) && !(a > 0)) || (b < 0))); //false


        /*
        
        (true && FALSE) = false || false = false
        (true && TRUE) = true || false = true
        
        
        */
        
    }
}
