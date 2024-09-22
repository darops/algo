package tp2poo;
import java.util.Scanner;

public class punto6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el valor del radio del círculo (entre -128 y 127): ");
        byte radio = scanner.nextByte();
        double area = Math.PI * Math.pow(radio, 2);
        System.out.println("El área del círculo es: " + area);
    }
}