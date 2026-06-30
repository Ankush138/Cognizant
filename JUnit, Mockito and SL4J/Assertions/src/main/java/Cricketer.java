public class Cricketer {

    private String name;
    private String team;
    private int centuries;

    public Cricketer(String name, String team, int centuries) {
        this.name = name;
        this.team = team;
        this.centuries = centuries;
    }

    public String getName() {
        return name;
    }

    public boolean hasMoreThan50Centuries() {
        return centuries > 50;
    }

    public String getCountry() {
        return "India";
    }

    public String getRetirementYear() {
        return null;
    }
}