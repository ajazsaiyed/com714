
import java.util.ArrayList;

public class World {

    // attributes

    private ArrayList<LivingThings> livingThings;

    // constructor

    public World() {

        livingThings = new ArrayList<LivingThings>(livingThings);

    }

    // methods

    public void addLivingThings(LivingThings thing) {
        livingThings.add(thing);

      public LivingThings findLivingThings(int id){
            for (LivingThings thing : livingThings){
                if (things.getid() == id){
                    return things;
                }
            }
            return null;
        }

        public void display(){

            System.out.println("There are " + livingThings.size()+"living things in th world");
        }

    }
}
