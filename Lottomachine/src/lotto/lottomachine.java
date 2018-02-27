package lotto;

import java.util.ArrayList;

import java.util.List;

public class lottomachine  {
	
	public static Glazenbol glazenbol = new Glazenbol();
	public static Scorebord scorebord = new Scorebord();
	public static List<Integer> AlleBalle = new ArrayList<Integer>();
	public static List<Integer> Geschepteballen = new ArrayList<Integer>();
	public static int pakbonusbal;
	public static void main(String[] args) {

		// TODO Auto-generated method stub
		AlleBalle = Glazenbol.verzamelalleballe();

		Geschepteballen = Scorebord.leeggeschepteballen(Geschepteballen);
		
		
		for(int i = 0; i < 6; i++)
		{
			
			int gescheptebal = Glazenbol.schepbal(AlleBalle);
			Geschepteballen = Scorebord.plaatsBal(Geschepteballen,gescheptebal);
		}
		
		//get bonus bal
		int bonusbal = Glazenbol.schepbal(AlleBalle);
		
		
		//System.out.println("|");
		Geschepteballen = scorebord.sorteerballen(Geschepteballen);
		
		
	
		scorebord.printScorebord(Geschepteballen,bonusbal);
		
		
		
		
	
		
	}
	
	
	

}
