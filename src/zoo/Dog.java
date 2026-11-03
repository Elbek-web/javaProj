package zoo;

public class Dog extends Mammal {
    private String breed;

    public Dog() {
        super();
        this.breed = "Unknown";
    }

    public Dog(String name, int age, double weight, String furColor, String breed) {
        super(name, age, weight, furColor);
        this.breed = breed;
    }

    public Dog(String name, String breed) {
        super(name, 0);
        this.breed = breed;
    }

    @Override
    public void eat() {
        System.out.println(getName() + " the dog is eating meat.");
    }

    @Override
    public void getVoice() {
        System.out.println(getName() + " says: Woof! Woof!");
    }

    public void fetchBall() {
        System.out.println(getName() + " is fetching the ball.");
    }

    public String getBreed() { return breed; }
    public void setBreed(String breed) { this.breed = breed; }

    @Override
    public String toString() {
        return "Dog{" + super.toString() + ", breed=" + breed + "}";
    }
}