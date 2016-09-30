package com.test.a;

import java.util.*;
public class B01 {

	public static void main(String[] args) {
		new B01().input();
		
	}
	void input(){
		Scanner s = new Scanner(System.in);
		System.out.print("수자를 몇개 입력하실건지 정하시오:");
		int n = s.nextInt();
		int[] num = new int[n];
		int max_num=Integer.MIN_VALUE,min_num=Integer.MAX_VALUE;
		
		for(int i=0; i<n; i++){
			System.out.print((i+1)+"번째 숫자:");
			num[i] = s.nextInt();
		}
		
		for(int i=0; i<n; i++){
			max_num=Math.max(max_num,num[i]);
			min_num=Math.min(min_num,num[i]);
		}
		
		print("가장 큰 수는 "+max_num+"이고, 가장 작은 수는"+min_num+"입니다.");
	}
	
	void print(String str){
		System.out.println(str);
	}
}
