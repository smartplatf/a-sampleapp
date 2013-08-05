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
 * File:                org.anon.sampleapp.registration.RegistrationResponse
 * Author:              arjun
 * Revision:            1.0
 * Date:                27-06-2013
 *
 * ************************************************************
 * REVISIONS
 * ************************************************************
 * A response for registration
 *
 * ************************************************************
 * */

package org.anon.sampleapp.registration;

import java.io.Serializable;
import java.util.UUID;

public class RegistrationResponse implements Serializable {
	
	private boolean status;
	private String message;
	private UUID random;

	public RegistrationResponse() {
		// TODO Auto-generated constructor stub
	}

	public RegistrationResponse(boolean status) {
		super();
		this.status = status;
	}

	public RegistrationResponse(boolean status, UUID random) {
		super();
		this.status = status;
		this.random = random;
	}

	public RegistrationResponse(boolean status, String message, UUID random) {
		super();
		this.status = status;
		this.message = message;
		this.random = random;
	}

	public RegistrationResponse(boolean status, String message) {
		super();
		this.status = status;
		this.message = message;
	}

}
