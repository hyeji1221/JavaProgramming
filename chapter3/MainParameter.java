package week3_example;

// 예제 3-13 : main()의 인자들을 받아서 평균값을 계산하는 예제
public class MainParameter {
	public static void main(String[] args) {
		double sum = 0.0;
		for (int i = 0; i<args.length; i++)
			sum += Double.parseDouble(args[i]);
		System.out.println("합게 :"+sum);
		System.out.println("평균 :" +sum/args.length);
	}
}
