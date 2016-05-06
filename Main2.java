import java.util.Scanner;
public class HelloWorld{
     public static void main(String []args){
	/*
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int sum = 0;
                 
        for(int i = 0;i <= n;i++){
            if(i%2 != 0) sum += i;
        }
        System.out.println(sum);
        */
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        
        int d = b*b-4*a*c;
        if(d > 0){
        	System.out.println((-b+Math.sqrt(d))/(2*a)+"\n"+(-b-Math.sqrt(d))/(2*a));
        }
        else if(d == 0){
        	System.out.println(-b/(2*a));
        }
        	 else{
        		 System.out.println("???");
        	 }
     }
}
