public class Animal extends LivingThing {

    // attributes

    // contuctor
    public Animal(String nameIn) {

        super(nameIn);
    }

    // methods

    @Override

    public LivingThing breed(LivingThing partner) {
        if (partner instanceof Animal) {
            System.out.println("Breeading");
            return new Animal("newChild");
        }
        else{

            System.out.println("nothing");
            return null;

        }
    }

}