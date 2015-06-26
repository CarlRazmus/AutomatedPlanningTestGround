package MainPackage;
import java.util.ArrayList;
import java.util.HashSet;


public abstract class World {
	protected ArrayList<GameObject> gameObjects;
	protected HashSet<KeyValuePair<String, Object>> worldState;
	
	public World(){
		gameObjects = new ArrayList<>();
		worldState = new HashSet<KeyValuePair<String, Object>>();
	}
}
