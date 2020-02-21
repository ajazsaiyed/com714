
import java.util.ArrayList;

public class World {

    // attributes

    private ArrayList<LivingThings> livingThings;

    // contructor

    public World() {

        livingThings = new ArrayList<LivingThings>(livingThings);

    }

    // methods

    public void addLivingThings(LivingThings thing) {
        livingThings.add(thing);

    }
}
