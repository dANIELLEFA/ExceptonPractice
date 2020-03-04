
public class practice
	{

		public static void main(String[] args)
			{
				
//				String[] first = new String[1];
//				first[0] = "1";
				exception1();
				exception2();
				exception3();
			}
		public static void exception1()
		{
			//StringIndexOutOfBoundsException
			String dance = "Dancing Queen";
			try
				{
					int x = 30/4*1+50+9-20;
					String newDance = dance.substring(x);
					System.out.println(newDance);
				}
			catch(StringIndexOutOfBoundsException exc)
				{
					System.out.println("Why would you do that stupid?");
				}
		}
		public static void exception2()
			{
				//NullPointerException
				String cat = null;
				try
					{
					cat = cat.replace(cat.substring(0), "cat");
						System.out.println(cat + " Zoinks");
					}
				catch(NullPointerException exc)
					{
						System.out.println("Did you really try that?");
					}
				
			}
		public static void exception3()
			{
				//NumberFormatException
				String lilly = "dog";
				try
					{
						int weird= Integer.parseInt(lilly);
						System.out.println(weird);
						
					}
				catch(NumberFormatException exc)
					{
						System.out.println("You really should not try that again.");
					}
			}

	}
