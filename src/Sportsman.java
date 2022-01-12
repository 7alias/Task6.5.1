public class Sportsman {
    private String name, team;

    public Sportsman(String name, String team) {
        this.name = name;
        this.team = team;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return team;
    }

    public void show(boolean sportsman){
        System.out.println(getName() + " " + getTeam());
    }
}
