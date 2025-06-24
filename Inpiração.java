import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        float[] produtos_precos = new float[4];
        String[] produtos_nomes = new String[4];

        for (int i = 0; i <= produtos_nomes.length; i++) {
            System.out.println("Digite o nome do prod" + (i + 1));
            produtos_nomes[i] = input.next();
            System.out.println("Digite o preço do produto" + (i + 1));
            produtos_precos[i] = input.nextFloat();
        }

        for (int i = 0; i <= produtos_nomes.length; i++) {
            System.out.printf("%s - R$ %.2f%n", produtos_nomes[i], produtos_precos[i]);
        }
        
        input.close();
    }
}
