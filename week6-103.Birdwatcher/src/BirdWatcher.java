
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
public class BirdWatcher {

    private ArrayList<Bird> birds;

    public BirdWatcher() {
        this.birds = new ArrayList<>();
    }


    public void observe(String input) {
        boolean found = false;
        for (Bird bird : birds){
            if (input.equalsIgnoreCase(bird.getName())){
                bird.addObserved();
                found = true;
            }
        }
        if (!found){
            System.out.println("Is not a bird!");
        }
    }

    public void statistics(){
        for (Bird bird : birds){
            System.out.println(
                    bird.getName() + " (" + bird.getLatinName() + "): " +
                    bird.getObservedCount() + " observations");
        }
    }

    public void print(String input) {
        for (Bird bird : birds){
            if (input.equalsIgnoreCase(bird.getName())){
                System.out.println(
                        bird.getName() + " (" + bird.getLatinName() +"): " +
                        bird.getObservedCount() + " observations");
            }
        }
    }

    public void add(Scanner reader) {
        System.out.print("Name: ");
        String name = reader.nextLine();
        System.out.print("Latin Name: ");
        String latinName = reader.nextLine();
        birds.add(new Bird(name, latinName));
    }
}
