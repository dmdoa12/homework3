import java.util.*;
class B04{
	public static void main(String[] args){
		new B04().input();
	}

	void input(){
		Scanner s = new Scanner(System.in);
		System.out.print("연봉을 원단위로 입력하세요 :");
		int year_sal = s.nextInt();

		int income_tax = tax_cal(year_sal);
		print("연봉 금액에 대한 소득세는 "+income_tax+"입니다.");
	}
	
	int tax_cal(int sal){
		double tax;

		if(sal<10000000){
			tax=sal*0.095;
		}
		else if(sal>=10000000 && sal<40000000){
			tax=sal*0.19;
		}
		else if(sal>=40000000 && sal<80000000){
			tax=sal*0.28;
		}
		else{
			tax=sal*0.37;
		}

		return (int)tax;
	}

	void print(String str){
		System.out.println(str);
	}

}
