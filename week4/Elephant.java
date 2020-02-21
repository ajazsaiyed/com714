package week4;

public class Elephant extends Animal {

    // atributes

    // consturctor

    public Elephant(String nameIn) {

        super(nameIn);

    }

    // methods

    @Override
    public LivingThings breed(LivingThings partner) {

        if (partner instanceof Elephant) {
            System.out.println("breeding");
            return new Elephant("baby elephant child");

        }
        return null;
    }

}