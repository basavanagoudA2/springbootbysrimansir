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
		//commited
		 SpringApplication springApplication=new SpringApplicationBuilder(BootEventListenersApplication.class).listeners(new BootStartingEventListener(),new BootEnvironmentPreparedEventListener(),new BootPreparedEventListener(),new BootStartedEventListener()).build();
		 ApplicationContext applicationContext=springApplication.run(args);
	}
}
