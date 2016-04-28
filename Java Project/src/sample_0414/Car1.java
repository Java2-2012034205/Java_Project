package sample_0414;

public class Car1 {
   private int man;
   private int tire;
   private String color;

   public Car1() {this(4,3,"red");} //man=4; tire=3; color="red";}
   public void setMan(int man){
	   this.man = man;
 }
   public void all_setting(int tire, String color){
	   this.tire = tire;
	   this.color = color;
   }
   public int getMan() { 
	  System.out.println("man"); return man; 
 }
   
   void pr(){
 	  System.out.println("man : "+man+" tire : "+tire+" color: "+color+"");
}
   public Car() {}
   public Car1(int man, int tire, String color){
	   this.man = man; this.tire = tire; this.color = color;
   }
}