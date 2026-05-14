public class Asignacion {
    
    public static void main(String[] args) {
        int a = 10;
        int b = 5;

        a = a + b; // a = 10 + 5 = 15 // a ahora es 15
        a += b; // a = a + b = 15 + 5 = 20 // a ahora es 20

        a = a - b; // a = 20 - 5 = 15 // a ahora es 15
        a -= b; // a = a - b = 15 - 5 = 10 // a ahora es 10

        a = a * b; // a = 10 * 5 = 50 // a ahora es 50
        a *= b; // a = a * b = 50 * 5 = 250 // a ahora es 250

        a = a / b; // a = 250 / 5 = 50 // a ahora es 50
        a /= b; // a = a / b = 50 / 5 = 10 // a ahora es 10

        a = a % b; // a = 10 % 5 = 0 // a ahora es 0
        a %= b; // a = a % b = 0 % 5 = 0 // a ahora es 0



    }
}
