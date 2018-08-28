package Week1;

public class Maryland extends State {
	Maryland() { /* null constructor */	}

	public void printMe() {
		System.out.println("Read it.");
	}

	public static void main(String[] args) {
		Region east = new State();
		State md = new Maryland();
		Object obj = new Place();
		Place usa = new Region();

		// method overriding 
		md.printMe();
		
		// method overriding 
		east.printMe();
		
		// casting subclass obj as the super class Place
		// ...then setting obj equal to md
		((Place)obj).printMe();
		obj = md;
		
		// casting subclass obj as the super class state
		// ...then setting obj equal to usa
		((Maryland)obj).printMe();
		obj = usa;
		
		// casting obj as superclass Maryland
		// ...then setting usa equal to md
		((Place)obj).printMe();
		usa = md;
		
		// casting usa as superclass Place
		((Place)usa).printMe();
		
	}
}