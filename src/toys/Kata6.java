package toys;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Kata6 {

    public static void main(String[] args) {
        SerialNumberGenerator sn = new SerialNumberGenerator();
        ArrayList<Car> cars = new ArrayList<>();
        
        Scanner in = new Scanner(System.in);
        String line = "";
        while (!"exit".equals(line)) {
            line = in.nextLine();
            if(!"exit".equals(line)){
                Car car = new Car(sn.next());
                car.pack();
                car.label();
                cars.add(car);
                System.out.println("Built cars: " + cars.stream().map(c -> c.getSerialNumber().toString()).collect(Collectors.joining(", ")));
            }
        }
    }
    
}
