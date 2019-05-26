package charAt_scanners_optionDialogs;

import javax.swing.JOptionPane;

public class choose_your_own_advanture {


public static void main(String[] args) {
	

String one =JOptionPane.showInputDialog(null, "Once opon a time you were in a magical place called shen. You meet a man named John and he says that he is the most awsome person in the world. Do you believe him?");

if (one .equals ("yes")) {
	JOptionPane.showMessageDialog(null, "he says he will give you an autograph. He says wait here. He leaves and comes back with a gun and shoots you. You died.");
	System.exit(0);
}


else {
	JOptionPane.showMessageDialog(null, "You walk away and while you do a sourcer kills John");

}


String two = JOptionPane.showInputDialog(null, "The sourcerer droped his wand after he cast his spell. Do you kill the sourcerer with his own wand using avadra cadavara?");

if (two .equals ("yes")) {
	JOptionPane.showMessageDialog(null, "you blasted the sourcerer to nothing more than a pile of ash.");

}
	
	else {
		JOptionPane.showMessageDialog(null, "the sourcerer then picks up his wand and blasts you to peices. You died.");
	System.exit(0);
	}
	
String three = JOptionPane.showInputDialog(null, "After you kill the sourcerer his wand explodes. A full grown winged fire breathing dragon is born he takes the sky. Do you take Johns gun and shoot it or not? Yes or no?");

if (three .equals ("yes")) {
	JOptionPane.showMessageDialog(null, "the dragon is not affected. The dragon just gets mad and burns you to death with his fire breath. You died.");
System.exit(0);
}

else {
	JOptionPane.showMessageDialog(null, "the dragon flies in the air.");
}

String four = JOptionPane.showInputDialog(null, "when the dragon flies in tje air do you run?");

if (four .equals ("yes")) {

	JOptionPane.showMessageDialog(null, "the dragon sees you run and thinks you are an enemy. It burns you to death with its fire breath. You died.");
	System.exit(0);
}
	
	else {
		JOptionPane.showMessageDialog(null, "the dragon turns out to help whoever killed its old master. You get on its back and fly away to another world.");
	}

String five = JOptionPane.showInputDialog(null, "you and your dragon land at a place called Christopher. The ground starts to rumble. It is John the demon coming back from the dead. He wants revenge on you for not thinking he is the most awesome person in the world. Do you tgake the dragon and run?");

if (five .equals("yes")) {
	JOptionPane.showMessageDialog(null, "John the demon shoots bones and skulls at you. You died");
	System.exit(0);
	
}

else {
	JOptionPane.showMessageDialog(null, "the demon shoots bones and skulls at you, but the dragon shoots fire balls at them and destroys the bones and skulls in mid air.");
	
}

String six= JOptionPane.showInputDialog(null, "You see that the demon does not have bones covering a spot in his body. Do you run at that spot and slice it?");

if (six .equals ("yes")) {
	JOptionPane.showMessageDialog(null, "the demon sees you coming and easly shoots you with bones and since he is in close range the dragon doesn't have enough time to deflect the shot. You died.");
System.exit(0);
}

else {
	JOptionPane.showMessageDialog(null, "the demon runs at you. You pick up the sowrd on the dragons back and swing it at the demon. It is back to regular John.");
}


String seven = JOptionPane.showInputDialog(null, "do you let John live?");

if (seven .equals ("yes")) {
	JOptionPane.showMessageDialog(null, "John takes a gun out of his pocket and shoots you. You died");
System.exit(0);
}

else {
	JOptionPane.showMessageDialog(null, "After you kill John he implodes and all that is left of him is a lot of dust and a golden shield amde of pure gold.");
	
}

String eight = JOptionPane.showInputDialog(null, "do you pick up the golden shield?");

if (eight .equals ("no")) { 
	
	JOptionPane.showMessageDialog(null, "a winged beast shoots lava at you. You died");
System.exit(0);	
}

else {
	JOptionPane.showMessageDialog(null, "a winged beast shoots a fireball at you. you deflect it with the sheild and it deflects back to the winged beast and killed it. You and your dragon live happely ever after.");
}






















































}









































}
