package com.emc.test;

import com.emc.entities.Event;
import com.emc.entities.Organizer;

public class Test {

	public static void main(String[] args) {
		
		Organizer organizer = new Organizer();
		organizer.id = 123l;
		organizer.name = "Apple Inc.";
		
		System.out.println(organizer.name);
		
		Event event = new Event();
		event.id = 456l;
		event.name = "Iphone 15 Launch";
		event.description = "Grand Launch";
		
		System.out.println(event.name);
		System.out.println(event.description);
	}

}
