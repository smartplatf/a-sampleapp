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
 * File:                org.anon.sampleapp.mshop.MShopManager
 * Author:              rsankar
 * Revision:            1.0
 * Date:                18-05-2013
 *
 * ************************************************************
 * REVISIONS
 * ************************************************************
 * A manager to create and maintain shopping carts
 *
 * ************************************************************
 * */

package org.anon.sampleapp.mshop;

import java.util.List;

public class MShopManager
{
    public MShopManager()
    {
    }

    public void addToMShop(MShop cart, AddShopItem additem)
        throws Exception
    {
        MShopItem item = new MShopItem(cart.getCartName(), additem.getCost());
        cart.addItem(item);
        AddedShop added = new AddedShop(cart.getCartName(), cart.getNoItems(), cart.getTotalCost());
    }

    public void retrieveShoppingCartDetails(MShop cart, List<MShopItem> items)
        throws Exception
    {
        //ShoppingCartDetails dets = new ShoppingCartDetails(cart.getCartName(), cart.getTotalCost(), cart.getNoItems(), items);
    }
}

