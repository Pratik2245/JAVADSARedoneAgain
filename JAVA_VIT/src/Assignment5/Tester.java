package Assignment5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        List<Order> order1=Arrays.asList(
        new Order(101,Arrays.asList("Jeans", "Shirt", "Belt"),true),
        new Order(102,Arrays.asList("Tie","Shirt"),true),
        new Order(103,Arrays.asList("Tshirt","Socks","Tie"),true)
        );
        System.out.println(Order.getItem(order1));

        List<Order> order2=Arrays.asList(
        new Order(311,Arrays.asList("Sportswear", "Dumbbell"),true),
                new Order(102,Arrays.asList("Jeans"),true),
                new Order(103,Arrays.asList("Smartwatch","Fitnessband","Joggers"),true)
        );
        System.out.println(Order.getItem(order2));
    }
}

class Order{
    List<String> items=new ArrayList<>();
    boolean cashOnDelivery;
    int orderId;
    Order(int orderId,List<String> listItems,boolean cashOnDelivery){
        this.orderId=orderId;
        this.items=listItems;
        this.cashOnDelivery=cashOnDelivery;
    }

    public List<String> getItemNames(){
      return items;
    }
    public static List<String> getItem(List<Order> orders){
        List<String> allItems = new ArrayList<>();
        for (Order order : orders) {
            allItems.addAll(order.getItemNames());
        }
        return allItems;
    }
}
