package primeNumber;
/*����1~100��������*/
public class Jprime {

     public static int method3(){
    	 int result=0;
 		 for(int i=2;i<=100;i++){
 			result+=method4(i);
 			
 		 }
 		 return result;
     }
     //�ж�һ�����Ƿ�����������Ƿ���ԭ������ �粻����������0
	 public static int method4(int i){
    	 
    	 for(int j=2;j<i;j++){
    		 if(i%j==0){
    			 return 0;
    		 } 
    		 
    	 }
    	 return i;
     }
	 public static void main(String args[]){
		 System.out.println(Jprime.method3());
		 System.out.println(Jprime.method4(3));
		 
	 }
}

