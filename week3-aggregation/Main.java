public class Main {

    public static void main(String[] args) {

        World theWorld = new World();
        Human firstHuman = new Human("First Human");
        Human secondHuman = new Human("second Human");

        theWorld.addLivingThing(firstHuman);
        theWorld.addLivingThing(secondHuman);

        Human babyHuman = (Human) firstHuman.breed(secondHuman);

        theWorld.addLivingThing(babyhuman);

        Animal firstAnimal = new Animal("First Animal");

        theWorld.addLivingThing(firstAnimal);

        Plant firstPlant = new Plant("First Plant");

        theWorld.addLivingThing(firstPlant);

    }
}