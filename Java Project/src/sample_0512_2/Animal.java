package sample_0512_2;

public class Animal {
	protected double weight;
	protected String picture;      //weight, picture�� ��ӹ��� Ŭ�������� Ȱ�� ��������  private -> protected�� �ٲٸ� �� �� �ִ�.

	public Animal() {
		weight=99; picture = "Animal";
		System.out.println("Eagle cont");
	}
	
	public Animal(double weight, String picture) {
		this.weight = weight;
		this.picture = picture;
		System.out.println("Animal Cont2");
	} // source -> generate constructor

	void eat() {System.out.println("eat()�� ȣ��Ǿ���");}
	void sleep() {System.out.println("sleep()�� ȣ��Ǿ���");}
			

}
