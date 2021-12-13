package toys;

public class Car {
    private final Integer serialNumber;
    private final String type;
    
    public Car(Integer serialNumber){
        this.serialNumber = serialNumber;
        this.type = "car";
    }
    
    public Integer getSerialNumber(){
        return this.serialNumber;
    }
    
    public String getType(){
        return this.type;
    }
    
    public void pack(){
        System.out.printf("Packing '%s' with S/N '%d' \n", this.getType(), this.getSerialNumber());
    }
    
    public void label(){
            System.out.printf("Labeling '%s' with S/N '%d' \n", this.getType(), this.getSerialNumber());
    }
}
