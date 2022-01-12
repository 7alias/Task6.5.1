public class Soccerman extends Sportsman {
    private String[] tableName = new String[3];
    private int[] tableGoals = new int[3];

    String winner = "";
    public Soccerman(String name, int goals) {
        super(name, goals);
        for (int i = 0; i < 3; i++) {
            tableName[i] = name;
            tableGoals[i] = goals;
        }
    }

    public String compareRecord() {
        int maxRecord = 0;
        for (int i = 0; i < 3; i++) {

            if (tableGoals[i]> maxRecord){ maxRecord = tableGoals[i]; winner = (tableName[i] + " : " + tableGoals[i]);}
        }
        return winner;

    }

    @Override
    public void show() {
        System.out.println( compareRecord());
    }
}
