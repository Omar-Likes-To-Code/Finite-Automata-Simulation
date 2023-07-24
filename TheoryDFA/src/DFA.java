import java.util.ArrayList;

public class DFA {
	
	ArrayList<String> states;
	ArrayList<String> alphabet;
	ArrayList<Transition> transitions;
	String startState;
	ArrayList<String> acceptStates;
	
	public DFA(ArrayList<String> states , ArrayList<String> alphabet , ArrayList<Transition> transitions , 
	String startState , ArrayList<String> acceptStates) {
		
		this.states = states;
		this.alphabet = alphabet; 
		this.transitions = transitions;
		this.startState = startState;
		this.acceptStates = acceptStates;
		
	}
	
	 public void display() {
		
		System.out.println(  "states"  );
		System.out.println(  this.states  );
		System.out.println(  "alphabet"  );
		System.out.println(  this.alphabet  );
		
		System.out.println(  "transition states"  );
		for( Transition trans : this.transitions) {
			trans.printTransition();
		}
		
		System.out.println(  "startState"  );
		System.out.println(  this.startState  );
		System.out.println(  "acceptStates"  );
		System.out.println(  this.acceptStates  );

		
		
	}	
	
	
// modify the code inside this method
public  String isLanguageDFA( String input) {

	return "";
}

//modify the code inside this method
public DFA mergeDFA(  DFA secondDFA  ,  boolean isUnion) {
	
	return null;
}

	public static void main(String[] args) {
		// TODO Auto-generated method stube

	}

}
