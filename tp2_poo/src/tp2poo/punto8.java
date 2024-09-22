package tp2poo;

public class punto8 {
    public static void main(String[] args) {
    	
        int a = 5;
        int b = 10;
        int c = 2;
        int d = 6;

        System.out.println("Valores iniciales:");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        a += 5;
        b -= 2;
        c *= 3; 
        d /= 2;

        // Mostrar valores después de las operaciones
        System.out.println("\nValores después de aplicar operadores de asignación:");
        System.out.println("a += 5  -> a = " + a);
        System.out.println("b -= 2  -> b = " + b);
        System.out.println("c *= 3  -> c = " + c);
        System.out.println("d /= 2  -> d = " + d);
    }
}