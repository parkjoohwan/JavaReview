import java.util.regex.*;


public class EXRegex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 *  정규표현식
		 *  면접에서 자주 물어보기도 하고 실제 업무에서 많이 사용된다고 함
		 *  비밀번호 유효성 체크 / 이메일 유효성 체크 / 전화번호 추출 / html에서 텍스트 마이닝 등에 사용됨
		 *  [a-z], [0-9]등과 같이 소문자 알파벳, 숫자 인지 아닌지 체크 할 수도 있고
		 *  해당 문자열의 a,b,c 등의 개별 문자로 시작하는지 아닌지 등의 판단도 가능함
		 *  *로 뒤에 무슨 문자던지 상관 없다는것을 나타낼수도 있고, ^등의 연산자로 해당 문자가 몇개, 등의 판단도 가능함
		 *  사실상 문자열에 대한 모든 매칭 여부가 판단 가능함
		 */
		
		String[] data = {"bat", "baby", "bonus", "cA"};
		Pattern p = Pattern.compile("[a-z]*");
		for(int i = 0 ; i < data.length ; i ++) {
			Matcher m = p.matcher(data[i]);
			if(m.matches())
				System.out.println(data[i] + ",");
		}
	}

}
