public class Notebook extends PatikaStore {


    private int storage;




    public Notebook(String id,double unitPrice, double discount,int stock,String productName,String brandName,int ram,
                    double screenSize,int storage) {
        super(id,unitPrice,discount,stock,productName,brandName,ram,screenSize);
this.setStorage(storage);
    }
    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    @Override
    public String toString() {
        String str = String.format(
                "ID: %1$s\nPrice: %2$s\nDiscount: %3$s percent\nStock Amount: %4$s\nProduct name: %5$s" +
                        "\nBrand: %6$s\nRAM: %7$s GB\nStorage: %8$s SSD\nScreen size: %9$s inches"
                        ,getId(),getUnitPrice(),getDiscount(),getStock(),
                getProductName(),getBrandName(), getRam(),getStorage(),getScreenSize()

        );
        return str;

    }
}
