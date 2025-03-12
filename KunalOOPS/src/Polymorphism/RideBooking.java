package Polymorphism;

import com.sun.security.jgss.GSSUtil;

public class RideBooking {
    public static final  int noPassengers=3;
    void bookRide(String pickup,String dropOff){
        System.out.println("Your drop Off location is="+dropOff);
        System.out.println("Your pickUp location is="+pickup);
        System.out.println("Ride Booked Successfully");
    }
    void bookRide(String pickup, String dropoff, int passengers){
        if(noPassengers<=passengers){
            System.out.println("Ride Book successfully");
        }else{
            System.out.println("No ride available with passenger Greater than 3");
        }
    }
    void bookRide(String pickup,String dropoff,boolean petFriendly){
       String message=petFriendly?"Pet-Friendly Ride Booked":"Regular Ride Booked";
       System.out.println("Ride booked from " + pickup + " to " + dropoff + ". " + message);
    }

    void bookRide(String pickup, String dropoff, int passengers, String rideType){

          if(!rideType.equalsIgnoreCase("Economy") || !rideType.equalsIgnoreCase("Luxury") || !rideType.equalsIgnoreCase("SUV")){
              System.out.println("Invalid ride type. Available options: Economy, Luxury, SUV.");
              return;
          }
          bookRide(pickup,dropoff,passengers);
        System.out.println("Your Ride Type="+rideType);
      }

    public static void main(String[] args) {
        RideBooking rb=new RideBooking();
        rb.bookRide("Times Square", "Central Park");
        rb.bookRide("Brooklyn", "Manhattan", 4);
        rb.bookRide("Queens", "JFK Airport", true);
        rb.bookRide("NYC", "New Jersey", 3, "Luxury");
    }

    }
}
