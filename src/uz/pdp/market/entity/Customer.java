package uz.pdp.market.entity;

public class Customer {

    private String name;
    private Integer id;
    private Integer purchaseQuantity;

    public Customer(String name, Integer id, Integer purchaseQuantity) {
        this.name = name;
        this.id = id;
        this.purchaseQuantity = purchaseQuantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getPurchaseQuantity() {
        return purchaseQuantity;
    }

    public void setPurchaseQuantity(Integer purchaseQuantity) {
        this.purchaseQuantity = purchaseQuantity;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", purchaseQuantity=" + purchaseQuantity +
                '}';
    }
}
