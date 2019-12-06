package ZohairGithubProject;
import java.util.*;
public class Brackets {
	public static boolean equalBrackets(String str) {
		
		String openBrackets = "([{";
		String closeBrackets = ")]}";
		Map<Character, Character> matchingBrackets = new HashMap<Character, Character>();
		matchingBrackets.put(')', '(');
		matchingBrackets.put(']', '[');
		matchingBrackets.put('}', '{');
		List<Character> stack = new ArrayList<Character>();
		for (int i = 0; i < str.length(); i++) {
			char alphabet = str.charAt(i);
			if(openBrackets.indexOf(alphabet) != -1) {
				
				stack.add(alphabet);
			} else if (closeBrackets.indexOf(alphabet) != -1) {
				if(stack.size() == 0) {
					return false;
				}
				if (stack.get(stack.size() -1 ) == matchingBrackets.get(alphabet)) {
					stack.remove(stack.size() - 1);
				} else {
					return false;
				}
			}
		}
		return stack.size() == 0; 
	}
}
