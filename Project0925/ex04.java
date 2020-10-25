package ex0925;
public class ex04 {
	public static void main(String[] args) {

		//int[] A = new int[10];
		//int[] B = new int[10];
		int[] A = {6,2,3,6,5,9,7,8,13,10};
		int[] B = {3,2,5,4,9,6,7,8,1,10};
		int[] C = new int[10];
	
		for(int i = 0; i < 10; i++)
		{
			C[i] = A[i] + B[i];
			//﻿ A와 B에 기억된 내용을 같은 첨자 위치의 값끼리 더하여 
			// 배열 C의 같은 첨자 위치에 저장
			System.out.print(C[i] + " ");
			// 배열 C 출력
		}
	}
}