package Array;

public class arrayLength {

	public static void main(String[] args) {
		
		//int[] score = new int[6];
		int[] score = new int[5];
		
		//for문에서 즉 array의 길이를 score.length를 사용하는 것이 코드의
		//관리가 쉽고 에러가 발생할 확률이적어진다.
		/*for(int i = 0; i < 5; i++) {
			System.out.println(score[i]);
		}*/
		for(int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
		}
		
		

	}

}
