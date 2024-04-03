import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" eded daxil edin ");
        int eded=scanner.nextInt();

        String proses = scanner.nextLine();

        switch (eded) {
            case 1, 2, 3, 4, 5 -> System.out.println("1-5 arasindadir");
            case 6, 7, 8, 9 -> System.out.println("5-10 arasindadir");

            default-> System.out.println("yanlis daxil etmisiniz");


        }

    }
}