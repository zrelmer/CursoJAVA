// ENTRADA DE DATOS EN JAVA
// IMPORTAMOS LA CLASE SCANNER PARA LEER DATOS DESDE EL TECLADO
import java.util.Scanner;

public class EntradaDatos {
    public static void main(String[] args) {
        // lo primero que hacemos es crear un objeto de la clase Scanner
        // se usa System.in para indicar que queremos leer desde el teclado
        // Entrada es el nombre del objeto que vamos a usar para leer los datos
        // new Scanner(System.in) es el constructor de la clase Scanner que nos permite crear un nuevo objeto Scanner que lee desde el teclado
        Scanner Entrada = new Scanner(System.in);

        // creamos dos variables para almacenar el nombre y la edad del usuario
        String nombre;
        String ciudad;
        int edad;

        System.out.println("Ingresa tu nombre:");
        // usamos el método nextLine() del objeto Entrada para leer una línea de texto desde el teclado y almacenarla en la variable nombre
        nombre = Entrada.nextLine();

        System.out.println("Ingresa tu edad:");
        edad = Entrada.nextInt();
        // después de leer un número con nextInt(), es necesario consumir el salto de línea que queda en el buffer de entrada para evitar problemas al leer la siguiente línea de texto con nextLine()

        // el buffer es una zona de memoria donde se almacenan temporalmente los datos que se van a procesar. Cuando se lee un número con nextInt(), el salto de línea que se genera al presionar Enter queda en el buffer, lo que puede causar problemas al leer la siguiente línea de texto con nextLine() porque nextLine() leería ese salto de línea en lugar de la entrada del usuario. Para evitar esto, se llama a nextLine() después de nextInt() para consumir ese salto de línea y permitir que la siguiente llamada a nextLine() funcione correctamente.
        
        Entrada.nextLine();

        System.out.println("Ingresa tu ciudad:");
        ciudad = Entrada.nextLine();

        // imprimimos un mensaje de bienvenida utilizando la información proporcionada por el usuario
        System.out.println("Hola " + nombre + ", tienes " + edad + " años y vives en " + ciudad + ".");

        // mostramos el nombre, la edad y la ciudad del usuario
        // se finaliza el script utilizando el método close() del objeto Entrada para liberar los recursos asociados con el objeto Scanner
        Entrada.close();

    }
}