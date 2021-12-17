package com.company.entities;

public class OrderItem {

    private Integer quantity;
    private Double price;

    private Product product;

    public OrderItem() {
    }

    public OrderItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }

    public Product getProduct() {
        return product;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public void setPrice(Double price){
        this.price = price;
    }
    public void setProduct(Product product){
        this.product = product;
    }

    public double subTotal(){
        return  price * quantity;
    }

    @Override
    public String toString(){
        return getProduct().getName()
               + ", $"
               + String.format("%.2f" , price)
               + ", Quantity: "
               + quantity
               + ", Subtotal: $"
               + String.format("%.2f" , subTotal());
    }
}
