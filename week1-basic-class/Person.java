class Person {
    // attributes
   private String name;
   private int age;
   private double weight;
   private double height;

   //contructors

   public Person(){

        name = "Ajaz";
        age = 23;
        weight = 60.6;
        height = 5.6;
   }

   public Person(String nameIn, int ageIn, double weightIn, double heightIn ){

    name = nameIn;
    age = ageIn;
    weight = weightIn;
    height = heightIn;

   }


    //behaviours
    public void eat(int amount){
        weight = weight + amount;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public double getHeight(){

        return height;
    }

    public double getWeight(){
        return weight;
    }


    public void grow(double amount){
        height = height + amount;
    }

    public static void main(String[] args){

        Person firstPerson = new Person();

        System.out.println(firstPerson.getName());

        Person secondPerson = new Person("Ajaz",20,5,5.10);

        System.out.println(secondPerson.getName());

    }

}


