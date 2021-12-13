package toys;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Kata6 {

    public static void main(String[] args) {
        SerialNumberGenerator sn = new SerialNumberGenerator();
        ArrayList<Car> cars = new ArrayList<>();
        ArrayList<Helicopter> helicopters = new ArrayList<>();
        
        Scanner in = new Scanner(System.in);
        String line = "";
        while (!"exit".equals(line)) {
            line = in.nextLine();
            switch(line) {
                case "car":
                    Car car = new Car(sn.next());
                    car.pack();
                    car.label();
                    cars.add(car);
                    System.out.println("Built cars: " + cars.stream().map(c -> c.getSerialNumber().toString()).collect(Collectors.joining(", ")));
                    break;
                    
                case "helicopter":
                    Helicopter helicopter = new Helicopter(sn.next());
                    helicopter.pack();
                    helicopter.label();
                    helicopters.add(helicopter);
                    System.out.println("Built helicopters: " + helicopters.stream().map(c -> c.getSerialNumber().toString()).collect(Collectors.joining(", ")));
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
