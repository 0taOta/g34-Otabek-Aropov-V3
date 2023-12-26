package uz.pdp.market.sevice.implementation;

import uz.pdp.market.entity.Customer;
import uz.pdp.market.entity.Product;
import uz.pdp.market.sevice.CustomerService;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.time.LocalDate;
import java.util.List;

import static uz.pdp.market.sevice.OwnerService.products;

public class CustomerImpl implements CustomerService, Serializable {

    @Override
    public List<Product> seeAll() {
        return products;
    }

    @Override
    public boolean purchaseProduct(Integer productId, Integer quantity) {
        for (Product p : products) {
            if (p.getId().equals(productId)) {
                for (int i = 0; i < quantity; i++) {
                    purchases.add(p);
                    try {
                        ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("/Users/macbookair/IdeaProjects/Aropov-Otabek-G34/db/history.txt"));
                        outputStream.writeObject(purchases.toString());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    return true;
                }
            }
        }
            return false;
    }

    @Override
    public boolean limit(Customer customer) {
        if (customer.getPurchaseQuantity() > 10) {
            return false;
        }
        return true;
    }

    @Override
    public void showAll() {
        System.out.println(customers);
    }
}
