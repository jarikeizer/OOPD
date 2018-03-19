import java.util.ArrayList;

import processing.core.PApplet;

public class Radioknop extends Switch implements IDoelwit{

	public Radioknop(PApplet app, float x, float y, float breedte, float hoogte) {
		super(app, x, y, breedte, hoogte);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void schakel(ArrayList<Radioknop> knoppen) {
		// TODO Auto-generated method stub
		for(Radioknop p: knoppen)
		{
			p.isAan = false;
		}
		isAan = !isAan;	
		
		
	}
	public void handelInteractiAf() {
		
		
	}
	public void tekenKnop() {
		app.ellipseMode(PApplet.CENTER);
		app.noStroke();
		app.fill(255);
		app.ellipse(x, y, breedte, hoogte);
		if (isAan) {
			app.fill(0);
			app.ellipse(x, y, breedte - breedte/4, hoogte - hoogte/4);
		}

	}
	public boolean isMuisOverKnop() {
		
		if (PApplet.dist(app.mouseX, app.mouseY, x, y) < breedte/2) {
			
			return true;
		}
		else {
			return false;
		}

		
	}
	@Override
	public void schakel() {
		// TODO Auto-generated method stub
		
	}
}
