package shape1;

public class Point implements Drawable, Visible{
	private int x;
	private int y;
	
	
	public Point(){}
	public Point(int x , int y){
		this.x = x;
		this.y = y;
	}
	
	public void show(boolean visible){
		if(visible == true){
			show();
		} else {
			System.out.println("x좌표 : "+this.getX()+ ", y좌표 : "+this.getY()+"에 점을 지웠습니다.");
		}
	}
	
	public void show(){
		System.out.println("x좌표 : "+this.getX()+ ", y좌표 : "+this.getY()+"에 점을 그렸습니다.");
	}
	
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	
	
	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("x좌표 : "+this.getX()+ ", y좌표 : "+this.getY()+"에 점을 그렸습니다.");

	}

	@Override
	public void visible(boolean visivle) {
		if(visivle == true){
			draw();
		} else {
			System.out.println("x좌표 : "+this.getX()+ ", y좌표 : "+this.getY()+"에 점을 지웠습니다.");
		}
		
	}
	
	
	
}
