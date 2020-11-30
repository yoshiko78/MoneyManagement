
public class rennsyuu14 {

	public static void main(String[] args) {
		String address = "maro0916@gmail.com";
		String text = "今週の集会場所は河原の木の下だよ！";
		email(address,text);
	}
	public static void email(String address,String text) {
		System.out.println(address + "に以下のメールを送信しました。");
		System.out.println("件名:無題");
		System.out.println(text);
	}
	public static void email(String address,String title,String text) {
		System.out.println(address + "に以下のメールを送信しました。");
		System.out.println("件名" + title);
		System.out.println(text);
	}
}
