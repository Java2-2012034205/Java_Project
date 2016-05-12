package sample_0512_2;

public class Animal {
	protected double weight;
	protected String picture;      //weight, picture는 상속받은 클래스에서 활용 못하지만  private -> protected로 바꾸면 쓸 수 있다.

	public Animal() {
		weight=99; picture = "Animal";
		System.out.println("Eagle cont");
	}
	
	public Animal(double weight, String picture) {
		this.weight = weight;
		this.picture = picture;
		System.out.println("Animal Cont2");
	} // source -> generate constructor

	void eat() {System.out.println("eat()가 호출되었음");}
	void sleep() {System.out.println("sleep()가 호출되었음");}
			

}
