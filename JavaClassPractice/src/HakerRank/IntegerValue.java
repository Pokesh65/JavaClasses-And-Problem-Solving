package HakerRank;

import java.util.Scanner;

public class IntegerValue {
	
//	5
//	-150
//	150000
//	1500000000
//	213333333333333333333333333333333333
//	-100000000000000

	public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=Byte.MIN_VALUE && x<=127){
                    System.out.println("* byte");
                }
                if(x>=-32768 && x<=Short.MAX_VALUE){
                    System.out.println("* short");
                }
                if(x>=-2147483648 && x<=2147483647){
                        System.out.println("* int");
                }
                if(x>=-9223372036854775808L  && x<=9223372036854775807L ){
                    System.out.println("* long");
                    
                }
            
                
                
            }
            catch(Exception e)
            {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }

        }
    }

}
