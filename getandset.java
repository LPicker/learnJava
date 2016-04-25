//Getter's and setter's with encapsulation example

public class Car{
    
    private String name ;
    private int price ;

   public void setName(String carname){
   
       name = carname;
   
   }
   
  
   public String getName(){
             
            return name;
   
   }
  
  
   
   public void setPrice(int price){
   
     this.price = price; //this refers to class member
   
   }
  
   public int getPrice(){
   
                 return price;
   }
  


   public static void main(String[] args){
     
       Car c = new Car();
       c.setName("BMW");
       c.setPrice(10000);
        
         System.out.println("Car name:"+c.getName());
         System.out.println("Car price:"+c.getPrice());
     
   }

}

