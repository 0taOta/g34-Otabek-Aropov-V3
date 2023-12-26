package uz.pdp.market.sevice.implementation;

import uz.pdp.market.entity.Category;
import uz.pdp.market.entity.Product;
import uz.pdp.market.sevice.OwnerService;

import java.util.List;

public class OwnerImpl implements OwnerService {

    @Override
    public boolean addCategory(Category category) {
        for (Category c:categories) {
            if (c.getId().equals(category.getId())) {
                System.out.println("Id is already taken...");
                    return false;
            }
        }
        categories.add(category);
        return true;
    }
    @Override
    public boolean addProduct(Product product) {
        for (Product p: products) {
            if (p.getId().equals(product.getId())) {
                System.out.println("Product id is taken...");
                return false;
            }
        }
            products.add(product);
        return true;
    }

    @Override
    public boolean editCategory(Category category, Integer id) {
        for (Category p: categories) {
            if (p.getId().equals(id)) {
                categories.remove(p);
                categories.add(category);
                return true;
            }
        }
        System.out.println("Id is not found...");
        return false;
    }

    @Override
    public boolean editProduct(Integer productId, Product product) {
        for (Product p:products) {
            if (p.getId().equals(productId)) {
                products.remove(p);
                products.add(product);
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean deleteProduct(Integer productId) {

        for (Product p:products) {
            if (p.getId().equals(productId)) {
                products.remove(p);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Product> seeAll() {
        return products;
    }

}
