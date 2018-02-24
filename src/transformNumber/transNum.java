package transformNumber;

public class transNum {
       public static void main(String args[]){
    	   int[] a={5,10,15,25,90,64};
    	   /*for(int i=0;i<a.length;i++){
    	   *        System.out.println(a[i]);
    	   *}
    	   **/ 
    	   //Ã°ÅÝÅÅÐò
    	   for(int i=0;i<a.length-1;i++){
    	       for(int j=0;j<a.length-1-i;j++){
    	         if(a[j]<a[j+1]){
    	            int tem=a[j];
    	            a[j]=a[j+1];
    	            a[j+1]=tem;
    	         }
    	       }
    	       for(int b:a){
    	         System.out.println(b+",");
    	       }
    	      System.out.println();
    	   }
       }
}
