package shape1;

public class ShapeTest {
	public static void main(String[] args) {
		
//		Drawble drawable = new Point(3, 4);
//		drawable.draw();
		
//		Circle c = new Circle();
//		System.out.println(c instanceof Circle);
//		System.out.println(c instanceof Shape);
//		System.out.println(c instanceof Visible);
//		
//		//System.out.println(c instanceof Rect); 빨간줄 상속관계에있어야 됨 
//		
//		Shape s = c;
//		System.out.println(s instanceof Rect);
		
		Circle c = new Circle();
		c.setRadius(3);
		c.setColor("red");
		c.draw();
		System.out.println("넓이 : "+c.calculateArea());
		System.out.println("색 : "+c.getColor());
		System.out.println();
		
		Rect r = new Rect();
		r.setHeight(3);
		r.setWidth(4);
		r.setColor("blue");
		r.draw();
		System.out.println("넓이 : "+r.calculateArea());
		System.out.println("색 : "+r.getColor());
		System.out.println();
		
		Triangle t = new Triangle();
		t.setHeight(3);
		t.setWidth(4);
		t.setColor("green");
		t.draw();
		System.out.println("넓이 : "+t.calculateArea());
		System.out.println("색 : "+t.getColor());
		
	}
}
