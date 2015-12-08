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
	private StringBuilder reverseEvaluatee = new StringBuilder("");
	
	public StringReversal(String evaluatee){
		this.evaluatee = evaluatee;
	}
	
	public StringBuilder evaluateeToStringBuilder(){
		return new StringBuilder(evaluatee);
	}
	
	public void setEvaluatee(String evaluatee){
		this.evaluatee = evaluatee;
	}
	
	public String getEvaluatee(){
		return evaluatee;
	}
	
	public StringBuilder iterativeReversal(){
		
		StringBuilder reversedEvaluatee = new StringBuilder();
		int evaluateeLength = evaluatee.length();
		for(int i = evaluateeLength-1; i > -1; i--){
			reversedEvaluatee.append(evaluatee.charAt(i));
		}
		return reversedEvaluatee;
	}
	
	public StringBuilder recursiveReversal(StringBuilder evaluatee){
		if(evaluatee.length() == 0)
			return reverseEvaluatee;
		else{
			reverseEvaluatee.append(evaluatee.charAt(evaluatee.length()-1));
			evaluatee = evaluatee.deleteCharAt(evaluatee.length()-1);
			return recursiveReversal(evaluatee);
		}
	}

	
	public static void main(String[] args) {
		StringReversal test = new StringReversal("Andrew");
		System.out.println(test.iterativeReversal());
		test.setEvaluatee("Luke");
		System.out.println(test.recursiveReversal(test.evaluateeToStringBuilder()));




	}
}
