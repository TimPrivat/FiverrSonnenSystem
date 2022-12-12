import processing.core.PApplet;


public class SolarSystem extends PApplet {
	
	public static void main(String[] args) {
		PApplet.main("SolarSystem");
		
	}
	
	public void settings() {
		
		size(1440, 900);
		
	}
	
	public void setup() {
		
		background(0);
		
		stroke(255,255,0);
		fill(255,255,0);
		
	}
	
	public void draw() {
		
		circle(660, 380, 24);
		
	}
	

}
