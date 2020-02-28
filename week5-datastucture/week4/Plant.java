public class Plant extends Animal {

    // atributes

    // consturctor

    public Plant(String nameIn) {

        super(nameIn);
    }




    // methods

    public LivingThings breed(LivingThings partner) {

        if (partner instanceof Plant) {
            System.out.println("breeding");
            return new Plant("New plant ");

        }
        return null;
    }

    

}