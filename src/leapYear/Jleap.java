package leapYear;
/*�����ж�*/
public class Jleap {
	 private int year;
	 
	 
     public int getYear() {
		return year;
	  }


	 public void setYear(int year) {
		this.year = year;
	 }


	 public static void main(String args[]){
	    /* ÿ4��һ��  ���ǵ������ٵ�ʱ�� ��������  ������400���ʱ��һ������  ����һ��  ���겻��  �İ�������   */
		int year=2020;
		if (year>0){
		   if((year%4==0&&year%100!=0)||year%400==0){
			   System.out.println("����");
		   }else{
			   System.out.println("ƽ��");
		   }
		}else{
			System.out.println("�������");
		}
     }	
	 
}
