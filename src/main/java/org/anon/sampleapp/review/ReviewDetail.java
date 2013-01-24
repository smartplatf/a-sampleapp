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
 * File:                org.anon.sampleapp.review.ReviewDetail
 * Author:              rsankar
 * Revision:            1.0
 * Date:                24-01-2013
 *
 * ************************************************************
 * REVISIONS
 * ************************************************************
 * A specific details of review for the object
 *
 * ************************************************************
 * */

package org.anon.sampleapp.review;

import java.util.UUID;

public class ReviewDetail implements java.io.Serializable
{
    private UUID _objectID;
    private UUID _detailID;
    private String _reviewText;
    private int _rating;

    public ReviewDetail(UUID obj, String review, int rate)
    {
        _objectID = obj;
        _detailID = UUID.randomUUID();
        _reviewText = review;
        _rating = rate;
    }

    public UUID detailID() { return _detailID; }
    public String reviewText() { return _reviewText; }
    public int rating() { return _rating; }
}

