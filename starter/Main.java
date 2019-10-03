// import Animal class

public class Main {

    public static void main(String[] args) {

        //Instantiate new Animal
        Animal animal = new Animal(4, 25, false, "Elephant");

//        System.out.println(animal);
        String name;
        int topSpeed;

        //get name and speed values using getters
        name = animal.getName();
        topSpeed = animal.getTopSpeed() ;

        //Print some output
        System.out.println(animal);
//        System.out.println("The "+ name + " has a top speed of "+ topSpeed+ " mph.");

        //Set new name, speed, and endangered properties values using setters
        animal.setName("Lion");
        animal.setEndangered(true);
        animal.setTopSpeed(50);

        //get new values using getters
        name = animal.getName();
        topSpeed = animal.getTopSpeed() ;

        //Print some output
//        System.out.println("The "+ name + " has a top speed of "+ topSpeed+ " mph.");
        System.out.println(animal);
    }
}
