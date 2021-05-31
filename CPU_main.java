
class CPU
{
	int price;
	public void disp(int pri)
	{
		System.out.println("\nCPU DETAILS\n");
		System.out.println("PRICE  = "+pri);

	}

	class Processor
	{
		int no_of_cores;
		String manufacturer;
		public void disp(int core,String manu)
		{
			System.out.println("\nPROCESSOR DETAILS\n");
			System.out.println("NUMBER OF CORES  = "+core);
			System.out.println("MANUFACTURER     = "+manu);
		}

	}
	static class RAM
	{
		static int memory;
		static String manufacturer;
		public void disp(int my,String m)
		{
			System.out.println("\n--RAM DETAILS--\n");
			System.out.println("MEMORY         = "+my);
			System.out.println("MANUFACTURER   = "+m);
		}
	}
}
class CPU_main
{
	public static void main(String args[])
	{
		CPU c=new CPU();
		c.disp(20000);
		CPU.Processor p=c.new Processor();
		p.disp(4,"Intel");
		CPU.RAM r=new CPU.RAM();
		r.disp(8,"Micron");
	}
}


