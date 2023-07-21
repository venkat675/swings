//equals():compares the ref of to objects
//toString():it returns String representation of object
//getClass():it gives us class name of object
//hashCode():hash code num of obj
//notify():this methos  sends a notification to a thread which is waiting for an object
//notifyAll():this methos  sends a notification for all  waiting for the object
//wait():thread is waiting 
//clone():copy of an existing object
//finalize():this method is called by the garbage collector
//when an object is removed from memory
class Myclas1{
	int x;
	Myclas1(int x){
		this.x=x;
	}
}
class KnwName{
	static void printNmae(Object o1){
		Class c=o1.getClass();
		String name=c.getName();
		System.out.println("the class name="+name);

	}

}

public class Objectclass {
	public static void main(String args[]){
		Myclas1 obj=new Myclas1(6);
		KnwName.printNmae(obj);


	}	
}


