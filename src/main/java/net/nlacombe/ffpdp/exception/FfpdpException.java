package net.nlacombe.ffpdp.exception;

public class FfpdpException extends Exception
{
	public FfpdpException()
	{
		//Do nothing
	}

	public FfpdpException(String message)
	{
		super(message);
	}

	public FfpdpException(Throwable cause)
	{
		super(cause);
	}

	public FfpdpException(String message, Throwable cause)
	{
		super(message, cause);
	}
}
