
public class rennsyuu11 {

	public static void main(String[] args) {
		//1
		int [] points;
		points = new int[4];
		
		//2
		double [] weight;
		weight = new double[5];
		
		//3
		boolean [] answers;
		answers = new boolean[3];
		
		//4
		String [] name;
		name = new String[3];
		
		int[] moneyList = new int[] {121901,8302,55100};
		for (int i = 0; i < moneyList.length; i++ ) {
			System.out.println(moneyList[i]);			
		}
		
		int[] moneyList1 = {121901,8302,55100};
		for (int i : moneyList1) {
			System.out.println(i);
		}
		
		int[] numbers = {3,4,9};
		System.out.println("1桁の数字を入力してください");
		int input = new java.util.Scanner(System.in).nextInt();
		for(int n : numbers) {
			if(input == n) {
				System.out.println("アタリ！！");
			} else {
				System.out.println("ハズレ！！");
			}
		}	
	}
}
