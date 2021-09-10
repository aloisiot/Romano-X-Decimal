import java.util.ArrayList;
import java.util.List;

/**
 * Classe de conversção de representações numéricas.
 * 
 * Possui métodos que convertem um numero romano em seu decimal equivelente e vice-versa 
 */
public final class Converter {

    private static List<String[]> romansLists = Romans.elements();
    
    /**
     * Converte um numero expresso decimal para seu equivalente em algarismo romano.
     * @param decimal Representação decimal de um número a ser convertido para romano.
     * @return
     */
    public static String decimalToRoman(int decimal) {
        
                int d = decimal;
                String decimalString = Integer.toString(d);
                List<String> invertedRoman = new ArrayList<String>();
                int importance = 0;
                String roman = new String();

        if(d <= 0 || d > 3999){
            return null;
        }

        for(int j = decimalString.length() -1 ; j >= 0; j--){

            int index;
            index = Integer.parseInt(Character.toString(decimalString.charAt(j)));

            invertedRoman.add(romansLists.get(importance)[index]);
            importance++;

        }

        for(int i = invertedRoman.size() - 1; i >= 0 ;i--){
            roman+= invertedRoman.get(i);
        }

        return roman;
    }

    // Simplificado e mais eficas.
    /**
     * Converte um numero expresso em algarismo romano para seu decimal equivalente.
     * @param roman Representação romana de um número a ser convertido para decimal.
     * @return Decimal equivalente ao romano recebido como parãmetro.
     */
    public static int romanToDecimal(String roman){
        String s = roman;

        int result= 0;

        for(int i = 0; i < s.length(); i++){
            
            switch(s.charAt(i)){
                    
                case 'I':
                    if( s.length() > i + 1 && (s.charAt(i+1) == 'V' || s.charAt(i+1) == 'X'))
                        result--;
                    else
                        result ++;
                    break;
                    
                case 'V': 
                    result += 5;
                    break;
                    
                case 'X':
                    if( s.length() > i + 1 && (s.charAt(i+1) == 'L' || s.charAt(i+1) == 'C'))
                        result -= 10;
                    else
                        result += 10;
                    break;

                case 'L': 
                        result += 50;
                        break;

                case 'C':
                    if( s.length() > i + 1 && (s.charAt(i+1) == 'D' || s.charAt(i+1) == 'M'))
                        result -= 100;
                    else
                        result += 100;
                    break;
                    
                case 'D': 
                        result += 500;
                        break;

                case 'M':
                    // if( s.length() > i + 1 && (s.charAt(i+1) == '' || s.charAt(i+1) == 'M'))
                    //     result -= 10000;
                    // else
                        result += 1000;
                    break;
            }
            
        }

        return result;
    }

    // Ineficas  e mais complexo(primeira solução)
    /**
     * Converte um numero expresso em algarismo romano para seu decimal equivalente.
     * @param roman Representação de um número em romano a ser convertido para decimal.
     * @return Decimal equivalente ao romano recebido como parãmetro.
     */
    public static int romanToDecimalDep(String roman){

        int result = 0;
        String romanString = roman;
        String subString = new String();
        int currentIndexAtSubString = 3;

        if(romanString.length() <= currentIndexAtSubString)
            currentIndexAtSubString = romanString.length() - 1;
        
        
        while(romanString.length() > 0){

            subString = "";
            for(int x = 0; x <= currentIndexAtSubString; x++){
                subString += romanString.charAt(x);
            }
            
            for(int importance = romansLists.size() - 1; importance >= 0; importance--){

                for(int j = romansLists.get(importance).length - 1; j >= 0 ; j--){
                    
                    if(subString.equals(romansLists.get(importance)[j])){
                        
                        String oldString = romanString;
                        romanString = "";
                        
                        for( int i = subString.length(); i < oldString.length(); i++){
                            
                            romanString += oldString.charAt(i);
                            
                        }
                        
                        result += j * Math.pow(10, importance);

                        currentIndexAtSubString = 3;
                        if(romanString.length() <= currentIndexAtSubString)
                            currentIndexAtSubString = romanString.length();
                        
                    }  else if(j == 0 && importance == 0){
    
                        currentIndexAtSubString--;
                        
                    }
                }

            }            
            
        }
        
        return result;
    }

}
