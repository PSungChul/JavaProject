package ex5_work;

import java.util.Random;

public class Word {
	//strArr배열에서 단어하나를 랜덤으로 골라낸다.
	//골라낸 단어를 랜덤으로 섞어서 문제를 출제하고, 정답을 맞혀보다!!
	
	//문제 : PEALP
	//>> ealpp
	//ealpp 오답...
	//>> apple
	//apple 정답!!

	String[] strArr = {"CHANGE", "JAVA", "SPRING", "ANDROID", "APPLE"};
	private String answer;//정답을 저장할 변수
	private String shake = "";//문제를 만드는 변수
	
	//정답 반환 메서드
	public String getAnswer() {
		int idx = new Random().nextInt( strArr.length );
		answer = strArr[idx];
		return answer;
	}
	
	//정답을 섞어서 문제로 만드는 메서드
	public String getScramble() {
		
		//정답 단어를 문자 단위로 끊어서 저장
		int[] inArr = new int[answer.length()];
		
		//inArr배열에 중복되지 않는 난수를 넣는다
		outer : for( int i = 0; i < inArr.length; ) {
			
			inArr[i] = new Random().nextInt(answer.length());
			
			for( int j = 0; j < i; j++ ) {
				if( inArr[i] == inArr[j] ) {
					continue outer;
				}
			}//inner
			
			i++;
		}//outer
		
		for( int i = 0; i < answer.length(); i++ ) {
			shake += answer.charAt( inArr[i] );
		}//for
		
		return shake;
		
	}//getScramble()
}
