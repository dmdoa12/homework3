package com.test.a;

import java.util.*;
public class B01 {

	public static void main(String[] args) {
		new B01().input();
		
	}
	void input(){
		Scanner s = new Scanner(System.in);
		System.out.print("���ڸ� � �Է��Ͻǰ��� ���Ͻÿ�:");
		int n = s.nextInt();
		int[] num = new int[n];
		int max_num=Integer.MIN_VALUE,min_num=Integer.MAX_VALUE;
		
		for(int i=0; i<n; i++){
			System.out.print((i+1)+"��° ����:");
			num[i] = s.nextInt();
		}
		
		for(int i=0; i<n; i++){
			max_num=Math.max(max_num,num[i]);
			min_num=Math.min(min_num,num[i]);
		}
		
		print("���� ū ���� "+max_num+"�̰�, ���� ���� ����"+min_num+"�Դϴ�.");
	}
	
	void print(String str){
		System.out.println(str);
	}
}
