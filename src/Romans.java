import java.util.ArrayList;
import java.util.List;

public final class Romans {

    private static String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    private static String[] dezens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    private static String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "DM"};
    private static String[] thousands = {"", "M", "MM", "MMM"};
    
    private static List<String[]> romansList = new ArrayList<String[]>();

    Romans(){};

    public static List<String[]> elements(){

        romansList.add(units);
        romansList.add(dezens);
        romansList.add(hundreds);
        romansList.add(thousands);

        return romansList;
    }

}
