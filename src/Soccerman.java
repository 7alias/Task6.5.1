public class Soccerman extends Sportsman {
    private int goals;


    public Soccerman(String name, String team, int goals) {
        super(name, team);
        this.goals = goals;
    }

    public int getGoals() {
        return goals;
    }

    public void show() {
        System.out.println("Name: " + super.getName() + ", team: " + super.getTeam() + ", score: " + getGoals());
    }
}




