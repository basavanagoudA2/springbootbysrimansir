package com.boot.beans;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Tank {
	public Tank() {
		System.out.println("Tank()");
	}
  @Value("${capacity}")
  private int capacity;

@Override
public String toString() {
	return "Tank [capacity=" + capacity + "]";
}
  
}
