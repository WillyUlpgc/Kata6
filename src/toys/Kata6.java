package toys;

import Business.ToyBusiness;
import branches.AmericanToyBusiness;
import branches.AsianToyBusiness;
import toyproducts.models.AmericanHelicopterToy;
import toyproducts.models.AmericanCarToy;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;
import toyproducts.Toy;

public class Kata6 {

    public static void main(String[] args) {
        ToyBusiness toyBusiness = new AmericanToyBusiness();
        ArrayList<Toy> toys = new ArrayList<>();
           
        Scanner in = new Scanner(System.in);
        String line = "";
        while (!"exit".equals(line)) {
            line = in.nextLine();
            switch(line) {
                case "car":
                case "helicopter":
                    toys.add(toyBusiness.createToy(line));
                    System.out.println("Built toys: " + toys.stream().map(Object::toString).collect(Collectors.joining(", ")));
                    break;
                    
                case "exit":
                    System.out.println("Exiting...");
                    break;
                    
                default:
                    System.out.println("Command unknown.");
                    break;
            }
        }
    }
    
}
