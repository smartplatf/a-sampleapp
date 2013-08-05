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
 * File:                org.anon.sampleapp.shoppingcart.ShoppingCart
 * Author:              rsankar
 * Revision:            1.0
 * Date:                17-05-2013
 *
 * ************************************************************
 * REVISIONS
 * ************************************************************
 * A shopping cart representation
 *
 * ************************************************************
 * */

package org.anon.sampleapp.shoppingcart;

public class ShoppingCart implements java.io.Serializable
{
    public String cartName;
    public double totalCost;
    public int noItems;

    public ShoppingCart()
    {
    }

    public String getCartName() { return cartName; }
    public double getTotalCost() { return totalCost; }
    public int getNoItems() { return noItems; }

    public void addItem(CartItem item)
    {
        noItems++;
        totalCost += item.getCost();
    }
}

