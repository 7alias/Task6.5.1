public class Soccerman extends Sportsman {
    private int maxGoalsCount = 0;
    private int goalsCount;

    public Soccerman(String name, int goalsCount) {
        super(name);
        this.goalsCount = goalsCount;
    }

    public int compareGoal(int goalsCount) {
        if (goalsCount > this.goalsCount) {
            maxGoalsCount = goalsCount;
        }
        return maxGoalsCount;
    }

    @Override
    public void show() {
        System.out.println("Soccerman name: " + super.getName() + "goals: " + compareGoal(goalsCount));
    }
}

