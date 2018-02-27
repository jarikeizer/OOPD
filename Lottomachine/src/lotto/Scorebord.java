package lotto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Scorebord {
	public static List<Integer> leeggeschepteballen(List<Integer> geschepteballen) {
		
		geschepteballen = new ArrayList<>();
		return geschepteballen;
	}
	
	public static List<Integer> plaatsBal(List<Integer> geschepteballen,int gescheptebal){
		geschepteballen.add(gescheptebal);
		
		return geschepteballen;
		
	}

	public List<Integer> sorteerballen(List<Integer> Geschepteballen) {
		// TODO Auto-generated method stub
		Collections.sort(Geschepteballen);
		return Geschepteballen;
	}

	public void printScorebord(List<Integer> geschepteballen, int bonusbal) {
		// TODO Auto-generated method stub
		System.out.println("De geschepteballen zijn: " + geschepteballen.get(0) + " " + geschepteballen.get(1) + " " + geschepteballen.get(2) + " "
				+ geschepteballen.get(3) + " " + geschepteballen.get(4) + " " + geschepteballen.get(5) + "\nen de bonusbal is: " + bonusbal);
		
	}


}
