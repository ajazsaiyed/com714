public class LivingThing{

    //attributed

    private String name;
    private int energy;


    //contructor

    public LivingThing(String nameIn){

        name = nameIn;
        energy = 100;
    }



    //methods

    public LivingThing breed(LivingThing partner){

        System.out.println("not sure");

        return null;
    }

    public void eat(int amount){
        energy = energy + amount; 

    }

    public String getname(){

        return name;
    }

    public int getenergy(){

        return energy;

    }

    public void setName(String nameIn){
         
        name = nameIn

    }

    public void setenergy(int energyIn){

        energy = energyIn;
    }



}