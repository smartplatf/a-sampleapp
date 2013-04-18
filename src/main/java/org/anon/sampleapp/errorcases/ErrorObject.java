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
 * File:                org.anon.sampleapp.errorcases.ErrorObject
 * Author:              rsankar
 * Revision:            1.0
 * Date:                03-04-2013
 *
 * ************************************************************
 * REVISIONS
 * ************************************************************
 * An object on which error conditions are tested
 *
 * ************************************************************
 * */

package org.anon.sampleapp.errorcases;

public class ErrorObject implements java.io.Serializable
{
    private String name;
    private EmbedError embed;

    public ErrorObject(String nm)
    {
        name = nm;
        embed = new EmbedError();
    }

    public String getName() { return name; }

    public String toString() { return name + ":" + embed; }
}

