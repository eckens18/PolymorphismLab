package io.zipcoder.pets;

import java.util.ArrayList;
import java.util.Scanner;

public class AskPetNameAndType {
    Scanner scanner = new Scanner(System.in);
    ArrayList<Pets> petTypes = new ArrayList<Pets>();
    Pets animal = new Pets();
    int x = 0;

    public void askPetNameAndType() {
        System.out.println("How many pets do you have?");
        Integer numOfPets = scanner.nextInt();
        while (x < numOfPets) {

                System.out.println("What's the animal's name?");
                String nameOfPets = scanner.next();
                System.out.println("and what type of animal is it?");
                String typeOfPets = scanner.next();
                Pets pet = null;
                switch(typeOfPets){
                    case "cat":
                        pet = animal.returnAnimal(nameOfPets,typeOfPets);
                        break;
                    case "dog":
                        pet = animal.returnAnimal(nameOfPets,typeOfPets);
                        break;
                    case "bird":
                        pet = animal.returnAnimal(nameOfPets,typeOfPets);
                        break;
                    default:
                        System.out.println("What kind of cat is that?");
                }
                petTypes.add(pet);
                x++;
        }
        for(Pets pet : petTypes){
            String saying = pet.speak();
            System.out.println("Pet's name is "+pet.getName()+" ,their type is "+pet.getType()+" ,and they say "+saying);
        }
    }
}
