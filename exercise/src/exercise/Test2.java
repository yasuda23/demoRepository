package exercise;

public class Test2 {
	public static void main(String[] args) {
		double t = 0.1;
		int n =0;
		while(t <3776000) {
			//１回折る
			n++;
			t *=2;
			System.out.println("新聞紙" + n + "回折った時の厚さは" + t + "㎜");
			
		}
	}
}
