
public class thiskeyword {

	
	private int x;
	
	thiskeyword(){
		this(55);
		this.access();
		}
	thiskeyword(int x){
		this.x=x;
	}	
	public void access()
	{
		System.out.println("x is :"+x);
	}

	public static void main(String[] args) {
		
		thiskeyword tw=new thiskeyword();
	}

}
