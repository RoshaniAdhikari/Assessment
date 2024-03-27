package assignment;

import java.util.Scanner;

public class Driver {
	
		public static void main(String[] args) 
		{
			
			System.out.println("   .....**WELCOME TO DREAM VEHICLE SHOWROOM**.......");
			System.out.println("					");

			System.out.println("warmest welcome please select what vehicle you want");

			System.out.println("					");
			System.out.println("Select (1)for Two wheeler");
			System.out.println("Select (2)for Four wheeler");
			System.out.println("Select (3)for Three wheeler");
			System.out.println("Select (4)for Six wheeler");
			//vehicle o = new Twowheeler("black", 12, "Honda", "GM12", 70000);
			Scanner Sc = new Scanner(System.in);
			int a = Sc.nextInt();
			switch (a)
			{
			case 1:
				System.out.println("Thank you! for selecting Twowheeler");
				System.out.println("			");
				System.out.println("There are Two types of Twowheelers in our showroom");
				System.out.println("Select 1 for Bike");
				System.out.println("Select 2 for Cycle");

				a = Sc.nextInt();
				switch (a) 
				{
				case 1:
					System.out.println("1.Bike");
					System.out.println("which Company bike you want");
					System.out.println("		");

					System.out.println("Select 1 for Honda");
					System.out.println("Select 2 for Bajaj");
					System.out.println("Select 3 for Hero");
					System.out.println("Select 3 for RoyalEnfield");

					a = Sc.nextInt();
					switch (a) 
					{
					case 1:
						System.out.println("Company:Honda");

						System.out.println("Press 1 for Shine");
						System.out.println("Press 2 for Activa");

						System.out.println("Press 3 for Dio");

						System.out.println("Press 4 for Aviator");

						System.out.println("Press 5 for Livo");

						a = Sc.nextInt();
						switch (a) 
						{
						case 1:
							System.out.println("You selected Shine");
							System.out.println("			");
							Honda h = new Shine("white", 15, "HondaShine", "GM67", 80000);
							h.info();
							break;

						case 2:
							System.out.println("You selelcted Activa");
							System.out.println("			");
							Honda h1 = new Activa("Black", 16, "HondaActiva", "GM88", 90000);
							h1.info();
							break;

						case 3:
							System.out.println("You selelcted Dio");
							System.out.println("			");
							Honda h2 = new Dio("Black", 17, "HondaDio", "GM90", 67000);
							h2.info();
							break;

						case 4:
							System.out.println("You selelcted Aviator");
							System.out.println("			");
							Honda h3 = new Aviator("Black", 16, "HondaAviator", "GM67", 90000);
							h3.info();
							break;

						case 5:
							System.out.println("You selelcted Livo");
							System.out.println("			");
							Honda h4 = new Livo("Black", 67, "HondaActiva", "GM90", 90000);
							h4.info();
							break;

						}
						break;

					case 2:
						System.out.println("Company:Bajaj");

						System.out.println("Press 1 for Pulsor");

						System.out.println("Press 2 for Dominar");

						System.out.println("Press 3 for Platina");

						System.out.println("Press 4 for CT");

						System.out.println("Press 5 for Aventure");

						a = Sc.nextInt();
						switch (a) {
						case 1:
							System.out.println("You selected Pulsor");
							System.out.println("			");
							Bajaj b = new Pulsar("white", 4576, "BajajPulsar", "GM67", 80000);
							b.info();
							break;

						case 2:
							System.out.println("You selelcted Dominar");
							System.out.println("			");
							Bajaj b1 = new Dominar("Black", 1634, "BajajDominar", "GM88", 90000);
							b1.info();
							break;

						case 3:
							System.out.println("You selelcted Platina");
							System.out.println("			");
							Bajaj b2 = new Platina("Black", 1789, "BajajPlatilna", "GM90", 67000);
							b2.info();
							break;

						case 4:
							System.out.println("You selelcted CT");
							System.out.println("			");
							Bajaj b3 = new CT("Black", 1646, "BajajCT", "GM67", 90000);
							b3.info();
							break;

						case 5:
							System.out.println("You selelcted Aventure");
							System.out.println("			");
							Bajaj b4 = new Aventure("Black", 6745, "BajajAventure", "GM90", 90000);
							b4.info();
							break;

						}
						break;

					case 3:
						System.out.println("Company:Hero");

						System.out.println("Press 1 for Splendor");

						System.out.println("Press 2 for Passion");

						System.out.println("Press 3 for Xtreme");

						System.out.println("Press 4 for XPulse");

						System.out.println("Press 5 for HFDeluxe");

						a = Sc.nextInt();
						switch (a) {
						case 1:
							System.out.println("You selected Splendor");
							System.out.println("			");

							Hero o5 = new Splendor("white", 4570, "HeroSplendor", "GM67", 80000);
							o5.info();
							break;

						case 2:
							System.out.println("You selelcted Passion ");
							System.out.println("			");
							Hero o1 = new Passion("Black", 1665, "HeroPassion", "GM88", 90000);
							o1.info();
							break;

						case 3:
							System.out.println("You selelcted Xtreme");
							System.out.println("			");
							Hero o2 = new Xtreme("Black", 1734, "HeroXtreme", "GM90", 67000);
							o2.info();
							break;

						case 4:
							System.out.println("You selelcted XPulse");
							System.out.println("			");
							Hero o3 = new XPulse("Black", 1688, "HeroXpulse", "GM67", 90000);
							o3.info();
							break;

						case 5:
							System.out.println("You selelcted HFDeluxe");
							System.out.println("			");
							Hero o4 = new HFDeluxe("Black", 6723, "HeroHFDeluxe", "GM90", 90000);
							o4.info();
							break;

						}
						break;

					case 4:
						System.out.println("Company:RoyalEnfield");

						System.out.println("Press 1 for Himalayan");

						System.out.println("Press 2 for Interceptor");

						System.out.println("Press 3 for Classic350");

						System.out.println("Press 4 for Bullet350");

						a = Sc.nextInt();
						switch (a) 
						{
						case 1:
							System.out.println("You selected Himalayan");
							System.out.println("			");
							RoyalEnfield o1 = new Himalayan("white", 4570, "RoyalEnfield_Himalayan", "GM67", 80000);
							
							o1.info();
							break;

						case 2:
							System.out.println("You selelcted Interceptor");
							System.out.println("			");
							RoyalEnfield o2 = new Interceptor("Black", 1665, "RoyalEnfield_Interceptor", "GM88", 90000);
							o2.info();
							break;

						case 3:
							System.out.println("You selelcted Classic350 ");
							System.out.println("			");
							RoyalEnfield o3 = new Classic350("Black", 1734, "RoyalEnfield_Classic350", "GM90", 67000);
							o3.info();
							break;

						case 4:
							System.out.println("You selelcted Bullet350");
							System.out.println("			");
							RoyalEnfield o4 = new Bullet350("Black", 1688, "RoyalEnfield_Bullet350", "GM67", 90000);
							o4.info();
							break;
						}
						break;

					}
					break;

				case 2:
					System.out.println("2.Cycle");
					System.out.println("which type of Cycle you want");
					System.out.println("			");

					System.out.println("Select 1 for RoadBicycle");
					System.out.println("Select 2 for FoldingBicycle");

					a = Sc.nextInt();
					switch (a) {
					case 1:
						System.out.println(" You Selected RoadBicycle");
						System.out.println("			");

						Cycle c = new RoadBicycle("white", 15, "CycleRoadBicycle", "GM67", 80000);
						c.info();
						break;

					case 2:
						System.out.println("You selelcted FoldingBicycle");
						System.out.println("			");
						Cycle c1 = new FoldingBicycle("Black", 16, "CycleFoldingBicycle", "GM88", 90000);
						c1.info();
						break;
					}
					break;

				}
				break;

			case 2:
				System.out.println("Thank you! for selecting Fourwheeler");
				System.out.println("Which Company car you want..");
				System.out.println("			");

				System.out.println("Press 1 for Mahindra");

				System.out.println("Press 2 for Toyota ");

				System.out.println("Press 3 for MarutiSuzuki");

				System.out.println("Press 4 for Audi");

				a = Sc.nextInt();
				switch (a) {
				case 1:
					System.out.println("Company:Mahindra");

					System.out.println("Press 1 for Scorpio");

					System.out.println("Press 2 for Bolero");

					System.out.println("Press 3 for Marazzo");

					System.out.println("Press 4 for Alturas_G4");

					a = Sc.nextInt();

					switch (a)
					{

					case 1:
						System.out.println("You selected Scorpio");
						System.out.println("			");
						Mahindra m1 = new Scorpio("white", 4570, "MahindraScorpio", "GM67", 80000);
						m1.info();
						break;

					case 2:
						System.out.println("You selelcted Bolero");
						System.out.println("			");
						Mahindra m2 = new Bolero("Black", 1665, "MahindraBolero", "GM88", 90000);
						m2.info();
						break;

					case 3:
						System.out.println("You selelcted  Marazzo ");
						System.out.println("			");
						Mahindra m3 = new Marazzo("Black", 1734, "Mahindra_ Marazzo", "GM90", 67000);
						m3.info();
						break;

					case 4:
						System.out.println("You selelcted Alturas_G4");
						System.out.println("			");
						Mahindra m4 = new Alturas_G4("Black", 1688, "Mahindra_Alturas_G4", "GM67", 90000);
						m4.info();
						break;

					}
					break;

				case 2:
					System.out.println("Company:Toyota");

					System.out.println("Press 1 for Fortuner");

					System.out.println("Press 2 for Innova");

					System.out.println("Press 3 for Glanza");

					System.out.println("Press 4 for Vellfire");

					a = Sc.nextInt();
					switch (a)

					{

					case 1:
						System.out.println("You selected Fortuner");
						System.out.println("			");
						Toyota t1 = new Fortuner("white", 4570, "Toyota Fortuner", "GM67", 80000);
						t1.info();
						break;

					case 2:
						System.out.println("You selelcted Innova");
						System.out.println("			");
						Toyota t2 = new Innova("Black", 1665, "ToyotaaInnova", "GM88", 90000);
						t2.info();
						break;

					case 3:
						System.out.println("You selelcted  Glanza ");
						System.out.println("			");
						Toyota t3 = new Glanza("Black", 1734, "Toyota_ Glanza", "GM90", 67000);
						t3.info();
						break;

					case 4:
						System.out.println("You selelcted Vellfire");
						System.out.println("			");
						Toyota t4 = new Vellfire("Black", 1688, "Toyota_Vellfire", "GM67", 90000);
						t4.info();
						break;

					}
					break;

				case 3:
					System.out.println("Company:MarutiSuzuki");

					System.out.println("Press 1 for Swift");

					System.out.println("Press 2 for Alto");

					System.out.println("Press 3 for Celerio");

					System.out.println("Press 4 for Ertiga");

					a = Sc.nextInt();
					switch (a)

					{

					case 1:
						System.out.println("You selected Swift");
						System.out.println("			");
						MarutiSuzuki s1 = new Swift("white", 4570, "MarutiSuzuki Swift", "GM67", 80000);
						s1.info();
						break;

					case 2:
						System.out.println("You selelcted Alto");
						System.out.println("			");
						MarutiSuzuki s2 = new Alto("Black", 1665, "MarutiSuzukiAlto", "GM88", 90000);
						s2.info();
						break;

					case 3:
						System.out.println("You selelcted  Celerio ");
						System.out.println("			");
						MarutiSuzuki s3 = new Celerio("Black", 1734, "MarutiSuzuki_ Celerio", "GM90", 67000);
						s3.info();
						break;

					case 4:
						System.out.println("You selelcted Ertiga");
						System.out.println("			");
						MarutiSuzuki s4 = new Ertiga("Black", 1688, "MarutiSuzuki_Ertiga", "GM67", 90000);
						s4.info();
						break;

					}
					break;

				case 4:
					System.out.println("Company:Audi");

					System.out.println("Press 1 for AudiA4");

					System.out.println("Press 2 for AudiQ2");

					a = Sc.nextInt();
					switch (a)

					{

					case 1:
						System.out.println("You selected AudiA4");
						System.out.println("			");
						Audi d1 = new AudiA4("white", 4570, "Audi AudiA4", "GM67", 80000);
						d1.info();
						break;

					case 2:
						System.out.println("You selelcted AudiQ2");
						System.out.println("			");
						Audi d2 = new AudiQ2("Black", 1665, "AudiAudiQ2", "GM88", 90000);
						d2.info();
						break;
					}
					break;
				}
				break;

			case 3:
				System.out.println("Thank you! for selecting Threewheeler");
				System.out.println("Great choice...");
				System.out.println("			");
				Threewheeler w = new Auto("Black", 23, "Auto", "GM97", 100000);
				w.info();
				break;
			

			case 4:
				System.out.println("Thank you! for selecting six wheeler");
				System.out.println("			");

				System.out.println("Which Company Truck or Bus you want..");

				System.out.println("If you want Truck Press 1 for Ashok");

				System.out.println("If you want bus Press 2 for BoltBus ");

				a = Sc.nextInt();
				switch (a) 
				{

				case 1:
					System.out.println("Company:Ashok");

					System.out.println("Press 1 for Truck_Pro3015");

					System.out.println("Press 2 for Truck_1415HB");

					a = Sc.nextInt();
					switch (a)

					{

					case 1:
						System.out.println("You selected Truck_pro3015");
						System.out.println("			");
						Ashok k1 = new Truck_pro3015("white", 4570, "Ashok Truck_pro3015", "GM67", 80000);
						k1.info();
						break;

					case 2:
						System.out.println("You selelcted Truck_1415HB");
						System.out.println("			");
						Ashok k2 = new Truck_1415HB("Black", 1665, "Ashok Truck_1415HB", "GM88", 90000);
						k2.info();
						break;
					}
					break;

				case 2:
					System.out.println("Company:BoltBus");

					System.out.println("Press 1 for LuxuryBus");

					System.out.println("Press 2 for RedBus");

					a = Sc.nextInt();
					switch (a) {

					case 1:
						System.out.println("You selected  LuxaryBus");
						System.out.println("			");
						BoltBus k1 = new LuxaryBus("white", 4570, "BoltBus  LuxaryBus", "GM67", 80000);
						k1.info();
						break;

					case 2:
						System.out.println("You selelcted RedBus");
						System.out.println("			");
						BoltBus k2 = new RedBus("Black", 1665, "BoltBus RedBus", "GM88", 90000);
						k2.info();
						break;
					}
					break;
				}
				break;

			default:
				System.out.println("Please Enter valid input");
				a = Sc.nextInt();
				break;

			}

			System.out.println("             ");

			System.out.println("Thank you for using our service!!!");

			System.out.println("              ");

			Service T = new Service();

			System.out.println("Your register name is:" + T.name);
			System.out.println("Your register MobNo:" + T.getMobNo());
			System.out.println("Your register EmailId is:" + T.EmailId);

			System.out.println("							");
			System.out.println("  *We also provide Vehicle Services like: * ");
			System.out.println("					");
			System.out.println(" #Change the Engine Oil");
			System.out.println(" #Replace the Oil Filter");
			System.out.println(" #Replace the Fuel filter");
			System.out.println(" #Replace ther spark plugs");
			System.out.println(" #Electrical component eg.Battery,alnernator,starter motor tested");
			System.out.println(" #Check condition of tyres");
			System.out.println(" #Check for any error codes in ECU and take corrective actions");

			System.out.println("		");

			System.out.println("We provided one Offer for our Special Customer");

			System.out.println("		");
			System.out.println(
					"    Customer who buy any vehicle from our Showroom they will get free Vehicle Service for 1 year....! ");
			System.out.println("				");
			System.out.println("	---------This offer valid only for 1 month------------");
			System.out.println("								");
			System.out.println("						!.....HURRRY UP....!						");

			System.out.println();

			System.out.println("If you want to go back in main page then click on button");

			Button b = new Button1();// upcasting
			b.click();// method overrriding

			System.out.println("							");

			System.out.println("Please give your Valuable feedback ");
			System.out.println("           ");
			System.out.println("             **CUSTOMER SERVICE FEEDBACK FORM**         ");
			System.out.println("             ");
			System.out.println(
					"Thank you for using our vehicle service...! we value all of our customers and strive to meet everyones need");
			System.out.println("         ");
			Scanner Sc1 = new Scanner(System.in);
			System.out.println("Please tell us the date you used our service");
			String z = Sc1.nextLine();
			System.out.println("         ");

			System.out.print("Enter your name:  ");
			String l = Sc1.nextLine();
			try
			{
			System.out.print("Enter your Mobile no:  ");
			long g = Sc1.nextLong();
			}
			catch(Exception e)
			{
				System.out.println("Exception handle successfully");
				System.out.println("Enter valid input");
			}
			System.out.println("  	  ");

			String j = Sc1.nextLine();

			System.out.print("1.Was Our customer service provided to you in an Accessible Manner?");

			System.out.println("    ");
			String n = Sc1.nextLine();

			System.out.print("2.Any queries regarding to our Service?");
			System.out.println("    ");
			String x = Sc1.nextLine();

			System.out.println("3.Were you satisfied customer service we provided you?");
			String c1 = Sc1.nextLine();
			System.out.println("    ");

			System.out.println("Click On Submit");
			System.out.println("		");

			p2 Q = new p2(); // interface
			Q.Submit();// method overrding ....polymorphism
			System.out.println("                 ");

			System.out.println("        	 # THANK YOU FOR YOUR VALUABLE RESPONSE #      ");

			System.out.println("         ");

		}

	}

	abstract class Button // abstraction
	{
		abstract public void click();

	}

	class Button1 extends Button 
	{
		public void click() 
		{
			System.out.println("      ");
			System.out.println("                  CLICK               ");
		}
	}

	interface p1 // interface
	{
		abstract public void Submit();
	}

	class p2 implements p1 {
		public void Submit() {
			System.out.println("      ");
			System.out.println("                  SUBMIT               ");
		}
	}

	class Service 
	{

		String name = vehicle.s;
		private long MobNo = vehicle.l;
		String EmailId = vehicle.p;

		public Service() {
			// TODO Auto-generated constructor stub
		}

		public long getMobNo() // getter method
		{
			return MobNo;

		}

		public void setMobNo(long MobNo) // setter method
		{
			this.MobNo = MobNo;
		}

	}

	class vehicle 
	{
		String colour; // encapsulation
		int v_no;
		String name;
		String model;
		double cost;

		public vehicle(String colour, int v_no, String name, String model, double cost)// Parameterized con
		{
			this.colour = colour;
			this.v_no = v_no;
			this.name = name;
			this.model = model;
			this.cost = cost;
		}

		public vehicle()
		{
			// TODO Auto-generated constructor stub
		}

		public void info() // method overriding
		{
			System.out.println("colour:" + colour);
			System.out.println("v_no:" + v_no);
			System.out.println("name:" + name);
			System.out.println("model:" + model);
			System.out.println("cost: " + cost);

		}
		static String s;
		static long l;
		
		static 
		{
			System.out.println("            		---VEHICLE INFORMATION SYSTEM---         ");
			System.out.println("									");
			System.out.println("Please First Complete Your Registration");
			System.out.println("		");
			Scanner Sc = new Scanner(System.in);
			System.out.print("Enter name: ");
			 s = Sc.nextLine();
try
{
			System.out.print("Enter mobno: ");
			 l = Sc.nextLong();
}
catch(Exception e )
{
	System.out.println("Exception handled sucessfully");
}

		}
		static String p;
		static 
		{
	        
			Scanner Sc1 = new Scanner(System.in);
			System.out.print("Enter email: ");
			p = Sc1.nextLine();

			Scanner Sc2 = new Scanner(System.in);
			System.out.print("Enter city: ");
			String s2 = Sc2.nextLine();

			System.out.print("Create password:  ");
			String s3 = Sc2.nextLine();

			System.out.println("			");

		}

		static {
			System.out.println("REGISTRATION COMPLETE SUCCESSFULLY!!!!!");
		}
		static {
			System.out.println("=========================================================================== ");

			System.out.println("Enter login detail");
			System.out.println("  ");

			Scanner Sc3 = new Scanner(System.in);
			System.out.print("Enter Username:  ");
			String s3 = Sc3.nextLine();

			System.out.println("		");
			Scanner Sc4 = new Scanner(System.in);
			System.out.print("Enter password:  ");
			String s4 = Sc4.nextLine();
			System.out.println(" ");

		}
		static {
			System.out.println("YOU GOT LOGGEDIN SUCCEFULLY!!!!!");
			System.out.println("========================================================================  ");

		}
	}

	class Twowheeler extends vehicle 
	{
		public Twowheeler(String colour, int v_no, String name, String model, double cost) 
		{
			super(colour, v_no, name, model, cost);

		}

		public Twowheeler(String string, int i, String string2) 
		{
			// TODO Auto-generated constructor stub
		}

		public Twowheeler()
		{
			// TODO Auto-generated constructor stub
		}

		public void info() 
		{
			super.info();
		}

	}

	class Fourwheeler extends vehicle 
	{

		public Fourwheeler(String colour, int v_no, String name, String model, double cost) 
		{
			super(colour, v_no, name, model, cost);

		}

		public void info() 
		{
			super.info();
		}

	}

	class Mahindra extends Fourwheeler
	{
		public Mahindra(String colour, int v_no, String name, String model, double cost) 
		{
			super(colour, v_no, name, model, cost);

		}

		public void info() 
		{
			super.info();
		}

	}

	class Scorpio extends Mahindra 
	{
		public Scorpio(String colour, int v_no, String name, String model, double cost)
		{
			super(colour, v_no, name, model, cost);

		}

		public void info() 
		{
			super.info();
		}
	}

	class Bolero extends Mahindra 
	{
		public Bolero(String colour, int v_no, String name, String model, double cost) 
		{
			super(colour, v_no, name, model, cost);

		}

		public void info() 
		{
			super.info();
		}
	}

	class Marazzo extends Mahindra 
	{
		public Marazzo(String colour, int v_no, String name, String model, double cost)
		{
			super(colour, v_no, name, model, cost);

		}

		public void info() 
		{
			super.info();
		}
	}

	class Alturas_G4 extends Mahindra 
	{
		public Alturas_G4(String colour, int v_no, String name, String model, double cost) 
		{
			super(colour, v_no, name, model, cost);

		}

		public void info() 
		{
			super.info();
		}
	}

	class Toyota extends Fourwheeler 
	{
		public Toyota(String colour, int v_no, String name, String model, double cost)
		{
			super(colour, v_no, name, model, cost);

		}

		public void info() 
		{
			super.info();
		}

	}

	class Fortuner extends Toyota 
	{
		public Fortuner(String colour, int v_no, String name, String model, double cost)
		{
			super(colour, v_no, name, model, cost);

		}

		public void info() 
		{
			super.info();
		}

	}

	class Innova extends Toyota 
	{
		public Innova(String colour, int v_no, String name, String model, double cost) 
		{
			super(colour, v_no, name, model, cost);

		}

		public void info() 
		{
			super.info();
		}

	}

	class Glanza extends Toyota 
	{
		public Glanza(String colour, int v_no, String name, String model, double cost) 
		{
			super(colour, v_no, name, model, cost);

		}

		public void info() 
		{
			super.info();
		}

	}

	class Vellfire extends Toyota 
	{
		public Vellfire(String colour, int v_no, String name, String model, double cost) 
		{
			super(colour, v_no, name, model, cost);

		}

		public void info() {
			super.info();
		}

	}

	class MarutiSuzuki extends Fourwheeler 
	{
		public MarutiSuzuki(String colour, int v_no, String name, String model, double cost) 
		{
			super(colour, v_no, name, model, cost);

		}

		public void info() 
		{
			super.info();
		}

	}

	class Swift extends MarutiSuzuki 
	{
		public Swift(String colour, int v_no, String name, String model, double cost) 
		{
			super(colour, v_no, name, model, cost);

		}

		public void info() 
		{
			super.info();
		}

	}

	class Alto extends MarutiSuzuki 
	{
		public Alto(String colour, int v_no, String name, String model, double cost)
		{
			super(colour, v_no, name, model, cost);

		}

		public void info() 
		{
			super.info();
		}

	}

	class Celerio extends MarutiSuzuki
	{
		public Celerio(String colour, int v_no, String name, String model, double cost) 
		{
			super(colour, v_no, name, model, cost);

		}

		public void info() 
		{
			super.info();
		}

	}

	class Ertiga extends MarutiSuzuki
	{
		public Ertiga(String colour, int v_no, String name, String model, double cost) 
		{
			super(colour, v_no, name, model, cost);

		}

		public void info() 
		{
			super.info();
		}

	}

	class Audi extends Fourwheeler 
	{
		public Audi(String colour, int v_no, String name, String model, double cost) 
		{
			super(colour, v_no, name, model, cost);

		}

		public void info()
		{
			super.info();
		}

	}

	class AudiA4 extends Audi 
	{
		public AudiA4(String colour, int v_no, String name, String model, double cost) 
		{
			super(colour, v_no, name, model, cost);

		}

		public void info() 
		{
			super.info();
		}
	}

	class AudiQ2 extends Audi 
	{
		public AudiQ2(String colour, int v_no, String name, String model, double cost) 
		{
			super(colour, v_no, name, model, cost);

		}

		public void info() 
		{
			super.info();
		}
	}

	class Threewheeler extends vehicle 
	{

		public Threewheeler(String colour, int v_no, String name, String model, double cost)
		{
			super(colour, v_no, name, model, cost);
		}

		public void info()
		{
			super.info();
		}

	}

	class Auto extends Threewheeler
	{

		public Auto(String colour, int v_no, String name, String model, double cost) 
		{
			super(colour, v_no, name, model, cost);
		}

		public void info() 
		{
			super.info();
		}

	}

	class Sixwheeler extends vehicle 
	{
		public Sixwheeler(String colour, int v_no, String name, String model, double cost)
		{
			super(colour, v_no, name, model, cost);
		}

		public void info() 
		{
			super.info();
		}
	}

	class Ashok extends Sixwheeler
	{

		public Ashok(String colour, int v_no, String name, String model, double cost)
		{
			super(colour, v_no, name, model, cost);
		}

		public void info()
		{
			super.info();
		}

	}

	class Truck_pro3015 extends Ashok 
	{

		public Truck_pro3015(String colour, int v_no, String name, String model, double cost) 
		{
			super(colour, v_no, name, model, cost);
		}

		public void info() 
		{
			super.info();
		}

	}

	class Truck_1415HB extends Ashok
	{

		public Truck_1415HB(String colour, int v_no, String name, String model, double cost) 
		{
			super(colour, v_no, name, model, cost);
		}

		public void info() 
		{
			super.info();
		}

	}

	class BoltBus extends Sixwheeler 
	{

		public BoltBus(String colour, int v_no, String name, String model, double cost)
		{
			super(colour, v_no, name, model, cost);
		}

		public void info() 
		{
			super.info();
		}

	}

	class LuxaryBus extends BoltBus 
	{

		public LuxaryBus(String colour, int v_no, String name, String model, double cost) 
		{
			super(colour, v_no, name, model, cost);
		}

		public void info() 
		{
			super.info();
		}

	}

	class RedBus extends BoltBus
	{

		public RedBus(String colour, int v_no, String name, String model, double cost) 
		{
			super(colour, v_no, name, model, cost);
		}

		public void info() 
		{
			super.info();
		}

	}

	class Bike extends Twowheeler 
	{
		public Bike(String colour, int v_no, String name, String model, double cost) 
		{

			super(colour, v_no, name, model, cost);
		}

		public void info()
		{
			super.info();
		}
	}

	class Honda extends Bike 
	{
		public Honda(String colour, int v_no, String name, String model, double cost) 
		{

			super(colour, v_no, name, model, cost);
		}

		public void info() 
		{
			super.info();
		}
	}

	class Shine extends Honda
	{
		public Shine(String colour, int v_no, String name, String model, double cost)
		{
			super(colour, v_no, name, model, cost);
		}

		public void info() 
		{
			super.info();
		}
	}

	class Activa extends Honda 
	{
		public Activa(String colour, int v_no, String name, String model, double cost) 
		{
			super(colour, v_no, name, model, cost);
		}

		public void info() 
		{
			super.info();
		}
	}

	class Dio extends Honda
	{
		public Dio(String colour, int v_no, String name, String model, double cost) 
		{
			super(colour, v_no, name, model, cost);
		}

		public void info() 
		{
			super.info();
		}
	}

	class Navi extends Honda 
	{
		public Navi(String colour, int v_no, String name, String model, double cost) 
		{
			super(colour, v_no, name, model, cost);
		}

		public void info()
		{
			super.info();
		}
	}

	class Aviator extends Honda 
	{
		public Aviator(String colour, int v_no, String name, String model, double cost) 
		{
			super(colour, v_no, name, model, cost);
		}

		public void info() 
		{
			super.info();
		}
	}

	class Livo extends Honda 
	{
		public Livo(String colour, int v_no, String name, String model, double cost) 
		{
			super(colour, v_no, name, model, cost);
		}

		public void info()
		{
			super.info();
		}
	}

	class Bajaj extends Bike 
	{
		public Bajaj(String colour, int v_no, String name, String model, double cost) 
		{
			super(colour, v_no, name, model, cost);
		}

		public void info()
		{
			super.info();
		}
	}

	class Pulsar extends Bajaj 
	{
		public Pulsar(String colour, int v_no, String name, String model, double cost)
		{
			super(colour, v_no, name, model, cost);
		}

		public void info() 
		{
			super.info();
		}
	}

	class Dominar extends Bajaj 
	{
		public Dominar(String colour, int v_no, String name, String model, double cost)
		{
			super(colour, v_no, name, model, cost);
		}

		public void info() 
		{
			super.info();
		}
	}

	class Platina extends Bajaj 
	{
		public Platina(String colour, int v_no, String name, String model, double cost) {
			super(colour, v_no, name, model, cost);
		}

		public void info() 
		{
			super.info();
		}
	}

	class CT extends Bajaj 
	{
		public CT(String colour, int v_no, String name, String model, double cost) {
			super(colour, v_no, name, model, cost);
		}

		public void info() 
		{
			super.info();
		}
	}

	class Aventure extends Bajaj 
	{
		public Aventure(String colour, int v_no, String name, String model, double cost) 
		{
			super(colour, v_no, name, model, cost);
		}

		public void info() {
			super.info();
		}
	}

	class Hero extends Bike 
	{
		public Hero(String colour, int v_no, String name, String model, double cost)
		{
			super(colour, v_no, name, model, cost);
		}

		public void info() 
		{
			super.info();
		}

	}

	class Splendor extends Hero 
	{
		public Splendor(String colour, int v_no, String name, String model, double cost) 
		{
			super(colour, v_no, name, model, cost);
		}

		public void info() 
		{
			super.info();
		}

	}

	class Passion extends Hero 
	{
		public Passion(String colour, int v_no, String name, String model, double cost) 
		{
			super(colour, v_no, name, model, cost);
		}

		public void info()
		{
			super.info();
		}

	}

	class Xtreme extends Hero 
	{
		public Xtreme(String colour, int v_no, String name, String model, double cost)
		{
			super(colour, v_no, name, model, cost);
		}

		public void info() 
		{
			super.info();
		}

	}

	class XPulse extends Hero 
	{
		public XPulse(String colour, int v_no, String name, String model, double cost) 
		{
			super(colour, v_no, name, model, cost);
		}

		public void info() {
			super.info();
		}

	}

	class HFDeluxe extends Hero
	{
		public HFDeluxe(String colour, int v_no, String name, String model, double cost) 
		{
			super(colour, v_no, name, model, cost);
		}

		public void info()
		{
			super.info();
		}

	}

	class RoyalEnfield extends Bike {

		public RoyalEnfield(String colour, int v_no, String name, String model, double cost) {
			super(colour, v_no, name, model, cost);
		}

		public void info() {
			super.info();
		}
	}

	class Himalayan extends RoyalEnfield {

		public Himalayan(String colour, int v_no, String name, String model, double cost) {
			super(colour, v_no, name, model, cost);
		}

		public void info() {
			super.info();
		}
	}

	class Interceptor extends RoyalEnfield {

		public Interceptor(String colour, int v_no, String name, String model, double cost) {
			super(colour, v_no, name, model, cost);
		}

		public void info() {
			super.info();
		}
	}

	class Classic350 extends RoyalEnfield {

		public Classic350(String colour, int v_no, String name, String model, double cost) {
			super(colour, v_no, name, model, cost);
		}

		public void info() {
			super.info();
		}
	}

	class Bullet350 extends RoyalEnfield 
	  {

		public Bullet350(String colour, int v_no, String name, String model, double cost) 
		{
			super(colour, v_no, name, model, cost);
		}

		public void info() 
		{
			super.info();
		}
	}

	class Cycle extends Twowheeler
	{

		public Cycle(String colour, int v_no, String name, String model, double cost)
		{
			super(colour, v_no, name, model, cost);
	}

		public void info() 
		{
			super.info();
		}
	}

	class FoldingBicycle extends Cycle 
	{
		public FoldingBicycle(String colour, int v_no, String name, String model, double cost) 
		{
			super(colour, v_no, name, model, cost);
		}

		public void info() 
		{
			super.info();
		}
	}

	class RoadBicycle extends Cycle 
	{
		public RoadBicycle(String colour, int v_no, String name, String model, double cost) {
			super(colour, v_no, name, model, cost);
		}

		public void info() 
		{
			super.info();
		}
	}
