package questions.strings;

public class StringReversal {

	/**
	 * Problem: Reverse a string iteratively and recursively
	 * 
	 * Ex) 'Luke' --> 'ekuL', 'Andrew' --> 'werdnA'
	 * 
	 *  
	 *  Complexity: O(N). Only need to iterate through the String's characters once
	 */
	private String evaluatee;
	
	public StringReversal(String evaluatee){
		this.evaluatee = evaluatee;
	}
	
	public StringBuilder iterativeReversal(){
		
		StringBuilder reversedEvaluatee = new StringBuilder();
		int evaluateeLength = evaluatee.length();
		for(int i = evaluateeLength-1; i > -1; i--){
			reversedEvaluatee.append(evaluatee.charAt(i));
		}
		return reversedEvaluatee;
	}
	
	public String recursiveReversal(int i){
		
		return recursiveReversal(i-1);
	}
	
	public static void main(String[] args) {
		StringReversal test = new StringReversal("Andrew");
		System.out.println(test.iterativeReversal());

	}
}
