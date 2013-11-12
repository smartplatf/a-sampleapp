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
 * File:                org.anon.sampleapp.register.Registration
 * Author:              rsankar
 * Revision:            1.0
 * Date:                02-04-2013
 *
 * ************************************************************
 * REVISIONS
 * ************************************************************
 * a register for interest
 *
 * ************************************************************
 * */

package org.anon.sampleapp.register;

import java.util.ArrayList;
import java.util.List;

public class Registration implements java.io.Serializable
{
    private String email;
    private String phone;
    private List<String> tags;
    private static final int finalInt = 100;
    /*private List<String> emptyStringList;
    private List<Integer> emptyIntList;*/
    
    //private List<Byte> password;
    
    //private Credential pwd;
    private int age;
    private double weight;
    private Long salary;
    //private UserProfile profile;
    
    public Registration(String e)
    {
        email = e;
        phone = "000";
        tags = new ArrayList<String>();
        setTags();
        /*emptyStringList = new ArrayList<String>();
        emptyIntList = new ArrayList<Integer>();*/
        
	age = 29;
	weight = 75.0;
	/*password = new ArrayList<Byte>();
	password.add(new Byte("65"));
	pwd = new Password();*/
	salary = new Long(10000);
    }
    
    public Registration(String e, String p)
    {
        email = e;
        phone = p;
        
        tags = new ArrayList<String>();
        setTags();
	age = 30;
	weight = 75.0;
    }
    
    public void setTags() {
    	
    			
    	tags.add("DummyTag");
    }

    public String getEmail() { return email; }

	public void setEmail(String newemail) {
		email = newemail;
	}
	
	public String getPhone() {
		return phone;
	}

	public void setPhone(String p) {
		this.phone = p;
	}
    public void setAge(int a)
	{
		age = a;
	}
	public void setWeight(double w)
	{
		weight = w;
	}
	/*public void setPassword(List<Byte> pwd)
	{
		password = pwd;
	}*/
	
	public void setSalary(Long sal)
	{
		salary = sal;
	}
	
	public String getTags() {
		/*StringBuffer b = new StringBuffer();
		for(String t : tags)
		{
			b.append("-");
			b.append(t);
		}
		
		return b.toString();
		*/
		return ""+tags;
	}
	/*public String toString() {
		return "Registration------->:"+email+":"+phone+":"+getTags()+": age:"+age+
				": weight: "+weight+" pwd:" + password+":: another pwd:"+pwd
					+ ": Salary:"+salary+":: emptyStrList:"+emptyStringList+":: emptyIntList:"+emptyIntList;
	}*/
	
	public String toString() {
		return "Registration------->:"+email+":"+phone+":"+getTags()+": age:"+
				": weight: "+" pwd:"
				+ ": Salary:";
				//"Profile: "+ profile;
	}
	
}

