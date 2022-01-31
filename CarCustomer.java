abstract class cars{
    abstract void cost();
    abstract void meilage();
    abstract void hoursepower();
}   
class jaguar extends cars{
      void cost()
      {
           System.out.println("*jaguar Details"); 
          System.out.println("==============================");
         System.out.println(" cost is: 1cr ");
      }
      void meilage()
      {
        System.out.println(" meilage is: 17km/l ");
      }
      void hoursepower()
      {
         System.out.println(" hoursepower is: 568HR ");
      }
}
class Audi extends cars{
   void cost()
   {
          System.out.println("*Audi Details");
        System.out.println("==============================");
       System.out.println(" cost is: 50L ");
   }
   void meilage()
   {
     System.out.println(" meilage is: 12km/l ");
   }
   void hoursepower()
      {
         System.out.println(" hoursepower is: 467HR ");
      }
}
class BMW extends cars{
   void cost()
   {
      
       System.out.println("*BMW Details"); 
       System.out.println("==============================");
       System.out.println(" cost is: 40L ");
   }
   void meilage()
   {
    System.out.println(" meilage is: 10km/l ");
   }
   void hoursepower()
      {
         System.out.println(" hoursepower is: 345HR ");
      }
}
class CarCustomer{
   public static void main(String args[]){
       cars c=new jaguar();
              c.cost();
              c.meilage();
              c.hoursepower();
            c=new Audi();
              c.cost();
              c. meilage();
              c.hoursepower();
            c=new BMW();
              c.cost();
              c.meilage();
              c.hoursepower();

   }
}

