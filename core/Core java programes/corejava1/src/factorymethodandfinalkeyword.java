import java.text.NumberFormat;


public class factorymethodandfinalkeyword {

	
	public static void main(String[] args) {
	
		final double PI=(double)22/7;
		double r=15.5;
		
		double area=PI*r*r;
		System.out.println("area is:="+area);
		
		NumberFormat obj=NumberFormat.getNumberInstance();
		
		obj.setMaximumFractionDigits(2);
		obj.setMinimumIntegerDigits(7);
		
		String str=obj.format(area);
	
		System.out.println("formated area is="+str);
	}

}
