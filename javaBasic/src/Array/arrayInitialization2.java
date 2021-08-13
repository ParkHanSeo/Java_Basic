package Array;

public class arrayInitialization2 {

	public static void main(String[] args) {
	
		int[] score = new int[5];
		
		for(int i = 0; i < score.length; i++) {
			score[i] = i * 10 + 50;
			System.err.println(score[i]);
		}

	}

}
