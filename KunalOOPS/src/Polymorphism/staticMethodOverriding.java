//package Polymorphism;
//
//public class staticMethodOverriding {
//    public static void main(String[] args) {
//                Child obj = new Child();
//                obj.show(); // Output: Parent static method (NOT Child's method)
//
//    }
//    class Parent {
//        static void show() {
//            System.out.println("Parent static method");
//        }
//    }
//
//    class Child extends Parent {
//        static void show() { // This hides the parent's static method, not override
//            System.out.println("Child static method");
//        }
//    }
//}
