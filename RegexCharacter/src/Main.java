import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println(Pattern.matches("[a-z]","g"));
        System.out.println(Pattern.matches("[a-zA-Z]","gfG"));
        // Check if all elements are numbers
        System.out.println(Pattern.matches("\\d+","123456"));
        // Check if all elements are non-numbers
        System.out.println(Pattern.matches("\\D+","1234567"));
        // Check if all the elements are non-numbers
        System.out.println(Pattern.matches("\\D+","Shofique"));
        // Check if all the elements are non-spaces
        System.out.println(Pattern.matches("\\S+","gfg"));
    }
}