public class Slytherin extends Hogwarts {
    protected String faculty = "Slytherin";
    private int cunning;
    private int determination;
    private int ambition;
    private int savvy;
    private int thirstForPower;

    public Slytherin(String name, int powerOfMagic, int transgressionDistance, String faculty, int cunning, int determination, int ambition, int savvy, int thirstForPower) {
        super(name, powerOfMagic, transgressionDistance);
        this.faculty = faculty;
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.savvy = savvy;
        this.thirstForPower = thirstForPower;
    }
}
