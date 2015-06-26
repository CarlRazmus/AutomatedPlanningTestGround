package MainPackage;

import java.awt.Point;
import java.util.HashSet;

public class BallPicker extends MovableObject {

	public BallPicker(Point position) {
		super(position);

		updateState(new HashSet<KeyValuePair<String, Object>>()); //create a empty state;
		
	}

}
