import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        // create a REGEX String
        String REGEX = "(.*)(welcome)(.*)?";
        // create the string
        // in which you want to search
        String actualString = "geeksforgeeks";
        Pattern pattern = Pattern.compile(REGEX);
        Matcher matcher = pattern.matcher(actualString);
        boolean matchfound = false;
        while (matcher.find()){
            System.out.println("match found");
            matchfound = true;
        }
        if (!matchfound) {
            System.out.println("No match found");
        }
        // create a REGEX String
        String REGEX2 = "geeks";
        // create a Pattern using REGEX
        Pattern pattern2 = Pattern.compile(REGEX2);
    }
}