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
 * File:                org.anon.sampleapp.catalogue.CatalogueItem
 * Author:              rsankar
 * Revision:            1.0
 * Date:                28-05-2013
 *
 * ************************************************************
 * REVISIONS
 * ************************************************************
 * An item in the catalogue
 *
 * ************************************************************
 * */

package org.anon.sampleapp.catalogue;

public class CatalogueItem implements java.io.Serializable
{
    private String skuID;
    private String itemName;
    private String itemDescription;
    private float itemCost;
    private int itemQuantity;

    public CatalogueItem()
    {
    }

    public String getSkuID() { return skuID; }
    public String getItemName() { return itemName; }
    public String getItemDescription() { return itemDescription; }
    public float getItemCost() { return itemCost; }
    public int getItemQuantity() { return itemQuantity; }
}

