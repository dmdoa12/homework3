package com.test.a;

import java.util.*;

public class B02 {

	public static void main(String[] args) {
		new B02().input();
	}

	void input() {
		Scanner s = new Scanner(System.in);
		try {
			System.out.print("����Ʈ�� �о� ����(��������)�� �Է��Ͻÿ�:");
			double m2_area = s.nextDouble();
			double pyung_area = m2_area / 3.305;

			String kinds = apartment_categori(pyung_area);
			System.out.printf("����Ʈ�� ������ %.2f �Դϴ�.\n", pyung_area);
			print(kinds + " ����Ʈ �Դϴ�.");
		}

		finally {
			if (s != null)
				s.close();
		}
	}

	String apartment_categori(double pyung) {
		String kinds = "";
		if (pyung > 0 && pyung < 15) {
			kinds = "����";
		} else if (pyung >= 15 && pyung < 30) {
			kinds = "�߼���";
		} else if (pyung >= 30 && pyung < 50) {
			kinds = "����";
		} else if (pyung >= 50) {
			kinds = "����";
		}
		return kinds;
	}

	void print(String str) {
		System.out.println(str);
	}

}
