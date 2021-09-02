package com.bbp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.bbp.beans.Robot;

@SpringBootApplication
public class BasicBootApplication {
	public static void main(String[] args) {
		ApplicationContext applicationContext=SpringApplication.run(BasicBootApplication.class, args);
		Robot robot=applicationContext.getBean(Robot.class);
		robot.start();
	}
}
