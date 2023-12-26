package uz.pdp.market.sevice;

import uz.pdp.market.entity.Category;
import uz.pdp.market.entity.Customer;
import uz.pdp.market.entity.Product;
import uz.pdp.market.sevice.implementation.OwnerImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public interface OwnerService {
    OwnerImpl owner = new OwnerImpl();

    List<Category> categories = Collections.synchronizedList(new ArrayList<>());
    List<Product> products = Collections.synchronizedList(new ArrayList<>());
    List<Customer> customers = Collections.synchronizedList(new ArrayList<>());
    boolean addCategory(Category category);
    boolean addProduct(Product product);

    boolean editCategory(Category category, Integer id);
    boolean editProduct(Integer productId,Product product);
    boolean deleteProduct(Integer productId);
    List<Product> seeAll();
}
