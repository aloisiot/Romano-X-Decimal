import java.util.ArrayList;
import java.util.List;

public class Converter {

    private static Romans rElements = new Romans();
    private static List<String[]> romansLists = rElements.getRomansLists();
    
    Converter(){}  
    
    public static String toRoman(int decimal) {
        
        int d = decimal;
        String dString = Integer.toString(d);
        List<String> roman = new ArrayList<String>();
        int positionInRomansLists=0;
        String result = new String();
        
        if(d <= 0 || d >= 3999){
            return null;
        }
            
        for(int j = dString.length() -1 ; j >= 0; j--){

            int index;
            index = Integer.parseInt(Character.toString(dString.charAt(j)));

            roman.add(romansLists.get(positionInRomansLists)[index]);
            positionInRomansLists++;
    
        }

        for(int i = roman.size() - 1; i >= 0 ;i--){
            result+= roman.get(i);
        }
        
        return result;
    }

}
