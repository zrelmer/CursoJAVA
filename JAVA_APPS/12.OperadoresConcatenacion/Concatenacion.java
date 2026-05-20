public class Concatenacion {

    public static void main(String[] args) {
        String nombre = "Juan";
        String apellido = "Perez";
        int edad = 30;

        // Concatenación utilizando el operador +
        String mensaje1 = "Hola, mi nombre es " + nombre + " " + apellido + " y tengo " + edad + " anyos.";
        System.out.println(mensaje1);

        // Concatenación utilizando el método concat()
        String mensaje2 = "Hola, mi nombre es ".concat(nombre).concat(" ").concat(apellido).concat(" y tengo ").concat(String.valueOf(edad)).concat(" anyos.");
        System.out.println(mensaje2);
    }
    
}
