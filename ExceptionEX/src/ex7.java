class MyException extends Exception{
	private final int ERR_CODE;
	
	public MyException(String msg, int errCode) {
		super(msg);
		ERR_CODE = errCode;
	}
	
	public MyException(String msg) {
		this(msg, 100);
	}
	
	public int getErrCode() {
		return ERR_CODE;
	}
	
}


public class ex7 {
	
	public static void main(String[] args) {
		int n = 10;
		try {
			if( n == 10 )
				throw new MyException("hi",20);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
