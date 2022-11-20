import java.util.Arrays;

public abstract class PatikaStore {
    private String id;
    private String productName;
    private double unitPrice;
    private double discount;
    private int stock;
    private String brandName;
    private double screenSize;
    private int ram;



    public PatikaStore(String id) {
        this.setId(id);
    }

    public PatikaStore(String id,double unitPrice, double discount,int stock,String productName,String brandName,int ram,
                       double screenSize) {
        this.setId(id);
        this.setUnitPrice(unitPrice);
        this.setDiscount(discount);
        this.setStock(stock);
        this.setProductName(productName);
        this.setBrandName(brandName);
        this.setRam(ram);
        this.setScreenSize(screenSize);
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getId() {
        return this.id;
    }
    public String getProductName() {
        return this.productName;
    }
    @Override
    public String toString() {
        String str = String.format(
                "ID: %1$s\nPrice: %2$s\nDiscount: %3$s\nBrand : %4$s",getId(),getUnitPrice(),getDiscount(),getBrandName()
                );
        return str;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brands) {

        this.brandName=brands ;
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }
}
