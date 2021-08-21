import java.util.Scanner;

public final class App {

    public static void main(String[] args) throws Exception {

        int decimal;

        System.out.println("\nDigite um número entre 1 e 3999 para que seja convertido em algarismos romano.\n");
        
        Scanner scanner = new Scanner(System.in);
        decimal=scanner.nextInt();
        scanner.close();

        String result = Converter.toRoman(decimal);

        System.out.printf("O decimal " + decimal +" convertico em algarismos romanos resulta em: " + result + "\n\n");
    }
}