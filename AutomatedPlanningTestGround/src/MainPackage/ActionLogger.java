package MainPackage;
import java.util.HashSet;


public class ActionLogger {
	
	private static String loggerText;
	
	static void addAction(String actionText){
		loggerText += actionText;
	}
	
	static void logGameObjectState(HashSet<KeyValuePair<String,Object>> state){
		for (KeyValuePair<String,Object> pair : state) {
			loggerText += pair.getKey() + " : " + pair.getValue();
		}
		loggerText += "\n";
	}
	
	static void printLog(){
		System.out.println(loggerText);
	}
}
