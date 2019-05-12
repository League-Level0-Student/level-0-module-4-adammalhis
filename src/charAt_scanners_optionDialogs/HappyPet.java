package charAt_scanners_optionDialogs;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel = 0; 
	public static void main(String[] args) {
			// 5. Use user input to call the appropriate method created in step 4.
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
		String Pet = JOptionPane.showInputDialog(null, "what pet do you want to buy?");
		 
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do to make your pet happy?", "Pet", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "give it food", "give it a toy", "play with it ball" }, null);
if (task == 0) {
	method (); 
}
	if (task == 1) {
		method2 (); 
		
	}

if (task == 2) {
	method3 ();
	
}
	

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	}
public static void method() {
	happinessLevel=happinessLevel-5; 
JOptionPane.showMessageDialog(null, "your pet got diabetes got muscle pain and killed you!");






}
public static void method2() {
	happinessLevel=happinessLevel+3;
	JOptionPane.showMessageDialog(null, "Your pet choked on the toy got angry and killed you!");
	
	
}



public static void method3() {
	happinessLevel=happinessLevel-100;
	JOptionPane.showMessageDialog(null, "Your pet thought that you were the ball and killed you!");
	
	
}







}