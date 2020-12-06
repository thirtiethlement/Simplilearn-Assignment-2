package validator;

import java.util.Scanner;

public class Validator 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		boolean validFlag = true;
		boolean whitelistFlag = false;
		
		System.out.println("Enter your email address.");
		String checkString = sc.nextLine();
		
		if (checkString.matches("^([a-zA-Z0-9!#$%&'*+\\-/=?^_`{|}~]{1}[a-zA-Z0-9!#$%&'*+\\-/=?^_`{|}~\\.]{0,63}|\"[a-zA-Z0-9!#$%&'*+\\-/=?^_`{|}~\\.\\s\\t]\"{1,64})@((?!.{255,}|\\-.*|.*\\-$)(([a-zA-Z0-9\\-]){1,63}){1}(\\.[a-zA-Z0-9\\-]{1,63})*)$"))
		{
			for (String n : args)
			{
				if (n.equals(checkString))
				{
					whitelistFlag = true;
					break;
				}
			}
		}
		else
		{
			validFlag = false;
		}
		
		if (whitelistFlag)
		{
			System.out.println("This address is valid and was found on the whitelist.");
		}
		else if (!validFlag)
		{
			System.out.println("That input is not a legal email address.");
		}
		else
		{
			System.out.println("That's a valid address, but it was not found on the whitelist.");
		}
		sc.close();
	}
}
