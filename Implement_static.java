public class Implement_static {
	static int a = 1;
    public static void implementStatic() {
        a++;  
        System.out.println(a);
    }

    public static void main(String[] args) 
	{    
        implementStatic(); 
        implementStatic(); 
    }
}
