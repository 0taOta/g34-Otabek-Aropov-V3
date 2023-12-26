package uz.pdp.market.entity;

public class Owner {

    private Category category;
    private Product product;
    private Integer categoryId;

    public Owner(Category category, Product product, Integer categoryId) {
        this.category = category;
        this.product = product;
        this.categoryId = categoryId;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public String toString() {
        return "Owner{" +
                "category=" + category +
                ", product=" + product +
                ", categoryId=" + categoryId +
                '}';
    }
}
