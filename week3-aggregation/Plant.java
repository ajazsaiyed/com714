public class Plant extends LivingThing {

    // attributes

    // contructor
    public Plant(String nameIn) {

        super(nameIn);
    }

    // methods

    @Override

    public LivingThing breed(LivingThing partner) {
        if (partner instanceof Plant) {
            System.out.println("Breeading");
            return new Plant("newPlant");

        }
        else{

            System.out.println("nothing");
            return null;
        }
    }

}