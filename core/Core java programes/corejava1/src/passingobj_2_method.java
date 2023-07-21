class Emp{
	int id;
	Emp(int id){
		this.id=id;

	}
}
class Chek{
	void swap(Emp e1,Emp e2){
		Emp o;
		o=e1;
		e1=e2;
		e2=o;
	}
}
public class passingobj_2_method {
	public static void main(String args[]){
		Emp e1=new Emp(10);
		Emp e2=new Emp(20);

		Chek c=new Chek();
		System.out.println(e1.id+"\t"+e2.id);
		c.swap(e1, e2);
		System.out.println(e2.id+"\t"+e1.id);

	}
}