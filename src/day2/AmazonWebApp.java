package day2;

public class AmazonWebApp {

    public static void main(String[] args) {
        Mobile iphone13 = new Mobile();
        iphone13.brand = "Iphone";
        iphone13.color = "Golden";
        iphone13.numberOfCameras = 2;
        iphone13.os = "ios 15.1";
        iphone13.size = 6.1f;
        iphone13.serialNumber = "as24d5a55";
        iphone13.storage = 512;
        iphone13.storageUnit = "GB";
        iphone13.price = 829;

        Mobile samsungS22 = new Mobile();
        samsungS22.brand = "Samsung";
        samsungS22.color = "Green";
        samsungS22.numberOfCameras = 3;
        samsungS22.os = "Android";
        samsungS22.size = 6.1f;
        samsungS22.serialNumber = "124sd253";
        samsungS22.storage = 256;
        samsungS22.storageUnit = "GB";
        samsungS22.price = 749.99f;
    }
}

