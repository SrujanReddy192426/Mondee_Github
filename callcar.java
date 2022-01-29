abstract class carc{
    abstract void cost();
    abstract void meilage();
    abstract void hoursepower();
}   
class jaguarcr extends carc{
      void cost()
      {
            System.out.println("*jaguacr Details"); 
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
class Audicr extends carc{
   void cost()
   {
          System.out.println("*Audicr Details"); 
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
class BMWcr extends carc{
   void cost()
   {
      
       System.out.println("*BMWss Details"); 
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
class carfactory{
    carc getdata(String...x){
        if(x[0].equals("jaguarcr"))
         return new jaguarcr();
         else if(x[1].equals("Audicr"))
          return new Audicr();
          else if(x[2].equals("BMWcr"))
          return new BMWcr();
          else 
          return null;
    }
}
class callcar{
    public static void main(String...srujan)
    {
        carfactory cf=new carfactory();
                carc c=cf.getdata("jaguarcr");
                c.cost();
                c.meilage();
                c.hoursepower();
    }
}