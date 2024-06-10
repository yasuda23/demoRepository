package exercise;

public class First {

	public static void main(String[] args) {
		
		String name;
		
		name = "Tech World";
		
		if(name.equals("Tech World")) {
			System.out.println("Tech World");			
		}
		else {
            System.out.println("hello");
		}
		
		int num =0;
		
		
		for(int i=0; i<=20; i++) {
			if(i%3 ==0) {
			System.out.println("数値は" + num +"です。");
			}
			num++;
			
		}
			
			
	}

}
