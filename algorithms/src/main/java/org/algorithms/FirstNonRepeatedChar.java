package org.algorithms;

public class FirstNonRepeatedChar {

	public static void main(String[] args) {
		String s = "ffeeddbbalk";
		boolean isRepeated;
		outerloop:
			for(int i=0;i<s.length();i++) {
				isRepeated = false;
				for(int j=0;j<s.length();j++) {
					if(i!=j && s.charAt(i) == s.charAt(j)) {
						isRepeated=true;
					break;
				} 
			}
			if(!isRepeated) {
				System.out.println( s.charAt(i));
				break outerloop;
			}
		}

	}

}
