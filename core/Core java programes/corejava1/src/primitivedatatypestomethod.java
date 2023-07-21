class primitivedatatypes {

	void swap(int num1,int num2)
	{
		int temp;
		temp=num1;
		num1=num2;
		num2=temp;
	}
}
class primitivedatatypestomethod{
	public static void main(String[] args) {
		int num1=10,num2=20;

		primitivedatatypes pd=new primitivedatatypes();
		
		System.out.println(num1+"\t"+num2);
		
		pd.swap(num1, num2);
		
		System.out.println(num1+"\t"+num2);		
	}

}
