package zoo;

public class Mammal extends Animal {
    private String furColor;

    public Mammal() {
        super();
        this.furColor = "Unknown";
    }

    public Mammal(String name, int age, double weight, String furColor) {
        super(name, age, weight);
        this.furColor = furColor;
    }

    public Mammal(String name, int age) {
        super(name, age);
        this.furColor = "Unknown";
    }

    @Override
    public void eat() {
        System.out.println(getName() + " (mammal) is eating food.");
    }

    @Override
    public void getVoice() {
        System.out.println(getName() + " makes a mammal sound.");
    }

    public void feedMilk() {
        System.out.println(getName() + " feeds its babies with milk.");
    }

    public String getFurColor() { return furColor; }
    public void setFurColor(String furColor) { this.furColor = furColor; }

    @Override
    public String toString() {
        return "Mammal{" + super.toString() + ", furColor=" + furColor + "}";
    }
}