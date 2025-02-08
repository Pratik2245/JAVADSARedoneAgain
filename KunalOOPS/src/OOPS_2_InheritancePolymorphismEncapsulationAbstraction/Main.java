package OOPS_2_InheritancePolymorphismEncapsulationAbstraction;

public class Main {
    public static void main(String[] args) {
//    Species s=new Species(10,20,30);
//    System.out.println(s.height+" "+s.weight+" "+s.length);
//    Human h=new Human(10,20,30,"male");
//    System.out.println(h.height+" "+h.weight+" "+h.length);
//    System.out.println(h.gender);

//    creating species reference and human constructor
        Species s1=new Human(100,200,300,"female");
        System.out.println(s1.height);
//        Human s1= new Species(100,200,300,"male");//incompatible types: Species cannot be converted to Human

//        System.out.println(s1.gender);
    }
}
