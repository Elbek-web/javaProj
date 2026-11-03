package zoo;

public class Bird extends Animal {
    private String featherColor;

    public Bird() {
        super();
        this.featherColor = "Unknown";
    }

    public Bird(String name, int age, double weight, String featherColor) {
        super(name, age, weight);
        this.featherColor = featherColor;
    }

    public Bird(String name, String featherColor) {
        super(name, 0);
        this.featherColor = featherColor;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " (bird) is pecking at seeds.");
    }

    @Override
    public void getVoice() {
        System.out.println(getName() + " is chirping.");
    }

    public void fly() {
        System.out.println(getName() + " is flying in the sky.");
    }

    public String getFeatherColor() { return featherColor; }
    public void setFeatherColor(String featherColor) { this.featherColor = featherColor; }

    @Override
    public String toString() {
        return "Bird{" + super.toString() + ", featherColor=" + featherColor + "}";
    }
}