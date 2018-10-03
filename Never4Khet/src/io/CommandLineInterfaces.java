package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommandLineInterfaces {

	public static void startProcess(String process)
	{
        Process startProcessCommand;
        try {
        	startProcessCommand = Runtime.getRuntime().exec("java -jar "+process+".jar");
        	
            if(process.equals("AI")) {
            	setCPUAffinity(process, 3);
            }
        	
        	startProcessCommand.waitFor();
            startProcessCommand.destroy();
        } catch (Exception e) {
        	System.out.println(e.getMessage());
        }

	}
	
	public static String getPID(String process) throws Exception 
	{
		String PID;
		Process getPIDCommand;
		getPIDCommand = Runtime.getRuntime().exec("pgrep -f "+process);
        
		//Getting the PID from pgrep.
		BufferedReader br = new BufferedReader(
            new InputStreamReader(getPIDCommand.getInputStream()));
        
		while ((PID = br.readLine()) != null) {}
        
		getPIDCommand.waitFor();
		getPIDCommand.destroy();
		
        return PID;
	}
	
	public static void setCPUAffinity(String process, int core) throws Exception 
	{
		
		Process taskSetCommand, niceCommand;
		taskSetCommand = Runtime.getRuntime().exec("taskset -c "+core+" -p "+getPID(process));
		niceCommand = Runtime.getRuntime().exec("nice -n -20 "+process);
        
		taskSetCommand.waitFor();
		taskSetCommand.destroy();
		
		niceCommand.waitFor();
		niceCommand.destroy();
		
	}
	
	public static void killProcess(String process)
	{
		Process killCommand;
		try {
			killCommand = Runtime.getRuntime().exec("kill -9"+getPID(process));
		         
			killCommand.waitFor();
			killCommand.destroy();
			
		}catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
