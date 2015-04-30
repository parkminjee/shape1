package shape1;

public class Circle extends Shape implements Drawable{
	private int radius;
	
	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("원그림");
		
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return radius*radius*3.14;
	}

	@Override
	public void visible(boolean visible) {
		// TODO Auto-generated method stub
		if(visible == false){
			System.out.println("그림을 그릴 수 없습니다.");
		}
	}

}
