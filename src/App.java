import java.util.Scanner;

public final class App {

    public static void main(String[] args) throws Exception {

        int integer;

        System.out.println("\nDigite um número entre 1 e 3999 para que seja convertido em algarismos romano.\n");
        
        Scanner scanner = new Scanner(System.in);
        integer=scanner.nextInt();
        scanner.close();

        String result = Converter.toRoman(integer);

        System.out.printf("O integer " + integer +" convertico para algarismos romanos resulta em: " + result + "\n\n");
    }
}