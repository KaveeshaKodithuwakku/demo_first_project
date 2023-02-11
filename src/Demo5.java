public class Demo5 {
    public static void main(String[] args) {
        Animal animal1 = new Animal();
        animal1.name = "Cat";
        animal1.colour="Brown";
        animal1.legs = 4;
        animal1.food ="Fish";
        animal1.drink = "Milk";

        Animal animal2 = new Animal();
        animal2.name = "Dog";
        animal2.colour="Black";
        animal2.legs = 3;
        animal2.food ="Chicken";
        animal2.drink = "Milk";
        animal2.isBark = true;


        System.out.println(animal1.legs);
        System.out.println(animal2.legs);//only show this. because static one can't save previous data
    }
}
