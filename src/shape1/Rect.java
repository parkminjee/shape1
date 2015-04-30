package shape1;

public class Rect extends Shape implements Drawable{
	private int width;
	private int height;
	
	
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
	
	@Override
	public void draw(){
		System.out.println("네모그림");
	}

	@Override
	public double calculateArea() {
		
		return width * height;
	}

	@Override
	public void visible(boolean visible) {
		// TODO Auto-generated method stub
		if(visible == false){
			System.out.println("그림을 그릴 수 없습니다.");
		}
	}
	
	
}
