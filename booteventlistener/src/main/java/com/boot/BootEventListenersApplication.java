package com.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;

import com.boot.evtlistenres.BootEnvironmentPreparedEventListener;
import com.boot.evtlistenres.BootPreparedEventListener;
import com.boot.evtlistenres.BootStartedEventListener;
import com.boot.evtlistenres.BootStartingEventListener;

@SpringBootApplication
public class BootEventListenersApplication {
	 public static void main(String[] args) {
<<<<<<< HEAD
	
=======
		
>>>>>>> 656c9b2a27be46530df401b71a19407621fb9b8d
		 SpringApplication springApplication=new SpringApplicationBuilder(BootEventListenersApplication.class).listeners(new BootStartingEventListener(),new BootEnvironmentPreparedEventListener(),new BootPreparedEventListener(),new BootStartedEventListener()).build();
		 ApplicationContext applicationContext=springApplication.run(args);
	}
}
