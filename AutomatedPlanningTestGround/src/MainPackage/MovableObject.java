package MainPackage;

import java.awt.Point;
import java.util.ArrayList;
import java.util.HashSet;

public class MovableObject extends GameObject {
	HashSet<KeyValuePair<String, Object>> state;
	private ArrayList<HashSet<KeyValuePair<String, Object>>> goals;
	
	
	public MovableObject(Point position) {
		super(position);
	}
	
	public HashSet<KeyValuePair<String, Object>> getState(){
		return state;
	}
	
	public void updateState(HashSet<KeyValuePair<String, Object>> newState){
		state = newState;
	}

	public ArrayList<HashSet<KeyValuePair<String, Object>>> getGoals() {
		return goals;
	}

	public void updateGoals(ArrayList<HashSet<KeyValuePair<String, Object>>> goals) {
		this.goals = goals;
	}
}
