package QuestaoDePedidos;
// Ler os dados de m pedido com N itens (N fornecido pelo usuario).
// Depois, mostrar um sumario de pedido

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Pedidos {
    public static DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        LocalDateTime horarioAtual = LocalDateTime.now();


        System.out.println("Enter cliente data:");
        System.out.print("Name:");
        String name = sc.nextLine();
        System.out.print("Email:");
        String email = sc.nextLine();
        System.out.print("Birth date(DD/MM/YYYY):");
        LocalDate birthDate = LocalDate.parse(sc.nextLine(), fmt1);
        Client cliente1 = new Client(name, email, birthDate);


        System.out.println("Enter Order data:");
        System.out.print("Status:");
        OrderStatus status = OrderStatus.valueOf(sc.nextLine());

        Order pedido = new Order(cliente1, horarioAtual, status);

        System.out.print("How many items to this order?:");
        int numberOfOrders = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < numberOfOrders; i++){
            System.out.printf("Enter #%d item data:\n", i+1);
            System.out.print("Product name: ");
            String namep = sc.nextLine();
            System.out.print("Product price: ");
            double pricep = sc.nextDouble();
            sc.nextLine();
            System.out.print("Quantity: ");
            int quantityp = sc.nextInt();
            sc.nextLine();
            Product produto = new Product(namep, pricep);
            OrderItem orderItem = new OrderItem(produto, quantityp, pricep);
            pedido.addItem(orderItem);
        }

        System.out.println("ORDER SUMMARY:\n" + pedido);
        




       sc.close();
    }    
}
