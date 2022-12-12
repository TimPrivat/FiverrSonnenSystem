import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PShape;


public class SolarSystem extends PApplet {
	
	PShape earth;
	PShape earthShadow;
	PImage erde;
	PImage erdeSchatten;
	
	public static void main(String[] args) {
		PApplet.main("SolarSystem");
		
	}
	
	public void settings() {
		
		size(1440, 900);
		
	}
	
	public void setup() {
		
		background(0);
		
		
		
		erde = loadImage("test.png");
		erdeSchatten = loadImage("test2shadow.png");
		
		earth = createShape(RECT, 0,0,16,16);
		earth.setTexture(erde);
		
		earthShadow = createShape(RECT, 0,0,16,16);
		earthShadow.setTexture(erdeSchatten);
		
	}
	
	public void draw() {
		
		circle(660, 380, 25);
		shape(earth, 250, 250);
		shape(earthShadow, 250,250);
		
	}
	

}
