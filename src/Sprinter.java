public class Sprinter extends Sportsman {
    private double record;

    public Sprinter(String name, String team, double record) {
        super(name, team);
        this.record = record;
    }

    public double getRecord() {
        return record;
    }

    public void show() {
        System.out.println("Name:" + super.getName() + ", Team: " + super.getTeam() + ", record: " + getRecord());
    }
}
