package tr.edu.medipol.yazilimort;
import org.apache.commons.lang3.StringUtils;
public class Main {
    public static void main(String[] args) {
        String hataliMetin = "  M ed   i p o l";
        System.out.println("Hatali metin -> " + hataliMetin);

        String duzeltilmisMetin = StringUtils.deleteWhitespace(hataliMetin);
        System.out.println("Duzeltilmis metin -> " + duzeltilmisMetin);
        // hatali metin'i duzelt

        System.out.println("Merhaba!");
    }
}
