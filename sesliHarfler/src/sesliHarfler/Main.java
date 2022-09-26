package sesliHarfler;

public class Main {

	public static void main(String[] args) {
		
		char harf='A';
		
		
		switch(harf) {
		case 'A':
		case 'O':
		case 'U':
			System.out.println("Bu bir kalin sesli harf.");
			break;
		case 'E':
		case 'I':
			System.out.println("Bu bir ince sesli harf");
		}

	}

}
