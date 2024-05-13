package computer.server;

public class Server {
    
    int Queue_size = 32000;
	int next_event_type;
	int num_Tasks_delayed;
	int num_events=2;
	int num_in_q;
	int server_status;
	int num_delays_required;
	double area_num_in_q;
	double area_server_status;
	double simulation_time;
	double time_last_event;
	double total_of_delays;
	double avg_interarrival;
	double avg_service;
	double avg_service1;
	double avg_service2;
	double[] time_arrival = new double[Queue_size];;
	double[] time_next_event=new double[3];
	 
	void initialize()
	{
		simulation_time = 0;
		server_status = 0;
		num_in_q = 0;
		time_last_event = 0; 
		num_Tasks_delayed = 0;
		total_of_delays = 0;
		area_num_in_q = 0;
		area_server_status = 0;
		time_next_event[1] = simulation_time + ComputerServer.expon(avg_interarrival) ;
		time_next_event[2] = 1.0e+30;
	}
	 
	public void timing()
	{
		int   i;
		double min_time_next_event = 1.0e+29;
		next_event_type = 0; 
		for (i = 1; i <= num_events; ++i)
		{
			if (time_next_event[i] < min_time_next_event)
			{
				min_time_next_event = time_next_event[i];
				next_event_type = i;
			}
		}
	 
		if (next_event_type == 0)
		{
			System.out.println("\nEvent list empty at time"+ simulation_time);
		}
		 
		simulation_time = min_time_next_event;
	}
	 
	public void arrive(double time)
	{
		double delay;
		time_next_event[1] = time;
		 
		if (server_status == 1)
		{
			num_in_q++;
			if(num_in_q > Queue_size)
			{
				System.out.println("overflow of the array time_arrival at ");
				System.out.println("time " + simulation_time);
				System.exit(0);
			}
			time_arrival[num_in_q] = simulation_time;
		}
		else
		{
			delay = 0;
			total_of_delays += delay;
			total_of_delays += delay;
			//System.out.println("total arrive departure "+total_of_delays);
			num_Tasks_delayed++;
			server_status = 1;
			time_next_event[2] = simulation_time + ComputerServer.expon(avg_service);
		}
	}
	public void depart()
	{
		int   i;
		double delay;
		 
		if (num_in_q == 0)
		{
			server_status = 0;
			time_next_event[2] = 1.0e+30;
		}
                else
		{
			num_in_q--;
			delay = simulation_time - time_arrival[1];
			total_of_delays += delay;
			//System.out.println("total delay departure "+total_of_delays);
			num_Tasks_delayed++;
			time_next_event[2] = simulation_time + ComputerServer.expon(avg_service);
			for (i = 1; i <= num_in_q; i++)
			{
				time_arrival[i] = time_arrival[i + 1];
                    }
		}
	      }
	 
	public void report()
	{
		System.out.println( "Total customer uses this server = " + num_Tasks_delayed + "\n");
		System.out.println( "Average delay in queue = " + total_of_delays / num_Tasks_delayed + "\n");
		System.out.println( "Average number in queue  = " + area_num_in_q / simulation_time + "\n");
		System.out.println( "Server utilization  = " + area_server_status / simulation_time + "\n");
	}
	 
	public void update_time_avg_stats()
	{
		double time_since_last_event;
		time_since_last_event = simulation_time - time_last_event;
		time_last_event = simulation_time;		 
		area_num_in_q += num_in_q * time_since_last_event;
		area_server_status += server_status * time_since_last_event;
}}