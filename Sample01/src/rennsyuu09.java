
public class rennsyuu09 {

	public static void main(String[] args) {
		System.out.print("[メニュー]1：検索2：登録3：削除4：変更>");
		int selected = new java.util.Scanner(System.in).nextInt();
		
		switch (selected) {
		case 1 :
			System.out.println("1.検索します");
		break;
		case 2 :
			System.out.println("2.登録します");
		break;
		case 3 :
			System.out.println("3.削除します");
		break;
		case 4 :
			System.out.println("4.変更します");
		break;			
		}
	}
}
