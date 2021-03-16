package ghassen;

public class MobilePhone {
    String name;
    private double price;

    public MobilePhone(String newName,double newPrice){
        name=newName;
        price=newPrice;
        System.out.printf("Name : %s\nPrice: $%.2f",name,price);
    }
    public void setPrice(double newPrice){
        price=newPrice;
        System.out.printf("Mobile phone new price : $%.2f",price);

    }
}
