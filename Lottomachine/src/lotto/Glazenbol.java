package lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Glazenbol {
	public static List<Integer> verzamelalleballe() {
		List<Integer> alleBalle = new ArrayList<Integer>();
		// TODO Auto-generated method stub
		for(int i = 1; i <= 45; i++)
		{
			alleBalle.add(i);
			
		}
		return alleBalle;
	}
	
	public static int schepbal(List<Integer> AlleBalle) {
		Random r = new Random();
		int balindex = r.nextInt(AlleBalle.size());
		int randombal = AlleBalle.get(balindex);
		AlleBalle.remove(balindex);
		return randombal;
		
	}
	
}
