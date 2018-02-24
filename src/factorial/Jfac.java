package factorial;
/*¼ÆËã20µÄ½×³Ë£º20!*/
public class Jfac {
    public static void method2(int i){
	    long result=i;
	    for(int j=2;j<i;j++){
		    result=result*j;
	    }
	    System.out.println(result);	
	    
    }
    public  static void main(String[] args){
    	int i=20;
    	Jfac.method2(i);
			
	}
}