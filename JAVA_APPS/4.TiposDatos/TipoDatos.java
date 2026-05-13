public class TipoDatos {
    public static void main(String[] args) {
        // TIPOS DE DATOS PRIMITIVOS 
        // Enteros
        byte edad = 35; // 1 byte, rango: -128 a 127
        short NumeroHabitacion = 102 ; // 2 bytes, rango: -32,768 a 32,767
        int salario = 50000; // 4 bytes, rango: -2,147,483,648 a 2,147,483,647
        long distancia = 15000000000L; // 8 bytes, rango: -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
        float precio = 19.99f; // 4 bytes, rango: ±1.4E-45 a ±3.4028235E38
        double peso = 70.5; // 8 bytes, rango: ±4.9E-324 a ±1.7976931348623157E308
        char letra = 'a'; // 2 bytes, rango: '\u0000' a '\uffff'
        System.out.println(letra); // Imprime 'a'
        
        char letra2 = 65; // Representa el carácter 'A' (código ASCII)
        System.out.println(letra2); // Imprime 'A'
        boolean esMayorDeEdad = true; // 1 byte, valores: true o false

        // TIPOS DE DATOS NO PRIMITIVOS (CLASES) - TIPOS DE DATOS DE REFERENCIA
        String nombre = "Juan"; // Clase String, representa una cadena de texto
        int[] numeros = {1, 2, 3, 4, 5}; // Arreglo de enteros\
        String[] usuarios = {"elmer", "betty", "pedro"}; // Arreglo de Strings
    }
}