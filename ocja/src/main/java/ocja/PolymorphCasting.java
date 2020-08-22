package ocja;


class A41 {
   public void print() {
       System.out.println("A");
   }
}

class B41 extends A41 {
   public void print() {
       System.out.println("B");
   }
}


class C41 extends B41 {
   public void print() {
       System.out.println("C");
   }
}

public class PolymorphCasting {
   public static void main(String[] args) {
       A41 obj1 = new C41();
       A41 obj2 = new B41();
       C41 obj3 = (C41) obj1;
       C41 obj4 = (C41)obj2;
       obj3.print();
   }
}

