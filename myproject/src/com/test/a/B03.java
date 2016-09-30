package com.test.a;

import java.util.*;

public class B03 {
	public static void main(String[] args) {
		new B03().input();
	}

	void input() {
		Scanner s = new Scanner(System.in);
		try {
			System.out.print("���� �Է��Ͻʽÿ�:");
			int month = s.nextInt();

			System.out.print("���� �Է��Ͻʽÿ�:");
			int day = s.nextInt();

			int day_count = count_days(month, day);

			print("�� ��¥�� 1�� �� " + day_count + " ��° ���� �ش�˴ϴ�.");
		} 
		
		finally {
			if (s != null)
				s.close();
		}
	}

	int count_days(int month, int day) {
		int day_count = 0;

		switch (month) {
		case 2:
		case 3:
			day_count = day_count - 3;
			break;
		case 4:
		case 5:
			day_count = day_count - 4;
			break;
		case 6:
		case 7:
		case 8:
			day_count = day_count - 5;
			break;
		case 9:
		case 10:
			day_count = day_count - 6;
			break;
		case 11:
		case 12:
			day_count = day_count - 7;
			break;
		}

		day_count = day_count + ((month - 1) * 31) + day;

		return day_count;
	}

	void print(String str) {
		System.out.println(str);
	}

}
