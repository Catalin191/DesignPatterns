package designPattern.creational.singleton;

public class Main {
    public static void main(String[] args) {
        OrderManagementService.getInstance().placeOrder();

        //OrderManagementService order = new OrderManagementService(); // privet constructor
    }
}
