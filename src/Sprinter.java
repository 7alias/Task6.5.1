public class Sprinter extends Sportsman {
    private String[] tableName = new String[3];
    private double[] tableRecord = new double[3];
    private double maxRecord = 0;
    String winner = "";

    public Sprinter(String name, double record) {
        super(name, record);
        for (int i = 0; i < 3; i++) {
            tableName[i] = name;
            tableRecord[i] = record;
        }
    }

    public String compareRecord() {
        maxRecord = tableRecord[0];
        for (int i = 0; i < 3; i++) {

            if (tableRecord[i] > maxRecord) {maxRecord = tableRecord[i];
                winner = (tableName[i] + " : " + tableRecord[i]);
            } else {
            }
        }

        return winner;
    }

    @Override
    public void show() {
        System.out.println(compareRecord());
    }
}
