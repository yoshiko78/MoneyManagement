import java.util.Random;

public class rennsyuu04 {
	public static void main(String[] args) {
		System.out.println("ようこそ占いの館へ");
		System.out.println("あなたの名前を入力してください");
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください");
		String ageString = new java.util.Scanner(System.in).nextLine();
		int age = Integer.parseInt(ageString);
		int fortune = new Random().nextInt(4);
		fortune++;
		System.out.println("占いの結果がでました！");
		System.out.println(age + "歳の" + name + "さん、" + "あなたの運勢は" + fortune + "です！");
		System.out.println("大吉：1 中吉：2 小吉：3 凶：4");
		
	}

}
