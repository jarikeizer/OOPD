package main;

public class Studieadviseur {
	public static boolean krijgtPositiefStudieadvies(Student s) {
		int aantalcijfershogerdan6 = 0;
		int[] cijfers = s.getCijfers();
		for(int i = 0; i < 8; i++)
		{
			if(cijfers[i] > 6)
			{
				aantalcijfershogerdan6++;
			}
		}
		
		
		if(aantalcijfershogerdan6 >= 4)
		{
			return true;
		}
		else {
			return false;
		}
		
		
	}

}
