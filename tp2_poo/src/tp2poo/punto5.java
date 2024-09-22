package tp2poo;
public class punto5 {
    public static void main(String[] args) {
        int a = 8;
        int b = 3;
        int c = -5;

        // a) a + b + c
        int resultA = a + b + c;

        // b) 2 * b + 3 * (a – c)
        int resultB = 2 * b + 3 * (a - c);

        // c) a / b
        double resultC = (double) a / b;

        // d) a % b
        int resultD = a % b;

        // e) a / c
        double resultE = (double) a / c;

        // f) a % c
        int resultF = a % c;

        // g) a * b / c
        double resultG = (double) (a * b) / c;

        // h) a * (b / c)
        double resultH = a * ((double) b / c);

        // i) (a * c) % b
        int resultI = (a * c) % b;

        // j) a * (c % b)
        int resultJ = a * (c % b);

        // k) (3 * a – 2 * b) % (2 * a – c)
        int resultK = (3 * a - 2 * b) % (2 * a - c);

        // l) 2 * ( a / 5 + (4 - b * 3)) % (a + c - 2)
        int resultL = 2 * (a / 5 + (4 - b * 3)) % (a + c - 2);

        // m) (a - 3 * b) % (c + 2 * a) / (a - c)
        double resultM = ((a - 3 * b) % (c + 2 * a)) / (double) (a - c);

        // n) a - b - c * 2
        int resultN = a - b - c * 2;

        // Mostrar los resultados
        System.out.println("a) " + resultA);
        System.out.println("b) " + resultB);
        System.out.println("c) " + resultC);
        System.out.println("d) " + resultD);
        System.out.println("e) " + resultE);
        System.out.println("f) " + resultF);
        System.out.println("g) " + resultG);
        System.out.println("h) " + resultH);
        System.out.println("i) " + resultI);
        System.out.println("j) " + resultJ);
        System.out.println("k) " + resultK);
        System.out.println("l) " + resultL);
        System.out.println("m) " + resultM);
        System.out.println("n) " + resultN);
    }
}