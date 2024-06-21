package acc;

public class main {
	private int num;
	private main() {
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	private static main m;
	public static main getobj()
	{
		if(m==null)
		{
			m=new main();
		}
		return m;
	}
	
}
 