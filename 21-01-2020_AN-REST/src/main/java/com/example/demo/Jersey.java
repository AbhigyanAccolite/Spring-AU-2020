package com.example.demo;

import org.glassfish.jersey.server.ResourceConfig;
//import org.glassfish.jersey.media.multipart.FormDataParam;
import org.springframework.stereotype.Component;

@Component
public class Jersey extends ResourceConfig {
	public Jersey() {		
//		register(MultiPartFeature.class);
		register(Employee.class);
	}
}