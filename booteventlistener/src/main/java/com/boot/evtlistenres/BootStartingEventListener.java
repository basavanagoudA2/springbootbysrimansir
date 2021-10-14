package com.boot.evtlistenres;

import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;
/**
 * our own listener for ApplicationStartingEvent and register with SpringApplication
 * */
public class BootStartingEventListener implements ApplicationListener<ApplicationStartingEvent>{

	@Override
	public void onApplicationEvent(ApplicationStartingEvent event) {
		/**
		 * ApplicationStartingEvent: This event published by SpringApplicaion before starting any of starting activity
		 * */
		 System.out.println(event.getTimestamp());
	}

}
