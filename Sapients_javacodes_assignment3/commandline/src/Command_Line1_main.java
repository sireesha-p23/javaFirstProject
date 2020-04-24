
public class Command_Line1_main {
	public static void main(String[] args) {
		if(args.length>0)
		{
			Command_Line1 arr=new Command_Line1();
			for(int i=0;i<args.length;i++)
			{
				int num=Integer.parseInt(args[i]);
				arr.setData(num,i);
			}
			arr.calData(args.length);
			arr.displayData();
		}
		else
		{
			System.out.println("no arguments");
		}
	}
}
