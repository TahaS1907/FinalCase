public class Phone extends PatikaStore {
    private int memory ;
    private String colour;
    private int batteryPower;


    public Phone(String id,double unitPrice, double discount,int stock,String productName,String brandName,int ram,
                 double screenSize,int memory,String colour,int batteryPower) {
        super(id,unitPrice,discount,stock,productName,brandName,ram,screenSize);
        this.setBatteryPower(batteryPower);
        this.setColour(colour);
        this.setMemory(memory);

    }


@Override
    public String toString(){

    String str = String.format(
            "ID: %1$s\nPrice: %2$s\nDiscount: %3$s percent\nStock Amount: %4$s\nProduct name: %5$s" +
                    "\nBrand: %6$s\nMemory: %7$s GB\nScreen size: %8$s inches\nBattery power: %9$s mAh" +
                    "\nRAM: %10$s GB\nColour: %11$s",getId(),getUnitPrice(),getDiscount(),getStock(),
            getProductName(),getBrandName(),getMemory(),getScreenSize(),getBatteryPower(),
            getRam(),getColour()
    );
    return str;
}


    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {

        this.memory = memory;
    }



    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {

        this.colour = colour;
    }

    public int getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(int power) {
        this.batteryPower=power;
    }


}
