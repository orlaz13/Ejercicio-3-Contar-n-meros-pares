import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        System.out.print("Ingrese N: ");
        N = sc.nextInt();
        while (N <= 0) {
            System.out.print("Ingrese un numero positivo: ");
            N = sc.nextInt();
        }
        int contador = 1;
        int pares = 0;
        while (contador <= N) {
            if (contador % 2 == 0) {
                pares = pares + 1;
            }
            contador = contador + 1;
        }
        System.out.println("Cantidad de pares: " + pares);
        sc.close();
    }
}