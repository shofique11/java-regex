import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String regex = ".*www.*";
        String actualString = "www.geeksforgeeks.org";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(actualString);
        boolean matchers = matcher.matches();
        System.out.println("actualString "
                + "contains REGEX = "
                + matchers);
    }
}