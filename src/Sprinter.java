public class Sprinter extends Sportsman {
    private double record;
    private double maxRecord = 0;

    public Sprinter(String name, double record) {
        super(name);
        this.record = record;
    }


    public double compareRecord(double record) {
        if (this.record > maxRecord) {maxRecord = this.record;}
            else {maxRecord = this.record;}
            return maxRecord;
    }

    @Override
    public void show() {
        System.out.println("Sprinter name: " + super.getName() + "record: " + compareRecord(record));
    }
}
