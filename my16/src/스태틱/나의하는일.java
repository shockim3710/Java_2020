package 스태틱;

public class 나의하는일 {

	public static void main(String[] args) {

		Day day1 = new Day("공부", 10, "강남"); // 지역변수인 day1은 스택영역
		Day day2 = new Day("여행", 15, "강원도");
		Day day3 = new Day("운동", 11, "피트니스");
		
		System.out.println(day1);
		System.out.println(day2);
		System.out.println(day3);
		
		day1.play();
		
		System.out.println();
		System.out.println(Day.count + "일의 일과를 출력합니다");
		System.out.println("전체 시간: " + Day.sum + "시간");
		System.out.println("평균 시간: " + (Day.sum / Day.count) + "시간");

	}

}
