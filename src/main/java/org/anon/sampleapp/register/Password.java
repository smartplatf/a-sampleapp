
package org.anon.sampleapp.register;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
public class Password implements Credential, Serializable
{
	private List<Byte> bytes;

	public Password()
	{
		bytes = new ArrayList<Byte>();
		bytes.add(new Byte("95"));
	}
	
	public String toString() { return ""+bytes;}
}
