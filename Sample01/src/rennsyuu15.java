
public class rennsyuu15 {

	public static void main(String[] args) {
		double triangleArea = calcTriangleArea(10.0,5.0);
		System.out.println("三角形の面積は" + triangleArea + "平方センチメートルです。");
		double circleArea = calcCircleArea(5.0);
		System.out.println("円の面積は" + circleArea + "平方センチメートルです。");
	}
	public static double calcTriangleArea(double bottom,double height) {
		double area = bottom * height /2;
		return area;
	}
	public static double calcCircleArea(double radius) {
		double area = radius * radius *3.14;
		return area;
	}

}

