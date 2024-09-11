public class Main {
    public static void main(String[] args) {

        Rabbit rabbit = new Rabbit();

        rabbit.flee();

        Hawk hawk = new Hawk();

        hawk.hunt();

        Fish fish = new Fish();
        fish.hunt();
        fish.flee();

    }
}
//interfaces is a template that can be applied to a class
//similar to inheritance, but it specifies what a class has/must do
//classes can apply more than one interface, inheritance can only do 1