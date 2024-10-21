import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String text = "This is a simple text with 123 numbers and symbols like ! and ?.";
        //compile the regex patter
        Pattern pattern = Pattern.compile("\\d+"); // match ore or more digit
        // Create a matcher for the text
        Matcher matcher = pattern.matcher(text);
        while (matcher.find())
        {
            System.out.println("Found a match: " + matcher.group());
        }
    }
}