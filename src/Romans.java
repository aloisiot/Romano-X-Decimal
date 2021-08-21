import java.util.ArrayList;
import java.util.List;

public class Romans {

    public String[] units = {"", "I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"};
    public String[] dezens = {"", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"};
    public String[] hundreds = {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "Dm"};
    public String[] thousands = {"", "M", "MM", "MMM"};
    
    List<String[]> romansList=new ArrayList<String[]>();

    Romans(){};

    public List<String[]> getRomansLists(){

        romansList.add(units);
        romansList.add(dezens);
        romansList.add(hundreds);
        romansList.add(thousands);

        return romansList;
    }

}
