package creationalPatSingle;

public class SingClass {
	private static SingClass instance = new SingClass();
	   
    public SingClass() {}
    
    public static SingClass getInstance() {
    	System.out.println(instance);
        return instance;
        
    }
    
    public String showMessage() {
        return("I'm a singleton object!");   
    }

}
