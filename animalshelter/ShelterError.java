package animalshelter;

/**
 * Created by Niklas on 2016-02-07.
 */
public class ShelterError {

    public static void main(String[] args){
        AnimalShelter<Animal> catShelter = new AnimalShelter<>();
        Dog badBoyRex = new Dog();

        catShelter.putAnimal(badBoyRex);
        System.out.println("Who let the dogs out?!?");
    }
}
