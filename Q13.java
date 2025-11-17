class Year {
	int year;
	
	Year(int year) {
		this.year=year;
		}
	}
	class LeapYear extends Year { 
	
	LeapYear(int year) {
		super(year);
	}
	
	void checkLeapYear() {
		if((year%400==0)||(year%4==0&&year%100!=0)) {
			System.out.println(year+"is a Leap Year");
			}
			else {
				System.out.println(year+"is NOT a Leap Year");
				}
			}
		}
	public class Q20 {
		public static void main(String[] args) {
			LeapYear y1=new LeapYear(2024);
			y1.checkLeapYear();
			
			LeapYear y2=new LeapYear(2023);
			y2.checkLeapYear();
		}
	}
	