import java.util.Scanner;

public class MobileProduct {
    String moblieModel;
    String importDate;
    String color;
    String speakerSize;
    String power;
    String manufacturedCountry;
    int marketBatchNo;

    //Constructor --
    public MobileProduct(String moblieModel,String importDate,String color,String speakerSize,String power,String manufacturedCountry,int marketBatchNo) {
        this.moblieModel = moblieModel;
        this.importDate = importDate;
        this.color = color;
        this.speakerSize = speakerSize;
        this.power = power;
        this.manufacturedCountry = manufacturedCountry;
        this.marketBatchNo = marketBatchNo;
    }

    //Getter methods--
    public String getMobileModel(){
        return moblieModel;
    }
    public String getImportDate(){
        return importDate;
    }
    public String getColor(){
        return color;
    }
    public String getSpeakerSize(){
        return speakerSize;
    }
    public String getPower(){
        return power;
    }
    public String getManufacturedCountry(){
        return manufacturedCountry;
    }
    public int getMarketBatchNo(){
        return marketBatchNo;
    }

    //Methods for inputting the product details --
    public static MobileProduct inputProductDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mobile Model:");
        String moblieModel = sc.nextLine();
        System.out.print("Import Date:");
        String importDate = sc.nextLine();
        System.out.print("Color:");
        String color = sc.nextLine();
        System.out.print("Speaker size:");
        String speakerSize = sc.nextLine();
        System.out.print("Power:");
        String power = sc.nextLine();
        System.out.print("Manufactured country:");
        String manufacturedCountry = sc.nextLine();
        System.out.print("Input Market Batch no.:");
        int marketBatchNo = sc.nextInt();
        return new MobileProduct(moblieModel,importDate,color,speakerSize,power,manufacturedCountry,marketBatchNo);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input total no. of Mobile Products: ");
        int numProducts = sc.nextInt();
        MobileProduct[] mobileProducts = new MobileProduct[numProducts];
        //Create an array to input Mobile products --
        for (int i = 0; i < numProducts; i++) {
            System.out.println("Enter details of " + (i + 1) + " Mobile Products -->");
            mobileProducts[i] = inputProductDetails();
        }
        System.out.println("\n");
        //Now create a loop for display all product details--
        for (int i = 0; i < numProducts; i++) {
             System.out.println("Details of " + (i + 1) + " Mobile Products -->");
             System.out.println("Mobile Model:" +mobileProducts[i].getMobileModel());
             System.out.println("Import Date:" +mobileProducts[i].getImportDate());
             System.out.println("Color:" +mobileProducts[i].getColor());
             System.out.println("Speaker size:" +mobileProducts[i].getSpeakerSize());
             System.out.println("Power:" +mobileProducts[i].getPower());
             System.out.println("Manufactured country:" +mobileProducts[i].getManufacturedCountry());
             System.out.println("Input Market Batch no.:" +mobileProducts[i].getMarketBatchNo());
        }
    }
}