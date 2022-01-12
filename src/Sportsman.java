public class Sportsman {
    private String name;
    private double record;

    public Sportsman(String name, double record) {
        this.name = name;
        this.record = record;

    }

    public void show(){
        System.out.println("Sportsman{ name: " + getName());
    }
    public String getName() {
        return name;
    }


}
