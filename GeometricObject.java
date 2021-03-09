package eddu.smg;


public abstract class GeometricObject implements Comparable<GeometricObject> {
	protected String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;

	public abstract double getArea();
	

	public GeometricObject() {
		dateCreated = new java.util.Date();
	}

	public GeometricObject(String color, boolean filled) {
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public boolean isFilled() {
		return filled;
	}

	public void setFilled(boolean filled) {
		this.filled = filled;
	}

	public java.util.Date getDateCreated() {
		return dateCreated;
	}

	public String toString() {
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}
	
	@Override
	public int compareTo(GeometricObject o) {
		// TODO Auto-generated method stub
		if(getArea()>o.getArea()) {
			return 1;
		}
		else if (getArea()<o.getArea()) {
			return -1;
		}
		return 0;
	}
	
}