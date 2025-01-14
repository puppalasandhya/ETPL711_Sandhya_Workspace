package com.evergent.corejava.exceptionhandling;
class InvalidScoreException extends RuntimeException
{
	public InvalidScoreException(String message)
	{
		super(message);
	}
}
public class UserDefinedUncheckedExceptionDemo12 {
	public static void ValidateScore(int score)
	{
		if(score<0 || score>100)
		{
			throw new InvalidScoreException("score must be between 0 ans 100");
		}
		else
		{
			System.out.println("score is valid");
		}
	}
	public static void main(String[] args) {
		try {
			UserDefinedUncheckedExceptionDemo12  e=new UserDefinedUncheckedExceptionDemo12();
			e.ValidateScore(110);//we can access without creating the object 
			//because 2 static methods in same class can be accessed without object creation
		}
		catch(InvalidScoreException e)
		{
			System.out.println("caught the exception: "+e.getMessage());
			System.out.println(e);
		}
		System.out.println("program continues after handling the exception");
	}
}
