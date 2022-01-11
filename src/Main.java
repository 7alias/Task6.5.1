import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name;
        double record;
        int goals;

        for (int i = 0; i < 2; i++) {
            System.out.printf("Name of %d soccerman: ", i);
            name = scan.nextLine();
            System.out.println("Goals: ");
            goals = scan.nextInt();
            Soccerman soccerman = new Soccerman(name, goals);
            scan.nextLine();
            soccerman.show();
soccerman.compareGoal(goals);
        }

        for (int j = 0; j < 2; j++) {
            System.out.printf("Name of %d sprinter: ", j);
            name = scan.nextLine();
            System.out.println("Record: ");
            record = scan.nextDouble();
            Sprinter sprinter = new Sprinter(name, record);
            scan.nextLine();
            sprinter.compareRecord(record);
        sprinter.show();
    }}
}
