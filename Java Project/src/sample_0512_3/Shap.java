package sample_0512_3;

abstract public class Shap {
	protected int x, y;

	public Shap() {x = 0; y = 0;}
	
	public Shap(int _x, int _y){
		x = _x; this.y= _y;
	}
	
	abstract public void move(int _x, int _y); //{this.x+=_x; y+=_y;}
}
