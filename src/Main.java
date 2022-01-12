import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String name;
        double record;
        int goals;
        Soccerman soccerman = new Soccerman("First",0);
        for (int i = 0; i < 3; i++) {
            System.out.printf("Name of %d soccerman: ", i);
            name = scan.nextLine();
            System.out.println("Goals: ");
            goals = scan.nextInt();
            soccerman = new Soccerman(name, goals);
            scan.nextLine();


        }soccerman.show();
        /*
Sprinter sprinter  = new Sprinter("first", 0);
        for (int j = 0; j < 3; j++) {
            System.out.printf("Name of %d sprinter: ", j);
            name = scan.nextLine();
            System.out.println("Record: ");
            record = scan.nextDouble();
            sprinter = new Sprinter(name, record);
            scan.nextLine();


    }sprinter.show();*/
    }
}
