public final class App {

    public static void main(String[] args) throws Exception {

        
        for(int i = 1; i < 4000; i++){

            String roman = Converter.integerToRoman(i);

            System.out.printf("%n%d = %s", i, roman);
        }

        System.out.println("\n\n");
    }

}
