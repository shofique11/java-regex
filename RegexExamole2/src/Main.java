import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String Regex = "(.*)(for)(.*)?";
        String actualString = "Code for machine";
        Pattern pattern = Pattern.compile(Regex,Pattern.CASE_INSENSITIVE);
        boolean matches = pattern.matcher(actualString).matches();
        System.out.println("actualString"+ "contains regex=" + matches);
        System.out.println(Pattern.matches("geeksforge*ks", "geeksforgeeks"));
        System.out.println(Pattern.matches("g*geeks*", "geeksfor"));

        // create a REGEX String
        String REGEX = "(.*)(for)(.*)?";

        // create the string
        // in which you want to search
        String actualString2 = "code of Machine";

        // compile the regex to create pattern
        // using compile() method
        Pattern pattern1 = Pattern.compile(REGEX,Pattern.CASE_INSENSITIVE);
        int flag = pattern1.flags();
        System.out.println("Pattern's match flag = "+ flag);
        Pattern pattern2 = Pattern.compile(REGEX,Pattern.MULTILINE);
        int flag2 = pattern2.flags();
        System.out.println("Pattern's match flag2 = "+ flag2);
    }
}