
public class SingletonDoubleCheckedLocking {
	
	 private volatile static SingletonDoubleCheckedLocking _instance = null; 
	 //public String testString;
	 private SingletonDoubleCheckedLocking() {
	 }
	 
	 public static synchronized SingletonDoubleCheckedLocking getInstanceTS() { 
		 
		 if (_instance == null) { 
			 _instance = new SingletonDoubleCheckedLocking();
		}
		 return _instance;
	}

	 /*  this is faster/more efficient
	  
	 public static Singleton getInstanceDC() { 
		 if (_instance == null) {
			 synchronized (Singleton.class) {
				 if (_instance == null) {
					 _instance = new Singleton();
				}
			} 
		} 
		
		 return _instance;
	}
*/
}
