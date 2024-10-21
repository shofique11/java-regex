//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String text = "This is test text, this is another text";
        String replaced = text.replaceAll("\\btest\\b", "sample");
        System.out.println(text);
        System.out.println(replaced);
    }
}