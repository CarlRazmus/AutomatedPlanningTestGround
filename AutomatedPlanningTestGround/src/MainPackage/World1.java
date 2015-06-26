package MainPackage;

import java.awt.Point;


public class World1 extends World {
	
	
	
	public World1(){
		super();
		initialize();
	}

	private void initialize() {
		//the World is a 3 bricks long and 3 bricks high
		gameObjects.add(new BallDropper(new Point(1,1)));
		gameObjects.add(new BallPicker(new Point(3,3)));
	}
}
