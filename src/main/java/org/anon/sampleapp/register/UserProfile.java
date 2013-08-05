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
 * File:                org.anon.userprofile.UserProfile
 * Author:              vjaasti
 * Revision:            1.0
 * Date:                Jul 1, 2013
 *
 * ************************************************************
 * REVISIONS
 * ************************************************************
 * <Purpose>
 *
 * ************************************************************
 * */

package org.anon.sampleapp.register;

import java.io.Serializable;

public class UserProfile implements Serializable
{
    /*private String mobileNumber;*/
    
    private String name;
    /*private String currentAddress;
    private String permAddress;
    private String email;
    */
    //private UserWorkRecord workRecord;
    private String workRecord;
    /*private String language;
    private String idType;
    private String idNumber;*/
    
    
    public String getMobileNumber()
    {
        return null;
    }
    public void setMobileNumber(String mobileNumber)
    {
        //this.mobileNumber = mobileNumber;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name = name;
    }
    public String getCurrentAddress()
    {
        return null;//currentAddress;
    }
    public void setCurrentAddress(String currentAddress)
    {
        //this.currentAddress = currentAddress;
    }
    public String getPermAddress()
    {
        return null;//permAddress;
    }
    public void setPermAddress(String permAddress)
    {
        //this.permAddress = permAddress;
    }
    /*public String getEmail()
    {
        return email;
    }
    public void setEmail(String email)
    {
        this.email = email;
    }*/
    public String getWorkRecord()
    {
        return workRecord;
    }
    public void setWorkRecord(String workRecord)
    {
        this.workRecord = workRecord;
    }
   /* public String getLanguage()
    {
        return language;
    }
    public void setLanguage(String language)
    {
        this.language = language;
    }
    public String getIdType()
    {
        return idType;
    }
    public void setIdType(String idType)
    {
        this.idType = idType;
    }
    public String getIdNumber()
    {
        return idNumber;
    }
    public void setIdNumber(String idNumber)
    {
        this.idNumber = idNumber;
    }
    */
    public String toString()
    {
        return "User:"+getMobileNumber() +
                "Name:"+getName() + 
                "Address:"+getCurrentAddress()+
               /* "email:"+getEmail()+
                "language:"+getLanguage()+
                "IDType:"+getIdType()+
                "IDNumber:"+getIdNumber()+*/
                "Work:"+getWorkRecord();
    }
    
}
