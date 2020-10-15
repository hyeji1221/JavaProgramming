package week3_example;

// 예제 3-9 for-each 문을 이용한 반복문 활용
public class foreachEx {
	public static void main(String[] args) {
		int[] num = {1,2,3,4,5};
		String names[] = {"사과", "바나나", "체리", "딸기", "포도"};
		int sum = 0;
		
		for (int k : num)
			sum+=k;
		System.out.println("합은 " + sum);
		for (String s : names)
			System.out.print(s + " ");
		System.out.println();
	}

}
