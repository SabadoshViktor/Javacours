import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main3 {

    public static void main(String[] args) {
        String text = "abcdddddddd";
        int maxLen = 0;
        
        
        

        Matcher m = Pattern.compile("(.)\\1+").matcher(text);
        while (m.find()) {
            String sub = m.group();
            System.out.println(sub);

           
            if (sub.length() > maxLen) {
                maxLen = sub.length();
            }     
        }

    }
}


