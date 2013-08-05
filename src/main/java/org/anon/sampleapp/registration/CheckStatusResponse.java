package org.anon.sampleapp.registration;

import java.io.Serializable;

public class CheckStatusResponse implements Serializable {

	private boolean status;

	public CheckStatusResponse(boolean stat) {
		status = stat;
	}

}
