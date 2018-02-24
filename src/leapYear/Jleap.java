package leapYear;
/*闰年判断*/
public class Jleap {
	 private int year;
	 
	 
     public int getYear() {
		return year;
	  }


	 public void setYear(int year) {
		this.year = year;
	 }


	 public static void main(String args[]){
	    /* 每4年一次  但是到了整百的时候 不是闰年  但是整400年的时候一次闰年  四年一闰  百年不闰  四百年再闰   */
		int year=2020;
		if (year>0){
		   if((year%4==0&&year%100!=0)||year%400==0){
			   System.out.println("闰年");
		   }else{
			   System.out.println("平年");
		   }
		}else{
			System.out.println("不是年份");
		}
     }	
	 
}
