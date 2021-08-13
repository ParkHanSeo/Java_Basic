package Array;

public class arrayEx5 {

	public static void main(String[] args) {
		
		int sum = 0;
		int average = 0;
		
		int[] score = {100, 88, 100, 100, 90};
		
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		
		average = sum / score.length;
		
		System.out.println("총점 : "+sum);
		System.out.println("평균 : "+average);

	}

}
