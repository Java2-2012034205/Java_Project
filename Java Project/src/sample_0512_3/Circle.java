package sample_0512_3;

public class Circle extends Shap{

	private int r;
	
	public Circle() {r=3;}
	
	public void move(int _x, int _y){ x = _x+r; y = _y+r; }

	public void info() {System.out.println("C x : "+x+" y : "+ y);}
}
