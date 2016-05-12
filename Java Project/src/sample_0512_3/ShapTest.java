package sample_0512_3;

public class ShapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    // Shap s1 = new Shap();
    Rectangle r1 = new Rectangle();
    Circle c1 = new Circle();
    
    //s1.move(_99, _99);
    r1.move(111, 111);
    c1.move(999, 999);
    infor(r1);
    infor(c1);
	}

	static void infor(Rectangle r) {r.info(); }
	static void infor(Circle c) {c.info(); }
	
}
