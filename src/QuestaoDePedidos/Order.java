package QuestaoDePedidos;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class Order {
    private Client client;
    private LocalDateTime moment;
    private OrderStatus status;
    
    private List<OrderItem> itens = new ArrayList<>();
    
    public Order(Client client, LocalDateTime moment, OrderStatus status) {
        this.client = client;
        this.moment = moment;
        this.status = status;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        int total = 0;
        sb.append("Order moment:" + moment.format(Pedidos.fmt2) + "\n");
        sb.append("Order status: " + status + "\n");
        sb.append("Client: " + client + "\n");
        sb.append("Order items: " + "\n");
        for(OrderItem c : itens){
            total += c.subTotal();
            sb.append(c.getProduct() 
            + "$" + c.getPrice() +", Quantity: " 
            + c.getQuantity() + ", Subtotal: $" 
            + c.subTotal()  + "\n") ;
        }
        sb.append("Total price: $"+ total);


        return sb.toString();
    }



    void addItem(OrderItem item){
        itens.add(item);
    }

    void removeItem(OrderItem item){
        itens.remove(item);
    }

    Double total(){
        double acc = 0;
       for(OrderItem c : itens){
        acc += c.subTotal(); 
       } 
       return acc;
    }
}
