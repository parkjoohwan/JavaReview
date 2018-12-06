import java.io.File;
import java.util.Scanner;

public class ex6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		File f = createFile(name);
		System.out.println( f.getName() + " 파일 생성 완료");
	}
	
	static File createFile(String fileName) {
		try {
			if(fileName == null || fileName.equals(""))
				throw new Exception("파일 이름이 유효하지 않음");
		} catch( Exception e) {
			fileName = "제목없음.txt";
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
