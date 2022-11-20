import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        ArrayList<Phone> phones = new ArrayList();
        ArrayList<String> idDetector=new ArrayList<>();
        ArrayList<Notebook> notebooks=new ArrayList();
        ArrayList idDetector2 = new ArrayList<>();
        ArrayList brandDetector=new ArrayList();
        ArrayList brandDetector2=new ArrayList();
        String[] brands = {"Samsung", "Lenovo", "Apple", "Huawei", "Casper", "Asus", "HP", "Xiaomi", "Monster"};
        int[] memory = {128, 64};
        int storage = 512;
        int batteryPower = 4000;
        String[] colour = {"Red", "Black", "Blue"};
        double[] screenSizes = {6.1, 14};
        int[] rams = {6, 8};

        Scanner sc = new Scanner(System.in);

        int operation = 0;
        String id, productName;
        double unitPrice, discount;
        int stock,brandIndex,memo,colourIndex;

        while (operation != 100) {

            System.out.println("Welcome to Patika Store, please choose the action you want to do:");
            System.out.println("  1- Add Notebook");
            System.out.println("  2- List Notebooks");
            System.out.println("  3- Delete Notebook ");
            System.out.println("  4- List by Notebook Id ");
            System.out.println("  5- List by Notebook Brand");
            System.out.println("  6- Add Phone");
            System.out.println("  7- List Phones");
            System.out.println("  8- Delete Phone");
            System.out.println("  9- List by Phone Id");
            System.out.println("  10- List by Phone Brand");
            System.out.println("  100 - End Program");

            operation = sc.nextInt();
            switch (operation) {
                case 1:
                    System.out.println("Please enter ID:");
                    id = sc.next();
                    idDetector.add(id);
                    System.out.println("Please enter name of the product:");
                    productName = sc.next();
                    System.out.println("Please enter the unit price of the product:");
                    unitPrice = sc.nextDouble();
                    System.out.println("Please enter the discount of the product:");
                    discount = sc.nextDouble();
                    System.out.println("Please enter the amount of stock:");
                    stock = sc.nextInt();
                    System.out.println("Please select the brand (Enter the number):");
                    Arrays.sort(brands);
                    for(int i=0;i< brands.length;i++){
                    System.out.println("Brand "+(i+1)+" "+brands[i]+"\n");}
                    brandIndex= sc.nextInt();
                    brandDetector.add(brandIndex);
                    Notebook m = new Notebook(id, unitPrice, discount, stock, productName, brands[brandIndex-1], rams[1], screenSizes[1], storage);
                    notebooks.add(m);
                    break;

                case 2:
                    for(int i=0;i<notebooks.size();i++) {
                        System.out.println("Product "+(i+1)+":");
                     System.out.println(notebooks.get(i));
                     System.out.println("*************");
                    }
                    break;

                case 3:
                    System.out.println("Please enter ID:");
                    String kid4;
                    kid4 = sc.next();
                    int a= idDetector.indexOf(kid4);
                    if(a!=-1){
                        notebooks.remove(a);}
                    else{System.out.println("ID not found");}
                    break;

                case 4:
                    System.out.println("Please enter the id you want to filter:");
                    String kid6;
                    kid6 = sc.next();
                    int d= idDetector.indexOf(kid6);
                    if(d!=-1){System.out.println("Filtered result:\n"+notebooks.get(d));}
                    else{System.out.println("ID not found");}
                    break;

                case 5:
                    System.out.println("Please enter the brand you want to filter:");
                    int brando;
                    Arrays.sort(brands);
                    for(int i=0;i< brands.length;i++){
                        System.out.println("Brand "+(i+1)+" "+brands[i]+"\n");}
                    brando= sc.nextInt();
                    System.out.println(brandDetector.size());
                    for(int j=0;j<brandDetector.size();j++){
                        int e=brandDetector.indexOf(brando);
                        if(e!=-1){System.out.println(notebooks.get(j));}
                    }
                    break;

                case 6:
                    System.out.println("Please enter ID:");
                    id = sc.next();
                    idDetector2.add(id);
                    System.out.println("Please enter name of the product:");
                    productName = sc.next();
                    System.out.println("Please enter the unit price of the product:");
                    unitPrice = sc.nextDouble();
                    System.out.println("Please enter the discount of the product:");
                    discount = sc.nextDouble();
                    System.out.println("Please enter the amount of stock:");
                    stock = sc.nextInt();
                    System.out.println("Please enter the memory of the phone(Enter the number):\n1-128 GB\n2-64 GB");
                    memo=sc.nextInt();
                    System.out.println("Please enter the Colour index(Enter the number):\n1-Red\n2-Black\n3-Blue");
                    colourIndex= sc.nextInt();
                    System.out.println("Please select the brand (Enter the number):");
                    Arrays.sort(brands);
                    for(int i=0;i< brands.length;i++){
                        System.out.println("Brand "+(i+1)+" "+brands[i]+"\n");}
                    brandIndex= sc.nextInt();
                    brandDetector2.add(brandIndex);
                    Phone phone = new Phone(id,unitPrice,discount,stock,productName,brands[brandIndex-1],rams[0],screenSizes[1],memory[memo-1],colour[colourIndex-1],batteryPower);
                    phones.add(phone);
                    break;

                case 7:
                    for (int i = 0; i < phones.size(); i++) {
                        System.out.println("Product "+(i+1)+":");
                        System.out.println(phones.get(i));
                        System.out.println("*************");
                    }
                    break;
                case 8:
                    System.out.println("Please enter ID:");
                    String kid3;
                    kid3 = sc.next();
                        int b= idDetector2.indexOf(kid3);
                        if(b!=-1){
                            phones.remove(b);}
                        else{System.out.println("ID not found");}
                        break;

                case 9:
                    String kid5;
                    System.out.println("Please enter the Id you want to filter:");
                    kid5 = sc.next();
                    int c= idDetector2.indexOf(kid5);
                    if(c!=-1){System.out.println("Filtred result:\n"+phones.get(c));}
                    else{System.out.println("Id not found");}
                    break;

                case 10:
                    System.out.println("Please enter the brand you want to filter:");
                    int brando2;
                    Arrays.sort(brands);
                    for(int i=0;i< brands.length;i++){
                        System.out.println("Brand "+(i+1)+" "+brands[i]+"\n");}
                    brando2= sc.nextInt();
                    for(int j=0;j<brandDetector2.size();j++){
                        int e=brandDetector2.indexOf(brando2);
                        if(e!=-1){System.out.println(phones.get(j));}
                    }
                    break;

            }

        }
    }
}