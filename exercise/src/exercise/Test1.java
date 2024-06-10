package exercise;

public class Test1 {
	public static void main(String[] args) {
		int N = 8;
		for(int i = 1; i <= N; i ++ ) { //N段分の繰り返し
			for(int j = 1; j <= i; j++) {  //段数と同じだけ■を出す
				System.out.print("■ ");
			}
			System.out.println(); //改行
	}
	}
}