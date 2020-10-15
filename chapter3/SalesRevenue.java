package week3_example;

// 예제 3-10 : 3년간 매출 총액과 평균 구하기
public class SalesRevenue {
	public static void main(String[] args) {
		int intArray[][] = {{90, 90, 110, 110},
				{120,110,100,110}, {120,140,130,150}};
		double sum = 0;
		
		for (int i = 0; i<intArray.length; i++) 
			for (int j = 0; j<intArray[i].length; j++)
				sum += intArray[i][j];
		System.out.println("지난 3년간 매출 총액은 " + sum + "이며 연평균 매출은 "
				+ sum/intArray.length+"입니다.");
	}
}
