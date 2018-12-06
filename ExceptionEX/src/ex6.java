import java.io.File;
import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		File f = createFile(name);
		System.out.println( f.getName() + " ���� ���� �Ϸ�");
	}
	
	static File createFile(String fileName) {
		try {
			if(fileName == null || fileName.equals(""))
				throw new Exception("���� �̸��� ��ȿ���� ����");
		} catch( Exception e) {
			fileName = "�������.txt";
			System.out.println(e.getMessage());
		} finally {
			File f = new File(fileName);
			createNewFile(f);
			return f;
		}
	}
	static void createNewFile(File f) {
		try {
			f.createNewFile();
		}catch(Exception e) {
			
		}
	}

}