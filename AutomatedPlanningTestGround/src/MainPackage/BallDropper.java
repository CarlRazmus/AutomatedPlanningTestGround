package MainPackage;

import java.awt.Point;
import java.util.HashSet;


public class BallDropper extends MovableObject {
	
	public BallDropper(Point point){
		super(point);
		
		HashSet<KeyValuePair<String, Object>> startState = new HashSet<KeyValuePair<String,Object>>();
		startState.add(new KeyValuePair(ValidStateNames.stateNames.holdsBall, true));
		
		updateState(startState);
	}
}
