import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String frase, continua = "S";
        int i;

        while (continua.equals("S")) {
            System.out.println("Digite uma frase: ");
            frase = sc.nextLine();
            String binario = "";

            //Recebendo o decimal da frase
            for (i = 0; i < frase.length(); ++i) {
                char c = frase.charAt(i);
                int letra = (int) c;
                String letraBinario = "";

                //Começo do cálculo
                while (letra > 0) {
                    int resto = letra % 2;
                    letraBinario = resto + letraBinario;
                    letra = letra / 2;
                }
                while (letraBinario.length() < 8) {
                    letraBinario = "0" + letraBinario;
                }
                binario += " " + letraBinario;
            }

            System.out.println("A frase em binário é: "+binario);

            System.out.println("Deseja continuar? (S/N)");
            continua = sc.next().toUpperCase();
            sc.nextLine();
        }
    }
}