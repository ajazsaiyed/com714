public class Tiger extends Animal {


  @Override
  public void speak() {
    System.out.println("roar!!");
  }


  public void eat_animal(Animal animalIn) {
    if (animalIn instanceof Elephant) {
      System.out.println("Yummy Elepant");

    } else {

      System.out.println("Eww");
    }
  }

  //public void mate_animal(Animal partner){

    //if (partner instanceof Elepant) {
      //System.out.println("Woooow Elephant how are you!!!");
    //}
    //else {

      //System.out.println("break up");
    //}
  

 
}