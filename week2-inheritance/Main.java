public class Main {

    public static void main(String[] args) {

        // create an animal and make it speak

        Animal theAnimal = new Animal();
        theAnimal.speak();

        // create an tiger and make it speak

        Tiger theTiger = new Tiger();
        theTiger.speak();

        // create an Elephant and make it speak

        Elephant theElephant = new Elephant();
        theElephant.speak();

        // create the tiger an eat the elephant

        theTiger.eat_animal(theElephant);

        // make the tiger eat itself
        theTiger.eat_animal(theTiger);

    }

}