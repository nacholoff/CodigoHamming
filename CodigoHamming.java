import java.util.Scanner;

public class CodigoHamming {
    // Metodo que genera el MENSAJE aleatoriamente.
    public static int generaNumeroAleatorio(int minimo, int maximo) {

        return (int) Math.floor(Math.random() * (minimo - (maximo + 1)) + (maximo + 1));

    }// close method
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        System.out.println("Inserte la longitud del ARRAY");
        int longitud = sn.nextInt();
        int numeros[] = new int[longitud];


    }
}
