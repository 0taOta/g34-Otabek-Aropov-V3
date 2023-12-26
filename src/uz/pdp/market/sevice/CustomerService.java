package uz.pdp.market.sevice;

import uz.pdp.market.entity.Customer;
import uz.pdp.market.entity.Product;


import java.util.*;

public interface CustomerService {
    List<Product> purchases = Collections.synchronizedList(new ArrayList<>());
    List<Customer> customers = Collections.synchronizedList(new ArrayList<>());
    List<Product> seeAll();
    boolean purchaseProduct(Integer productId, Integer quantity);
    boolean limit(Customer customer);

    void showAll();
}
