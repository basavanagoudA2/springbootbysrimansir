package com.boot.evtlistenres;

import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationListener;

public class BootPreparedEventListener implements ApplicationListener<ApplicationPreparedEvent> {

	@Override
	public void onApplicationEvent(ApplicationPreparedEvent event) {
		/**
		 * ApplicationPreparedEvent: SpringAppplication publish this event after identify the ioc conatiner and after instantiate the ioc container by loading all bean definitions before starting bean instantiate 
		 * it publish ApplicationPreparedEvent 
		 * 
		 * */
		
		System.out.println("bean counts"+event.getApplicationContext().getBeanDefinitionCount());
		System.out.println();
	}

}
