public class Sportsman {
    private String name;

    public Sportsman(String name) {
        this.name = name;

    }

    public void show(){
        System.out.println("Sportsman{ name: " + getName());
    }
    public String getName() {
        return name;
    }


}
