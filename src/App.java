import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {

        int decimal;

        System.out.println("Digite um número entre 1 e 3999 para que seja convertido em romano.");
        
        Scanner scanner = new Scanner(System.in);
        decimal=scanner.nextInt();
        scanner.close();

        String result = Converter.toRoman(decimal);

        System.out.printf("O decimal " + decimal +" convertico em romano resulta em: " + result + "\n");
    }
}