package game_engine;

import processing.core.PApplet;

public class GraphiceEngineApp extends PApplet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PApplet.main(new String[] { "GraphiceEngineApp" });
	}
	
	public void setup() {
		background(0);
	}
	public void settings() {
		size(500, 500);
	}
	public void draw(){
		this.rect(100,100,100,100);
	}


}
