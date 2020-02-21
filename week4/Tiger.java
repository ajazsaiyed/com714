public class Tiger extends Animal{

    // atributes

    // consturctor

    public Tiger(String nameIn) {

        super(nameIn);
    }




    // methods

    public LivingThings breed(LivingThings partner) {

        if (partner instanceof Human) {
            System.out.println("breeding");
            return new Human("Roahhhh");

        }
        return null;
    }





}