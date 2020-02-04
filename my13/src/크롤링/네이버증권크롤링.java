package 크롤링;


import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class 네이버증권크롤링 {

	public static void main(String[] args) throws Exception {
		
		String site = "https://finance.naver.com/item/main.nhn?code=005930";
		// 모나리자
		
		Connection con = Jsoup.connect(site);
		
		System.out.println("1. 사이트 연결 성공");
		
		Document doc = con.get();
		
		System.out.println("2. 연결된 사이트에서 문서를 다 가지고 오기");
		System.out.println("3. 내용 ----------------------");
		System.out.println(doc);
		
		System.out.println("4. 전체 문서 중에서 원하는 정보를 추출");
		System.out.println();
		System.out.println("*************** 실시간 증권 ***************");
		System.out.println(doc.select("p.no_today").text());
		System.out.println(doc.select("td.first").text());
		
		// pipe 연산
		// cal.add().mul().minus()

	}

}
