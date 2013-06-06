
public class guessgamemain {
Player p1;
Player p2;
Player p3;
//instance variables 

public void startGame() {
	p1 = new Player();
	p2 = new Player();
	p3 = new Player();
	//player objects
	
	int guessp1 = 0;
	int guessp2 = 0;
	int guessp3 = 0;
	//guess variables
	
	boolean p1isright = false; 
	boolean p2isright = false;
	boolean p3isright = false;
	//false variables
	
		int targetnumber = (int)(Math.random()*10);
		System.out.println("i'm  thinking of a number between 0 and 9");
		
		while (true) {
			System.out.println("number to guess is " + targetnumber);
			
			p1.guess();
			p2.guess();
			p3.guess();
			//each players guess method
			
			guessp1 = p1.number;
			System.out.println("player one guessed " + guessp1);
			guessp2 = p2.number;
			System.out.println("player two guessed " + guessp2);
			guessp3  = p3.number;
			System.out.println("player three guessed " + guessp3);
			//gets result of guess
			
			if (guessp1 == targetnumber){
				p1isright = true;
			}
			if (guessp2 == targetnumber){
				p2isright = true;
			}
			if (guessp3 == targetnumber){
				p2isright = true;
			}
			// checking to see if guesses match target number
			if (p1isright || p2isright || p3isright){
				//if this person is right or this person or this person
				
System.out.println("we have a winner");
System.out.println("player one got it right " + p1isright);
System.out.println("player two got it right " + p2isright);
System.out.println("player three got it right " + p3isright);
System.out.println("game is over");
break;
//breaking the loop

}else{
// nobody got it right
System.out.println("players were incorrect GG");
}//ending if false
}//ending loop
}//end method
}//end class
