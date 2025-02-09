class A2 {
    static {
        System.out.println("static block is invoked");
    }

	// To remove warning
	void ignore(){}
}
public class Static_block
{
	public static void main(String[] args)
	{
		A2 a2 = new A2();
		a2.ignore();
	}
}