package computer.server;
import java.io.*;
import java.util.*;

public class ComputerServer {

  public static Server Computer1;
  public static Server Computer2;
  public static Random random;
	public static void main(String[] args)throws IOException
	{
		Scanner sc = new Scanner(System.in);
		Computer1 = new Server();
		Computer2 = new Server();
		System.out.println("Enter the average of interarrival time = ");
		Computer1.avg_interarrival=sc.nextDouble();
		System.out.println("\nEnter the average service time of Computer1 = ");
		Computer1.avg_service=sc.nextDouble();
		System.out.println("\nEnter the average service time of Computer2 = ");
		Computer2.avg_service=sc.nextDouble();

		System.out.println("\nEnter Number of Tasks = ");
		int total_Tasks = sc.nextInt();

		System.out.println("Multiple-Computer Server queueing system\n");
		System.out.println("Average interarrival time = "+Computer1.avg_interarrival+" minutes\n");
		System.out.println("Average service time of Computer1 = "+Computer1.avg_service+" minutes\n");
		System.out.println("Mean service time of Computer2 = "+Computer2.avg_service+" minutes\n");
		System.out.println("Number of Tasks = "+ total_Tasks + "\n\n");

		random = new Random();

		Computer1.initialize();
		Computer2.initialize();
		System.out.println("\nEnter simulation time = ");
		double simulation_time = sc.nextDouble();
		while(Computer1.simulation_time < simulation_time)
		{
			Computer1_activity();
		}

		System.out.println("\n\nReport for Computer 1:\n--------------------\n");
		Computer1.report();
		System.out.println("\n\nReport for Computer 2:\n--------------------\n");
		Computer2.report();
		System.out.println("\n\nTime simulation ended = "+ (Computer2.simulation_time) +"\n");
	}

	private static void Computer1_activity()
	{
		Computer1.timing();

		Computer1.update_time_avg_stats();

		switch (Computer1.next_event_type)
		{
			case 1:
				Computer1.arrive(Computer1.simulation_time+expon(Computer1.avg_interarrival));
				break;
			case 2:
				Computer1.depart();
			if(random.nextDouble() <= 0.3)
			{
				Computer2_activity(Computer1.simulation_time);
			}
			break;

		}
	}

	private static void Computer2_activity(double time)
	{
		Computer2.timing();

		Computer2.update_time_avg_stats();

		switch (Computer2.next_event_type)
		{
			case 1:
				Computer2.arrive(time);
				break;
			case 2:
				Computer2.depart();
			Computer2_activity(time);
		}
	}

	public static double expon(double  mean)
	{
		return -mean * Math.log(random.nextDouble());
	}
}
