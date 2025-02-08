package Assignments;

public class Assignment1 {
    public static void main(String[] args) {
        Participants p1 = new Participants("Rohit", 1234567889L, "Computer");
        System.out.println("Hi "+p1.getName()+" Your RegistrationId is="+p1.getRegistrationId());

        Participants p2 = new Participants("Sayali", 1988612300L, "Mechanical");
        System.out.println("Hi "+p2.getName()+" Your RegistrationId is="+p2.getRegistrationId());
    }
}
class Participants{
    static int counter;
    String registrationId="D1001";
    String name;
    long contactNumber;
    String branch;

    static {
        counter=1000;
    }
    //  constructors
    Participants(String name,long contactNumber,String branch){
        this.branch=branch;
        this.contactNumber=contactNumber;
        this.name=name;
        this.registrationId="D"+(++counter);
    }
    String getRegistrationId(){
      return registrationId;
    }
    int getCounter(){
      return counter;
    }
    void setCounter(int counter){
       Participants.counter=counter;
    }
    String getName(){
     return name;
    }
    void setName(String name){
      this.name=name;
    }
    long getContactNumber(){
     return contactNumber;
    }

    void setContactNumber(long contactNumber){
      this.contactNumber=contactNumber;
    }
    String getBranch(){
     return branch;
    }
    void setBranch(String branch){
      this.branch=branch;
    }
}
