
public class Rectangle {
	int lenght;
	int height;
	
	
	public Rectangle (int lenght, int height) {
	
		this.lenght = lenght;
		this.height = height;
		
		
		
	}
	
	public Rectangle() {
		
	}

	public void IsSquare(int a, int b) {
		boolean square = (a == b);
		
		if (square == false) {
			System.out.println("jusu iedotie parametri neatbilst kvadrâta definicijai");
		}else {
			System.out.println("jûsu iedotie parametri atbilst kvadrâta devfinîcijai");
		}
		}
	
	public int Area (int a, int b) {
		int c = a * b;
		System.out.println("figûras laukums ir: " + c);
		return c;
		
	}
	
	public void Perimeter(int a, int b) {
		int c = (a + b) * 2;
		System.out.println("figûras perimetrs ir: " + c);
	}

	@Override
	public String toString() {
		return "Rectangle [lenght=" + lenght + ", height=" + height + "]";
		
	}
	
	

}
