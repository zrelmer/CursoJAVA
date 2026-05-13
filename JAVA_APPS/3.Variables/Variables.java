public class Variables {
    public static void main(String[] args) {
        int a, b, c; // declaración de varias variables del mismo tipo
        String x = "Hola", y = "Mundo"; // declaración e inicialización de varias variables del mismo tipo
        String nombre2;

        /* Sintaxis de Declaración de variables 
        TIPO DE DATO NOMBREVARIABLE OPERADOR DE ASIGNACION DATO QUE SE ALMACENARA
        */
        // entero edad = 30;
        // longitud de int es de 4 bytes y el rango es de -2,147,483,648 a 2,147,483,647
        int edad = 30; // ejemplo de ubicación en memoria 10005542d
        // longitud de string es de 2 bytes por caracter y el rango es de 0 a 65,535 caracteres
        String nombre = "Elmer"; // ejemplo de ubicación en memoria 10005543d
        // char es de 2 bytes y el rango es de 0 a 65,535 caracteres
        char letra = 'A'; // ejemplo de ubicación en memoria 10005544d
        char letra2 = 65; // ejemplo de ubicación en memoria 10005545d

        System.out.println("Valor de letra2: " + letra2); // esto imprimirá 'A' porque el valor 65 corresponde a 'A' en la tabla ASCII
        // boolean es de 1 byte y el rango es de true o false
        boolean MayorEdad = true; // ejemplo de ubicación en memoria 10005545d
        // float es de 4 bytes y el rango es de -3.4028235E+38 a 3.4028235E+38
        float estatura = 1.75f; // ejemplo de ubicación en memoria 10005546d
        // double es de 8 bytes y el rango es de -1.7976931348623157E+308 a 1.7976931348623157E+308
        double peso = 70.5; // ejemplo de ubicación en memoria 10005547d

        nombre2 = "Juan"; // asignación de valor a una variable previamente declarada

        a = 10;
        b = 20;
        c = 30;

        // sout


        // NUEVA FORMA DE DECLARAR VARIABLES CON VAR (A PARTIR DE JAVA 10)
        var edad2 = 25; // el tipo de dato se infiere automáticamente
        var nombre3 = "Maria"; // el tipo de dato se infiere automáticamente
        // var letra2 = 'B'; // el tipo de dato se infiere automáticamente
        var MayorEdad2 = false; // el tipo de dato se infiere automáticamente

        System.out.println("Edad: " + edad);

        
    }

    
}