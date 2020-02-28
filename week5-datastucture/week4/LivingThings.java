import java.util.ArrayList;

public class LivingThings extends  World{

    // atributes

    private static int next_id = 1;
    private int id, age, energy;
    private String name;
    private ArrayList<LivingThings> livingThings;


    // consturctor

    // methods

    public LivingThings(){

        id = next_id;
        next_id++;
        age = 0;
        energy = 100;
    }

    public int geid(){

        return id;
    }
    public LivingThings(String nameIn){

        age = 0;
        name =  nameIn;
        energy = 100;

    }

    public void age(){
        age = age +1;
    }

    public int getEnergy(){
        return energy;
    }

    public int getName(){
        return name;
    }
    public int setEnergy(int energyIn){
         energy = energyIn;
    }
    public int setName(String nameIn){
        name =  nameIn;
    }

    public static object remove(LivingThings things){
        return null;
    }

}
