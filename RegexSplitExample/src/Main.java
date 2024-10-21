//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String text = "Apple,Orange,Banana,Pineapple";
        String[] fruits = text.split("[,;]");
        for(String fruit: fruits){
            System.out.println(fruit);
        }
    }
}