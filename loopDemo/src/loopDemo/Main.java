package loopDemo;

public class Main {

	public static void main(String[] args) {
		//for
		for (int i=1;i<10;i++) {
			
			System.out.println(i);
		}
		System.out.println("Dongu bitti");
		
		//while
		int i=1;
		while(i<10) {
			
			System.out.println(i);
			i+=2;
		}
		
		System.out.println("While dongusu bitti");
		//Do-While
		int j = 1;
		do {
			System.out.println(j);
			j+=2;
		}
		while(j<10);
		
		System.out.println("Do-While dongusu bitti");
	}

}
