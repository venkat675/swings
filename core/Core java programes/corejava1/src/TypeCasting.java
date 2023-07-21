//converting one data type to another data type is called type casting
//widenning: converting lower to up
//narowinging: converting up to lower


class Onet{
		int i=10;
		void show(){
			System.out.println("Super class method of i "+i);
		}

	}

	class Twot extends Onet{
		int i=20;
		void show(){
			System.out.println("Sub class method of i "+i);

				}

	}

	public class TypeCasting {
		public static void main(String args[]){
			
			//Onet o;//o is a super class reference
		//	o=(Onet)new Twot();//o is referring to sub class object
			//widening
			//o.show();//sub clas of method of i
			
			
			
			// class cast Exception
			 Twot t;//t is sub referenc
			  t=(Twot) new Onet();
			  //the above is narrowing
			  t.show();
			 
		}

	}


