package com.assignment.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.assignment.model.Point;

@Service
public class PointService {
	
	@Autowired
    private Environment environment;
	
    public Point getPoint() {
    	return new Point(Integer.parseInt(environment.getProperty("x")),Integer.parseInt(environment.getProperty("y")));
    }

}
