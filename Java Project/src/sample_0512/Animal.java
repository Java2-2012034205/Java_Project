package sample_0512;

public class Animal {
	protected double weight;
	protected String picture;      //weight, picture�� ��ӹ��� Ŭ�������� Ȱ�� ��������  private -> protected�� �ٲٸ� �� �� �ִ�.

	public Animal() {weight=99; picture = "Animal";}
	
	void eat() {System.out.println("eat()�� ȣ��Ǿ���");}
	void sleep() {System.out.println("sleep()�� ȣ��Ǿ���");}
			

}
