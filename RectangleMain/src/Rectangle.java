
public class Rectangle extends Shape {
	public enum Unit {
		meters, centimetres, milimetres;

	}

	Unit uni;
	int lenght;
	int height;

	public Rectangle() {

	}

	public Rectangle(int lenght, int height) {

		this.lenght = lenght;
		this.height = height;

	}

	public Rectangle(int lenght, int height, Unit uni) {

		this.uni = uni;
		this.lenght = lenght;
		this.height = height;

	}

	public int Area() {
		int c = lenght * height;

		return c;

	}

	public int Perimeter() {
		int c = (height + lenght) * 2;
		return c;
	}

	public String toString() {
		return "Rectangle [lenght=" + lenght + ", height=" + height + "]";

	}

}
