public class Main {
    public static void main(String[] args) {

        Soccerman soccerman = new Soccerman("First", "Kaliningrad", 5);
        soccerman.show(true);
        soccerman.show();

        Sprinter sprinter = new Sprinter("Second", "Moscow", 100);
        sprinter.show(true);
        sprinter.show();
    }
}
