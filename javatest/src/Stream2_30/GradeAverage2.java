package Stream2_30;

import java.util.Arrays;
import java.util.stream.IntStream;

// ReportCard는 이전 예제에서 구현한 클래스를 이용한다.

/***
 * flasMap 사용 2
 * @author User
 *
 */
public class GradeAverage2 {

	public static void main(String[] args) {
		ReportCard[] rc2 = { new ReportCard(70, 80, 90),
							 new ReportCard(90, 80, 70),
							 new ReportCard(80, 80, 80)			
						   };
		
		Arrays.stream(rc2)
			  .flatMapToInt( s-> IntStream.of(s.getKor(), s.getEng(), s.getMath()))
			  .average()
			  .ifPresent( avg -> System.out.println(avg));
			  
	}

}
