package shape1;

public class Triangle extends Shape implements Drawable{
	private int height;
	private int width;
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	
	@Override
	public void draw() {
		System.out.println("세모그림");
		
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return height*width/2;
	}
	@Override
	public void visible(boolean visible) {
		// TODO Auto-generated method stub
		if(visible == false){
			System.out.println("그림을 그릴 수 없습니다.");
		}
	}
	
}
