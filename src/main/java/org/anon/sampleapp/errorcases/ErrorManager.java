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
 * File:                org.anon.sampleapp.errorcases.ErrorManager
 * Author:              rsankar
 * Revision:            1.0
 * Date:                03-04-2013
 *
 * ************************************************************
 * REVISIONS
 * ************************************************************
 * A set of error cases tests
 *
 * ************************************************************
 * */

package org.anon.sampleapp.errorcases;

public class ErrorManager
{
    public ErrorManager()
    {
    }

    public void throwexception(ErrorObject obj, ExceptionEvent evt)
        throws Exception
    {
        System.out.println(">>>>>>>>>>>>>>>Invoked throwexception");
        if (obj.getName().equals("throwexception"))
            throw new Exception("Is this exception visible outside as an error");

        ErrorObject obj1 = new ErrorObject(evt.testString());
        new ExceptResponse("Created Response: " + evt.testString());
    }

    public void successWithoutThrow(ErrorObject obj, ExceptionEvent evt)
        throws Exception
    {
        System.out.println(">>>>>>>>>>>>>>>Invoked successWithoutThrow");
        ErrorObject obj1 = new ErrorObject(evt.testString() + "Insuccess");
        new ExceptResponse("Created second Response: " + evt.testString());
    }

    public void addToAdditional(AdditionalError obj)
        throws Exception
    {
        System.out.println("Calling additional with: " + obj);
        if (obj != null)
        {
            System.out.println("Invoked additional.");
            obj.setupAdditional(obj.getName() + ":Appended to this.");
            new ExceptResponse("Appended val.");
        }
    }
}

