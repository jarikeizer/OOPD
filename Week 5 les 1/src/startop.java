import java.util.ArrayList;


import processing.core.PApplet;

public class startop extends PApplet {
	
	Radioknop knop1 = new Radioknop(this,100,100,100,100);
	Radioknop knop2 = new Radioknop(this,250,100,100,100);
	Radioknop knop3 = new Radioknop(this, 400, 100, 100, 100);
	Radioknop knop4 = new Radioknop(this,100,250,100,100);
	Radioknop knop5 = new Radioknop(this,250,250,100,100);
	Radioknop knop6 = new Radioknop(this,400,250,100,100);
	ArrayList<Radioknop> knoppen = new ArrayList<Radioknop>();
	ArrayList<Radioknop> knoppen2 = new ArrayList<Radioknop>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PApplet.main(new String[] { "startop" });
	}

	public void setup() {
		background(0);
		knoppen.add(knop1);
		knoppen.add(knop2);
		knoppen.add(knop3);
		knoppen2.add(knop4);
		knoppen2.add(knop5);
		knoppen2.add(knop6);
	
	}

	public void settings() {
		size(500, 500);
	}

	public void draw() {
		for(Radioknop p: this.knoppen)
		{
			p.tekenKnop();
			
		}
		for(Radioknop p: this.knoppen2)
		{
			p.tekenKnop();
			
		}
		
	}
	
	public void mousePressed() { 
		for(Radioknop p: this.knoppen)
		{
			
			if(p.isMuisOverKnop() == true)
			{
			
				p.schakel(knoppen);
			}
		}
		for(Radioknop p: this.knoppen2)
		{
			
			if(p.isMuisOverKnop() == true)
			{
			
				p.schakel(knoppen2);
			}
		}
	
	}

}
