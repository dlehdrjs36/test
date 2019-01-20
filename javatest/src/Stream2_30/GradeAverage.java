package Stream2_30;

import java.util.Arrays;

import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/***
 * flatMap 사용1
 * @author User
 *
 */
class ReportCard {
	private int kor; // 국어 점수
	private int eng; // 영어 점수
	private int math; // 수학 점수
	
	public ReportCard() {}

	public ReportCard(int kor, int eng, int math) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}
}
public class GradeAverage {

	public static void main(String[] args) {
		ReportCard[] rc = { new ReportCard(60,70,80),
							new ReportCard(70,80,80),
							new ReportCard(100,90,80)
						  };
		
		//ReportCard 인스턴스로 이루어진 스트림 생성
		Stream<ReportCard> stm = Stream.of(rc);
		Stream<ReportCard> stm2 = Arrays.stream(rc);
		
		//학생들의 점수 정보로 이루어진 스트림 생성
		IntStream si = stm.flatMapToInt( n-> IntStream.of(n.getKor(), n.getEng(), n.getMath()));
		IntStream si2 = stm2.flatMapToInt( n-> IntStream.of(n.getKor(), n.getEng(), n.getMath()));
		
		//평균을 구하기 위한 최종연산 수행
		//OptionalDouble od = si.average(); // OptionalDouble 반환
		//double db = od.getAsDouble(); // double 형 반환
		double db = si.average().getAsDouble();
		double db2 = si2.average().getAsDouble();
		System.out.println(db);
		System.out.println(db2);
		System.out.println((int)Math.ceil(db2)/10);
		
		switch( (int)Math.ceil(db2)/10) {
			case 1 :
			case 2 :
			case 3 :
			case 4 :
			case 7 :
				System.out.println("미달 70~79");	
				break;
			case 8 :
				System.out.println("도달");
				break;
			default : 
				System.out.println("확인 중");
				
		}
		
	}
}
