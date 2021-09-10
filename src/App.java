import java.util.Scanner;

public final class App {

    private static void romansListGenerator(){

        for(int i = 1; i < 4000; i++){

            String roman = Converter.decimalToRoman(i);

            System.out.printf("%n%d = %s", i, roman);
        }
        
    }

    public static void main(String[] args) throws Exception {

        System.out.println(">>> CONVERTA UM INTEIRO PARA ROMANO OU VICE-VERSA <<<");
        System.out.println("\nEscolha uma das seguintes opções:");
        
        Scanner input = new Scanner(System.in);
        int opt = 0;
        int integer;
        String roman;
        boolean isValid = false;
        
        while(!isValid){
            System.out.println("Digite");
            System.out.println("1 para converter um inteiro em romano;");
            System.out.println("2 para converter um romano em inteiro;");
            System.out.println("3 para que imprima uma lista com os números de 1 a 3999 em romano. \n");
            
            opt = input.nextInt();

            if( 0 < opt || opt > 3)
                isValid = true;
            else
                System.out.println("OPÇÃO INVÁLIDA!");

        }
        
        switch(opt){
            
            case 1:
                System.out.println("Insira um número inteiro entre 1 e 3999:");
                integer = input.nextInt();
                System.out.printf("Inteiro: %d \nRomano: %s", integer, Converter.decimalToRoman(integer));
                break;

            case 2:
                System.out.println("Insira um número romano entre 1 e 3999 (todos os caracters devem estar em maiúsculo):");
                roman = input.next();
                System.out.printf("Romano: %s \nInteiro: %d", roman, Converter.romanToDecimal(roman));
                break;

            case 3:
                romansListGenerator();
        }
        
        
        input.close();
        System.out.println("\n\n");
    }
}
