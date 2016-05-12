package sample_0512_2;

public class Lion extends Animal{
	private int legs;
	
	
	
	public Lion() {
		super(100, "KING");
		this.legs = 4;
	}         //source -> generate constructor using field
	
	
	void roar() {System.out.println("roar()가 호출되었음");}
	void infor() {System.out.println(weight +" "+picture );}

}
