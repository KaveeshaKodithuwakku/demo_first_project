public class Vehicle {
    String name;
    String colour;
    int wheels;

    public Vehicle(String name, String colour, int wheels) {
        this.name = name;
        this.colour = colour;
        this.wheels = wheels;
    }

    public static void drive()
    {
        System.out.println("I am driving....");
    }
}
