package com.boot.evtlistenres;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationListener;

import com.boot.beans.Tank;

public class BootStartedEventListener implements ApplicationListener<ApplicationStartedEvent>{

	@Override
	public void onApplicationEvent(ApplicationStartedEvent event) {
	/**
	 * ApplicationStartedEvent published by sa after ioc container instantiated within ioc befor running commendlinerunners 
	 * */
	ApplicationContext context=event.getApplicationContext();
	Tank bean = context.getBean(Tank.class);
	System.out.println(bean);
	}

}
