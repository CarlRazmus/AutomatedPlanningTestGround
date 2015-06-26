package Actions;
import java.util.HashSet;

import MainPackage.GameObject;
import MainPackage.KeyValuePair;


public abstract class Action {
	private HashSet<KeyValuePair<String, Object>> preconditions;
	private HashSet<KeyValuePair<String,Object>> effects;
	 
    private boolean inRange = false;
 
    /* The cost of performing the action.
     * Figure out a weight that suits the action.
     * Changing it will affect what actions are chosen during planning.*/
    public float cost = 1f;
 
    /**
     * An action often has to perform on an Object. This is that Object. Can be null. */
    public GameObject target;
 
    public Action() {
        preconditions = new HashSet<KeyValuePair<String, Object>> ();
        effects = new HashSet<KeyValuePair<String, Object>> ();
    }
 
    public void doReset() {
        target = null;
        reset ();
    }
 
    /**
     * Reset any variables that need to be reset before planning happens again.
     */
    public abstract void reset();
 
    /**
     * Is the action done?
     */
    public abstract boolean isDone();
 
    /**
     * Procedurally check if this action can run. Not all actions
     * will need this, but some might.
     */
    public abstract boolean checkProceduralPrecondition(GameObject agent);
 
    /**
     * Run the action.
     * Returns True if the action performed successfully or false
     * if something happened and it can no longer perform. In this case
     * the action queue should clear out and the goal cannot be reached.
     */
    public abstract boolean perform(GameObject agent);
 
    /**
     * Does this action need to be within range of a target game Object?
     * If not then the moveTo state will not need to run for this action.
     */
    public abstract boolean requiresInRange ();
     
 
    /**
     * Are we in range of the target?
     * The MoveTo state will set this and it gets reset each time this action is performed.
     */
    public boolean isInRange () {
        return inRange;
    }
     
    public void setInRange(boolean inRange) {
        this.inRange = inRange;
    }
 
 
    public void addPrecondition(String key, Object value) {
        preconditions.add (new KeyValuePair<String, Object>(key, value) );
    }
 
 
    public void addEffect(String key, Object value) {
        effects.add (new KeyValuePair<String, Object>(key, value) );
    }
 
     
    public HashSet<KeyValuePair<String, Object>> getPreconditions() {
            return preconditions;
    }
 
    public HashSet<KeyValuePair<String, Object>> getEffects() {
            return effects;
    }
}
	
