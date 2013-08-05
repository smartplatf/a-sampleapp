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
 * File:                org.anon.sampleapp.configcases.ConfigObject
 * Author:              rsankar
 * Revision:            1.0
 * Date:                06-05-2013
 *
 * ************************************************************
 * REVISIONS
 * ************************************************************
 * A configuration object to be created
 *
 * ************************************************************
 * */

package org.anon.sampleapp.configcases;

public final class ConfigObject implements java.io.Serializable
{
    private final int oneConfig;
    private final int twoConfig;
    private final String oneString;

    public ConfigObject()
    {
        oneConfig = 0;
        twoConfig = 1;
        oneString = "oneString";
    }

    public int getOneConfig() { return oneConfig; }
    public int getTwoConfig() { return twoConfig; }
    public String getOneString() { return oneString; }
}

