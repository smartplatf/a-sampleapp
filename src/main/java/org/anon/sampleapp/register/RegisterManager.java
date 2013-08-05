/**
 * SMART - State Machine ARchiTecture
 *
 * Copyright (C) 2012 Individual contributors as indicated by
 * the @authors tag
 *
 * This file is a part of SMART.
 *
 * SMART is a free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * SMART is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 *
 *
 * */
 
/**
 * ************************************************************
 * HEADERS
 * ************************************************************
 * File:                org.anon.sampleapp.register.RegisterManager
 * Author:              rsankar
 * Revision:            1.0
 * Date:                02-04-2013
 *
 * ************************************************************
 * REVISIONS
 * ************************************************************
 * A manager for registrations
 *
 * ************************************************************
 * */

package org.anon.sampleapp.register;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegisterManager
{
    public RegisterManager()
    {
    }

    public boolean isValidEmail(String email)
    {
    	String pattern = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}";
        Pattern p = Pattern.compile(pattern);
        Matcher match = p.matcher(email);
        if (match.matches())
        {
        	return true;
        }
        
        return false;
    }
    public void registerNew(RegisterEvent evt)
    {
    	RegistrationResponse resp = null;
        
        if(isValidEmail(evt.getEmail()))
        {
            Registration reg = new Registration(evt.getEmail());
            reg.setPhone(evt.getPhone());
	    /*reg.setAge(evt.getAge());
	    reg.setWeight(evt.getWeight());
	    reg.setPassword(evt.getPassword());
	    reg.setSalary(evt.getSalary());*/
            resp = new RegistrationResponse("Registered: " + evt.getEmail());
        }
        else
        {
            resp = new RegistrationResponse("Invalid email address. Please check. " + evt.getEmail());
        }
    }
    
    public void update(Registration reg, UpdateRegistration event)
    {
    	System.out.println("-------------UPDATING REGISTRATION------------------");
    	UpdateRegistrationResponse resp = null;
        
    	if(isValidPhone(event.getPhone()))
    	{
    		reg.setPhone(event.getPhone());
    		System.out.println("Updated Phone:"+reg+":::"+reg.getPhone());
    		resp = new UpdateRegistrationResponse("Updated Registration: " + event.getPhone());
    		
    		TrackUpdate tracker = new TrackUpdate(reg);
        }
        else
        {
            resp = new UpdateRegistrationResponse("Invalid email address. Please check. " + event.getPhone());
        }
    	System.out.println("-------------UPDATED REGISTRATION------------------");
    }

    public void trackUpdate(Registration reg, TrackUpdate event)
    {
    	System.out.println("-----------------------INTERNAL EVENT--------------------------");
    	System.out.println("------------------ PHONE:"+reg.getPhone()+":::"+event.getRegistration()+"::"+event.getEventName());
    	reg.setPhone("+918041085750");
    }
	private boolean isValidPhone(String phone) {
		if(phone != null)
			return true;
		return false;
	}
}

