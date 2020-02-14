import java.util.ArrayList;

public class World {

    // attributed

    private ArrayList<LivingThing> livingThings;

    // countructor

    public World() {

        livingThings = new ArrayList<>();
    }
    // methods

    public void addLivingThing(LivingThing livingThingIn) {

        livingThings.add(livingThingIn);

    }
}