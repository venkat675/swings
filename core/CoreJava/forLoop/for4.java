/*Version : 1
This program uses break and continue
using for construct
Author  : Team - J
*/
package forLoop;
public class for4
{  
	public static void main(String args[]){
                int no=10;
                int i=1,j;
                        for(i=1;i<100;i++)
                        {
                           if ( (i %2 ) == 0)
                               continue;
                               //break;
                           System.out.println(i);
                        }
                
        }

}
