package QuestaoDePedidos;

public class OrderItem {
    private Product product;
    private int quantity;
    private Double price;

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public Double getPrice() {
        return price;
    }

    Double subTotal(){
        return quantity * price;
    }

    public OrderItem(Product product, int quantity, Double price) {
        this.product = product;
        this.quantity = quantity;
        this.price = price;
    }
}
