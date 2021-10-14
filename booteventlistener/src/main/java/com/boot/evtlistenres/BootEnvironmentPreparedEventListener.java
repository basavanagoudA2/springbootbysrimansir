package com.boot.evtlistenres;

import org.springframework.boot.context.event.ApplicationEnvironmentPreparedEvent;
import org.springframework.context.ApplicationListener;

public class BootEnvironmentPreparedEventListener implements ApplicationListener<ApplicationEnvironmentPreparedEvent> {

	@Override
	public void onApplicationEvent(ApplicationEnvironmentPreparedEvent event) {
	/**
	 * ApplicationEnvironmentPreparedEvent: after create the env object and identifying the external configuration and load into env object 
	 * before identify the type of ioc and instantiate the ioc it publish this event(ApplicationEnvironmentPreparedEvent).
	 * 
	 * */
		System.out.println("env object loaded configuration file:\t"+event.getEnvironment().getProperty("myname"));
		
	}

}
