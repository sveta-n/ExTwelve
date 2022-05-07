import java.util.Scanner;

public class ExTwelve {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите I like Java!!!");
        String str = scanner.nextLine();

        boolean result1 = str.contains("Java");
        System.out.println(result1);

        boolean result2 = str.startsWith("I like");
        System.out.println(result2);

        boolean result3 = str.endsWith("!!!");
        System.out.println(result3);

        if (result1 == result2 == result3 == true) {
            System.out.println(str.toUpperCase());
        }

        String result4 = str.replaceAll("a", "o");
        System.out.println(result4);

        String result5 = result4.substring(7, 11);
        System.out.println(result5);
    }
}
