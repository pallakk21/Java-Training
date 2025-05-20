class janwar
{ void eat(){
    System.out.println("eating");
}

}
 class dog extends janwar{
   void  bark(){
    System.out.println("barking");
   }
 }
class puppy extends dog{
    void lazy(){
        System.out.println("cutieee");
    }
}



public class animal{
    public static void main(String[] args) {
       dog obj = new dog();
       puppy obj = new  puppy();
      

       obj.eat();
       obj.bark();
       obj.lazy();
    }
}