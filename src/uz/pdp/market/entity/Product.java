package uz.pdp.market.entity;

import java.time.LocalDate;

public class Product {
    private String name;
    private Double price;
    private Integer id;
    private String type;
    public Product(String name, Double price, Integer id, String type) {
        this.name = name;
        this.price = price;
        this.id = id;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", id=" + id +
                ", type='" + type + '\'' +
                '}';
    }
}
