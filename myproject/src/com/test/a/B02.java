package com.test.a;
import java.util.*;
public class B02 {

	public static void main(String[] args) {
		new B02().input();
	}
	
	void input(){
		Scanner s = new Scanner(System.in);
		
		System.out.print("아파트의 분양 면적(제곱미터)를 입력하시오:");
		double m2_area = s.nextDouble();
		double pyung_area = m2_area/3.305;
		
		String kinds = apartment_categori(pyung_area);
		System.out.printf("아파트의 평형은 %.2f 입니다.\n",pyung_area);
		print(kinds+" 아파트 입니다.");
	}
	String apartment_categori(double pyung){
		String kinds = "";
		if(pyung>0 && pyung<15){
			kinds="소형";
		}
		else if(pyung>=15 && pyung<30){
			kinds="중소형";
		}
		else if(pyung>=30 && pyung<50){
			kinds="중형";
		}
		else if(pyung>=50){
			kinds="대형";
		}
		return kinds;
	}
	void print(String str){
		System.out.println(str);
	}

}
