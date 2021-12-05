//see https://www.youtube.com/watch?v=5gzayWys06o around minute8

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		String nameInput = "";
		int numInput = -1;
		
		//create array list of characters
		ArrayList<Character> CharacterList = new ArrayList<Character>();
		//obtain list of characters
		do{
			nameInput = JOptionPane.showInputDialog("Enter Character name (leave blank to finish)");
	        //System.out.println(input);
	        if(!nameInput.equals("")) {
	        	numInput = Integer.parseInt(JOptionPane.showInputDialog("Enter Initiative for "+nameInput));
	        	//System.out.println(nameInput);
	    		CharacterList.add(new Character(nameInput,numInput));
	        } 
		}while(!nameInput.equals(""));
		
		
		//output sorted initiative
		//doing both console and GU output, feel free to coment them out
		System.out.println("Output...\n"+CharacterList.toString());
		JOptionPane.showMessageDialog(null, CharacterList.toString());

		//use the collections framework to sort the list in reverse order
		//using the Character's overridden "compareTo" method
		Collections.sort(CharacterList, Collections.reverseOrder()); 
		
		System.out.println("Output Sorted...\n"+CharacterList.toString());
		JOptionPane.showMessageDialog(null, CharacterList.toString());
	}

}
