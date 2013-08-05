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
 * File:                org.anon.sampleapp.shoppingcart.ShoppingCartManager
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

package org.anon.sampleapp.shoppingcart;

import java.util.List;

public class ShoppingCartManager
{
    public ShoppingCartManager()
    {
    }

    public void addToShoppingCart(ShoppingCart cart, AddCartItem additem)
        throws Exception
    {
        CartItem item = new CartItem(cart.getCartName(), additem.getSkuID(), additem.getCost());
        cart.addItem(item);
        AddedCart added = new AddedCart(cart.getCartName(), cart.getNoItems(), cart.getTotalCost());
    }

    public void retrieveShoppingCartDetails(ShoppingCart cart, List<CartItem> items)
        throws Exception
    {
        ShoppingCartDetails dets = new ShoppingCartDetails(cart.getCartName(), cart.getTotalCost(), cart.getNoItems(), items);
    }
}

