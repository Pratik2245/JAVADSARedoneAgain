package Assignments;

import java.util.*;

import static Assignments.Order.getItems;

class Order {
    private int orderId;
    private List<String> itemNames;
    private boolean cashOnDelivery;

    public Order(int orderId, List<String> itemNames, boolean cashOnDelivery) {
        this.orderId = orderId;
        this.itemNames = itemNames;
        this.cashOnDelivery = cashOnDelivery;
    }

    public List<String> getItemNames() {
        return itemNames;
    }
    public static List<String> getItems(List<Order> orders) {
        List<String> allItems = new ArrayList<>();
        for (Order order : orders) {
            allItems.addAll(order.getItemNames());
        }
        return allItems;
    }
}

class Tester {


    public static void main(String[] args) {
        List<Order> orders1 = Arrays.asList(
                new Order(101, Arrays.asList("Jeans", "Shirt", "Belt"), true),
                new Order(102, Arrays.asList("Tie", "Shirt"), true),
                new Order(103, Arrays.asList("Tshirt", "Socks", "Tie"), true)
        );
        System.out.println(getItems(orders1));

        List<Order> orders2 = Arrays.asList(
                new Order(311, Arrays.asList("Sportswear", "Dumbbell"), true),
                new Order(102, Arrays.asList("Jeans"), true),
                new Order(103, Arrays.asList("Smartwatch", "Fitnessband", "Joggers"), true)
        );
        System.out.println(getItems(orders2));
    }
}
