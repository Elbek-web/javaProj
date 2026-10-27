public class Main {
    public static void main(String[] args) {
        Car car = new Car(
                "Corolla",
                "Toyota",
                2022,
                85000.0,
                "White",
                5);
        System.out.println("Initial state:");
        System.out.println(car.toString());

        car.sell();

        System.out.println("\nAfter sell():");
        System.out.println("Model: " + car.getModel());
        System.out.println("Brand: " + car.getBrand());
        System.out.println("Year: " + car.getYear());
        System.out.println("Price: " + car.getPrice());
        System.out.println("Color: " + car.getColor());
        System.out.println("Quantity: " + car.getQuantity());

        car.setColor("Black");
        car.setPrice(80000.0);
        car.setYear(2023);
        car.delivery();

        System.out.println("\nAfter changes:");
        System.out.println(car.toString());
    }
}