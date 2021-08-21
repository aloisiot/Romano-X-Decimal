import java.util.ArrayList;
import java.util.List;

public final class Converter {

    private static List<String[]> romansLists = Romans.elements();

    public static String toRoman(int decimal) {

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

}
