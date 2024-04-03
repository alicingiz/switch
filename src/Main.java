import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ayin adini daxil et ");
        String proses = scanner.nextLine();

        switch (proses) {
            case "dekabr","yanvar","mart","may","iyul","avqust","oktyabr" -> System.out.println("31 gun" );
            case "aprel","iyun","sentyabr","noyabr" -> System.out.println("30 gun");
            case "fevral" -> System.out.println("28 gun");



        }
    }
}