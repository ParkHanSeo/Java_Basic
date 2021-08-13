package Array;

import java.util.Arrays;

public class arrayInitialization3 {

	public static void main(String[] args) {

		//int[] score = new int[] {50, 60, 70, 80, 90};
		int[] score = {50, 60, 70, 80, 90};
		
		for(int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
			
		}
			System.out.println(Arrays.toString(score));
			//System.out.println(score);
	}

}
