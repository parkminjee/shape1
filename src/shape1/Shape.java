package shape1;

public abstract class Shape implements Visible{

	private String color;


	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public abstract void draw();
	
	public abstract double calculateArea();

}