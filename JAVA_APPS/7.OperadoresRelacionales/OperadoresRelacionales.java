// public es un modificador de acceso que permite que la clase sea accesible desde cualquier parte del programa
// class es una palabra clave que se utiliza para declarar una clase en Java
// OperadoresRelacionales es el nombre de la clase, que es una convención en Java para nombrar las clases con mayúscula inicial
public class OperadoresRelacionales {
    // public es un modificador de acceso que permite que el método sea accesible desde cualquier otro lugar
    // static es un modificador que indica que el método pertenece a la clase en lugar de a una instancia específica de la clase
    // void es el tipo de retorno del método, lo que significa que no devuelve ningún valor
    // main es el nombre del método principal que se ejecuta cuando se inicia el programa
    // String[] args es un parámetro que representa un arreglo de cadenas de texto, que se utiliza para recibir argumentos desde la línea de comandos al ejecutar el programa
    public static void main(String[] args) {
        // OPEREADOR DE IGUALDAD
        int a = 5;
        int b = 5;

        //System es una clase que nos permite imprimir en consola
        // out es un objeto de la clase System que representa la salida estándar (consola)
        // println es un método que imprime el mensaje y luego agrega una nueva línea
        System.out.println("a==b:" + (a == b)); //true
        // OPEREADOR DE DESIGUALDAD
        System.out.println("a!=b:" + (a != b)); //false
        // OPEREADOR DE MAYOR QUE
        System.out.println("a>b:" + (a > b)); //false
        // OPEREADOR DE MENOR QUE
        System.out.println("a<b:" + (a < b)); //false
        // OPEREADOR DE MAYOR O IGUAL QUE
        System.out.println("a>=b:" + (a >= b)); //true
        // OPEREADOR DE MENOR O IGUAL QUE
        System.out.println("a<=b:" + (a <= b)); //true
    }
}
