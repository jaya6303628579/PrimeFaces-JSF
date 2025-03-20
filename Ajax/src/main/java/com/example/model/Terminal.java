package com.example.model;

import java.util.Date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean(name="t")
@ViewScoped
public class Terminal {

	public String handleCommand(String command, String[] params) {
		
		if(command.equalsIgnoreCase("JAYA")) {
			
			if(params.length>0) {
				return params[0].toUpperCase()+" is a programming Language";
			}

			else {
				return "Please the enter proper command";
			}
		}
		
		else if(command.equals("date")) {
			return new Date().toString();
		}
		
		else {
			return command +" not found";
		}

	}
}
