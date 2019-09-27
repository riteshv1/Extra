package extra;

public class Anonymous_class {
	public static void main(String[] args) { 
		  
         
        Age oj1 = new Age() { 
            @Override
            public void getAge() { 
                 // printing  age 
                System.out.println("Age is "+x); 
            } 
        }; 
        oj1.getAge(); 
        Age oj2 = new Age() {
        	public void getAge() { 
                // printing  age 
               System.out.println("Age is "+25); 
           } 
        };
        oj2.getAge();
	}
}
