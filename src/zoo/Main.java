package zoo;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = new Animal[6];

        animals[0] = new Mammal("Lion", 5, 190.5, "Golden");   // barcha parametrlar
        animals[1] = new Dog("Rex", "Labrador");                // ba'zi parametrlar
        animals[2] = new Bird();                                // default
        animals[3] = new Pigeon("Pip", 2, 0.4, "White", "Rock Dove");
        animals[4] = new Fish("Nemo", "Sea");
        animals[5] = new Blowfish("Puffy", 1, 0.8, "Sea", true);

        for (int i = 0; i < animals.length; i++) {
            System.out.println("[" + i + "] " + animals[i]);
            animals[i].eat();
            animals[i].getVoice();
            System.out.println();
        }

        ((Mammal) animals[0]).feedMilk();
        ((Dog) animals[1]).fetchBall();
        ((Bird) animals[2]).fly();
        ((Pigeon) animals[3]).carryMessage();
        ((Fish) animals[4]).swim();
        ((Blowfish) animals[5]).inflate();

        animals[1].setName("Max");
        System.out.println("\nNew name: " + animals[1].getName());
    }
}