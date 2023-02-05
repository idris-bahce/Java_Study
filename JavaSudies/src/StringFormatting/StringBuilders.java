package StringFormatting;

public class StringBuilders {
    public static void main(String[] args) {
        String str = "Hello world!";
        stringTest(str);
        System.out.println(str);
        System.out.println("----------------------------------------");
        StringBuilder stringBuilder = new StringBuilder("Hello world!");
        stringTest(stringBuilder);
        System.out.println(stringBuilder);
    }
    public static void stringTest(String string){
        string = string.concat("and goodbye");
        System.out.println(string);
    }
    public static void stringTest(StringBuilder string){
        string = string.append("and goodbye");
        System.out.println(string);
    }
}
