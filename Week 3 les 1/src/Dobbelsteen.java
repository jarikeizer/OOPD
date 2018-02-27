import java.util.Random;

public class Dobbelsteen {
	Random rn = new Random();
	int waardedobbelsteen;

	public Dobbelsteen() {
		

	}

	public int werpdobbelsteen() {

		return rn.nextInt(6);
	}
}
