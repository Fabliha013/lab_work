package labworkkk;

public class Mainfunction {
	public static void dosomething(Vehicle...vehicles)
	{
		for(Vehicle v:vehicles)
		{
			if(v instanceof Car)
			{
				Car c=(Car) v;
				c.method1();
			}
			if(v instanceof Bus)
			{
				 Bus c=(Bus) v;
				c.method2();
			}
			if(v instanceof Ship)
			{
				Ship c=(Ship) v;
				c.method3();
			}
			if(v instanceof Boat)
			{
				Boat c=(Boat) v;
				c.method4();
			}
			if(v instanceof Aeroplane)
			{
				 Aeroplane c=( Aeroplane) v;
				c.method5();
			}
			if(v instanceof Helicopter)
			{
				Helicopter c=(Helicopter) v;
				c.method6();
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bus b=new Bus();
		Car c=new Car();
		Ship s=new Ship();
		Boat bo=new Boat();
		
		dosomething(b, c, s, bo);

	}

}
