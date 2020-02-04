package 크롤링;


import java.io.FileWriter;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class 네이버증권크롤링3 {

	public static void main(String[] args) throws Exception {
		
		String site = "https://finance.naver.com/item/main.nhn?code=";
		String[] company = {"012690", "005930", "035720", "035420", "017670"};
		String[] name = {"모나리자", "삼성전자", "카카오", "네이버", "SK텔레콤"};
		
		System.out.println("----- 실시간 증권 -----");
		
		for (int i = 0; i < company.length; i++) {
			
			Connection con = Jsoup.connect(site + company[i]);

			Document doc = con.get();
			String today = doc.select("span.blind").get(12).text();
			String s = doc.select("span.blind").get(19).text();
			String high = doc.select("span.blind").get(16).text();
			String low = doc.select("span.blind").get(20).text();
			String date = doc.select("em.date").text();
			String date2 = date.substring(0, 10); // 장마감 자르기, 0~9번 까지의 인덱스
			
			System.out.println("회사명: " + name[i]);
			System.out.println("   날짜: " + date2);
			System.out.println("오늘가: " + today);
			System.out.println("   시가: " + s);
			System.out.println("   고가: " + high);
			System.out.println("   저가: " + low);
			System.out.println("-------------------");
			
			FileWriter f = new FileWriter(date2 + "_" + name[i] + ".txt");
			
			f.write("회사명: " + name[i] + "\n");
			f.write("   날짜: " + date2 + "\n");
			f.write("오늘가: " + today + "\n");
			f.write("   시가: " + s + "\n");
			f.write("   고가: " + high + "\n");
			f.write("   저가: " + low + "\n");
			
			f.close();
			
		}	

	}

}
