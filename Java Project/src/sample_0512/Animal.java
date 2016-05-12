package sample_0512;

public class Animal {
	protected double weight;
	protected String picture;      //weight, picture는 상속받은 클래스에서 활용 못하지만  private -> protected로 바꾸면 쓸 수 있다.

	public Animal() {weight=99; picture = "Animal";}
	
	void eat() {System.out.println("eat()가 호출되었음");}
	void sleep() {System.out.println("sleep()가 호출되었음");}
			

}
