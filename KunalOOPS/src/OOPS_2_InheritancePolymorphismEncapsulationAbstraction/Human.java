package OOPS_2_InheritancePolymorphismEncapsulationAbstraction;

public class Human extends Species {
    String gender;
   Human(double height, double weight, double length,String gender){
       super(height,weight,length);
       System.out.println("weight is="+super.gender);
       this.gender=gender;
   }
}
