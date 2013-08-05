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
 * File:                org.anon.sampleapp.mshop.MShopItem
 * Author:              rsankar
 * Revision:            1.0
 * Date:                17-05-2013
 *
 * ************************************************************
 * REVISIONS
 * ************************************************************
 * A cart item which is added to the shopping cart
 *
 * ************************************************************
 * */

package org.anon.sampleapp.mshop;

import java.util.UUID;

public class MShopItem implements java.io.Serializable
{
    public String cartName;
    public UUID itemID;
    public double cost;
    public Object shopItem;

    public MShopItem(String cart, double c)
    {
        cartName = cart;
        itemID = UUID.randomUUID();
        cost = cost;
    }

    public String getCartName() { return cartName; }
    public UUID getItemID() { return itemID; }
    public Object getShopItem() { return shopItem; }
    public double getCost() { return cost; }
}

