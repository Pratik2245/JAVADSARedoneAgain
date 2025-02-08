//package ClassWork;
//import java.lang.*;
//import java.lang.reflect.Constructor;
//
//public class Employee implements  Cloneable {
//    int emp_id=123;
////    default constructor
//    Employee(){
//        System.out.println("default constructor called");
//    }
//    Employee(int emp_id){
//        this.emp_id=emp_id;
//        System.out.println(emp_id);
//    }
//    void s(int a){
//
//    }
//    int s(){
//
//    }
//    @Override
//    public Employee clone(){
//        try {
//            return (Employee) super.clone();
//        }catch (CloneNotSupportedException e){
//            throw  new AssertionError();
//        }
//    }
//    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
//     Employee e=new Employee();
////     creating class using newInstance Method
////        Class<?> employeeClass=Class.forName("ClassWork.Employee");
////        Constructor <?> constructo=employeeClass.getDeclaredConstructor();
////     Employee e1=(Employee) Class.forName("ClassWork.Employee").newInstance();
////     creating class using Object.clone() it act as a copy constructor
////        1.to create object using clone method we should extend it to Clonable interface
//
//     Employee e2=e.clone();
//        System.out.println("Employee id="+e2.emp_id);
//    }
//}
//
