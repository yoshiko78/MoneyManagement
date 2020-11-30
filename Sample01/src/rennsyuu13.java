
public class rennsyuu13 {

	public static void main(String[] args) {
		String title = "今週の集会場所";
		String address = "maro0916@gmail.com";
		String text = "今週の集会場所は河原の木の下だよ！";
		email(title,address,text);
	}
	
	public static void email(String title,String address,String text) {
		System.out.println(address + "に以下のメールを送信しました。");
		System.out.println("件名:" + title);
		System.out.println(text);
	}

}
