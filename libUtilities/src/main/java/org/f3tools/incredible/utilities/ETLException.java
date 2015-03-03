package org.f3tools.incredible.utilities;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class ETLException extends Exception 
{
	private static final long serialVersionUID = -3737213768143055730L;

	public ETLException(Throwable cause)
	{
		super(cause);
	}

	public ETLException(String message, Throwable cause)
	{
		super(message, cause);
	}

	public ETLException(String message)
	{
		super(message);
	}
	
	public String getStackTrack()
	{
		return Utl.stackTrack(this);
	}
}
