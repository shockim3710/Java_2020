package 크롤링;


import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class 네이버증권크롤링2 {

	public static void main(String[] args) throws Exception {
		
		String site = "https://finance.naver.com/item/main.nhn?code=";
		String[] company = {"012690", "005930", "035720", "035420", "017670"};
		String[] name = {"모나리자", "삼성전자", "카카오", "네이버", "SK텔레콤"};
		
		System.out.println("-----------------[ 실시간 증권 ]-----------------");
		
		for (int i = 0; i < company.length; i++) {
			
			Connection con = Jsoup.connect(site + company[i]);

			Document doc = con.get();
	
			System.out.println("회사명: " + name[i]);
			System.out.println("오늘가: " + doc.select("p.no_today").text());
			System.out.println("시작가: " + doc.select("td.first").text());
			System.out.println("---------------------------------------------");
			
		}	

	}

}
