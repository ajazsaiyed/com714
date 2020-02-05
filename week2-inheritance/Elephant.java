public class Elephant extends Animal {

    // attributes

    // counstructor

    // behaviours(methods)
    @Override
    public void speak() {
        System.out.println("ooooohhhhhhhhhhh!!");
    }

    @Override
    public void mate(Animal partner){
if (partner instanceof Elephant){

System.out.println("Heelo");
}
    }
    else {
    System.out.println("bye");
    }

}