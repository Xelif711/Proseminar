import java.util.*;
import java.lang.*;

class A {

	abstract class innerB  implements Runnable{
		void doSomething(){
		
		}
	}
	
	void vC (){
	
		class localvC extends C{
		
			void doSomethingDifferent(){
			//...
			}
		}
	}
}
class C{

	static class innerC{

	}
}
