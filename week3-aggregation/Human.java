public class Human extends LivingThing {

    // attributes

    // contructor

    public Human(String nameIn) {

        super(nameIn);
    }

    // methods
    @Override

    public LivingThing breed(LivingThing partner) {
        if (partner instanceof Human) {
            System.out.println("Breeading");
            return new Human("newChild");
        }
        else{

            System.out.println("nothing");
            return null;
        }
    }

}