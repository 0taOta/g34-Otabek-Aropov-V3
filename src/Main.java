
import uz.pdp.market.entity.Customer;
import uz.pdp.market.entity.Product;
import uz.pdp.market.sevice.CustomerService;
import uz.pdp.market.sevice.implementation.CustomerImpl;
import uz.pdp.market.sevice.implementation.OwnerImpl;

import java.util.Scanner;

import static uz.pdp.market.sevice.OwnerService.categories;
import static uz.pdp.market.sevice.OwnerService.customers;

public class Main {
    static Scanner scanStr= new Scanner(System.in);
    static Scanner scanInt= new Scanner(System.in);
    public static void main(String[] args) {

        CustomerService customerService= new CustomerImpl();
        customerService.showAll();

        OwnerImpl owner = new OwnerImpl();
        owner.addProduct(new Product("Iphone 15",2450d,1,"cellphone"));
        owner.addProduct(new Product("Iphone 12",3450d,2,"cellphone"));
        owner.addProduct(new Product("Iphone 14",4450d,3,"cellphone"));
        owner.addProduct(new Product("Iphone x",1450d,4,"cellphone"));
        owner.addProduct(new Product("Iphone 13",1350d,5,"cellphone"));
        System.out.println("Welcome to the market Place !!! ");
        System.out.println("Enter 1 to enter as Customer and 2 as Owner...");
        int i = scanInt.nextInt();
        if(i==1) {
            System.out.println("Please enter your name... ");

            String name = scanStr.nextLine();
            Integer limit = null;
            System.out.println("Please enter your Id... ");
            Integer id = scanInt.nextInt();
            Customer customer = new Customer(name, id, null);
            customers.add(customer);
            System.out.println(owner.seeAll());
            System.out.println("Enter the id of product you desired...");
            int idOfProduct = scanInt.nextInt();
            System.out.println("Enter the quantity of product you desired...");
            int quantity = scanInt.nextInt();
            CustomerImpl customer1 = new CustomerImpl();
            customer1.purchaseProduct(idOfProduct, quantity);
            customer.setPurchaseQuantity(quantity);
            System.out.println(customer);
        }
        if(i==2){
            System.out.println("Add category 1 ...");
            System.out.println("Edit category 2 ...");
            System.out.println("Edit product 3 ...");
            System.out.println("delete product 4 ...");
            System.out.println("Add product 5 ...");
            int anInt = scanInt.nextInt();
            owner.addProduct(new Product("new Product",1500d,6,"garden"));
        }
        System.out.println(owner.seeAll());
        customerService.showAll();
    }
}