package zoo;

public class Blowfish extends Fish {
    private boolean poisonous;

    public Blowfish() {
        super();
        this.poisonous = true;
    }

    public Blowfish(String name, int age, double weight, String waterType, boolean poisonous) {
        super(name, age, weight, waterType);
        this.poisonous = poisonous;
    }

    public Blowfish(String name, boolean poisonous) {
        super(name, "Sea");
        this.poisonous = poisonous;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the blowfish is eating crabs and shellfish.");
    }

    @Override
    public void getVoice() {
        System.out.println(getName() + " makes a quiet clicking sound.");
    }

    public void inflate() {
        System.out.println(getName() + " inflates like a balloon!");
    }

    public boolean isPoisonous() { return poisonous; }
    public void setPoisonous(boolean poisonous) { this.poisonous = poisonous; }

    @Override
    public String toString() {
        return "Blowfish{" + super.toString() + ", poisonous=" + poisonous + "}";
    }
}