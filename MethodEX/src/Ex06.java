import java.util.Scanner;


public class Ex06 {

	public static void whosWin(String c, String y) {
		if(c.equals(y))
			System.out.println("ºñ°å½À´Ï´Ù!");
		
		if(c.equals("r")) {
			if(y.equals("s"))
				System.out.println("Ã¶¼ö ½Â!");
			else if(y.equals("p"))
				System.out.println("¿µÈñ ½Â!");
		}
		else if(c.equals("s")) {
			if(y.equals("p"))
				System.out.println("Ã¶¼ö ½Â!");
			else if(y.equals("r"))
				System.out.println("¿µÈñ ½Â!");
		}
		else if(c.equals("p")) {
			if(y.equals("r"))
				System.out.println("Ã¶¼ö ½Â!");
			else if(y.equals("s"))
				System.out.println("¿µÈñ ½Â!");
		}
	}
	
	public static String input(String msg) {
		Scanner in = new Scanner(System.in);
		System.out.print(msg + " : ");
		String s = in.nextLine(); 
		
		return s;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String c,y;
		System.out.println("°¡À§(s) ¹ÙÀ§(r) º¸(p) Áß ÇÏ³ª¸¦ ÀÔ·ÂÇØÁÖ¼¼¿ä!");
		c = input("Ã¶¼ö");
		y = input("¿µÈñ");
		whosWin(c, y);
		
	}

}
