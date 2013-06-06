
public class Player {
	int number = 0; //this is the guess
	
	public void guess() {
		number = (int)(Math.random()* 10);
		System.out.println("im guessing" + number);
		
	}
}
