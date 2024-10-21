import java.util.regex.Matcher;
import java.util.regex.Pattern;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String text = "Order123: apple, Order456: banana, Order789: orange";
        // Use a capturing group to extract order numbers
        Pattern pattern = Pattern.compile("Order(\\d+):\\s(\\w+)");
        Matcher matcher = pattern.matcher(text);
        while(matcher.find())
        {
            System.out.println("Order Number: "+ matcher.group(1));
            System.out.println("Order name: "+ matcher.group(2));
        }
    }
}