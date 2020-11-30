
public class rennsyuu06 {

	public static void main(String[] args) {
		
		//すっきり分かるJava入門　ｐ135問題3-1
		//1
		
		int weight = 60;
		if(weight == 60) {
			System.out.println("OK");
		} else {
			System.out.println("ERROR");
		}
		
		//2
		int age1 = 15;
		int age2 = 20;
		if((age1 + age2)*2 > 60) {
			System.out.println("OK");
		} else {
			System.out.println("NO");
		}
		
		//3
		int age = 114514;
		if(age % 2 == 1 ) {
			System.out.println("OK");
		} else {
			System.out.println("NO");
		}
		
		//4
		String name = "湊";
		if (name.equals("湊")) {
			System.out.println("OK");
		} else {
			System.out.println("NO");
		}
	}
}
