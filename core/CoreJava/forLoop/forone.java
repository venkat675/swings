/*Version : 1
Program using for construct
1+1/1!+1/2!+1/3!+1/4!
Author  : Team - J
*/
package forLoop;
public class forone
{  
	public static void main(String args[]){
                int i,j,no;
                int sum=1;
                int prod;
                for(i=1 ; i<5;i++){
                        //find factorial of i
                           prod=1;
                           for(j=1;j<=i;j++){
                                prod=prod * j;
           
                           }
                   System.out.println(prod);
                   sum=sum + 1/prod;
                }
                System.out.println(" sum = " + sum);
        }

}
