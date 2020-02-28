public class Human extends Animal {

    // atributes

    

    // consturctor

    public Human(String nameIn) {

        super(nameIn);
    }




    // methods

    public LivingThings breed(LivingThings partner) {

        if (partner instanceof Human) {
            System.out.println("breeding");
            return new Human("New Baby");

        }
        return null;
    }

}