import java.util.Scanner;

public class Driver 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		RubiksCube cube = new RubiksCube();
		String command;
		System.out.print("This is a Rubik's Cube simulation! You start with a solved cube:" + "\n" + cube.print() + ".\n" + "You can perform the following commands: R (Right), L (left), U (Up), D (Down), F (Front), B (Back), S (Reset), X (Exit)" + "\n" + "All rotations are 90 degrees clockwise. Have fun!" + "\n");
		outerloop:
		while(scan.hasNext())
		{
			command = scan.nextLine();
			for(char token: command.toCharArray())
			{
				if(token == 'S')
				{
					cube.toSolved();
				}
				else if(token == 'R')
				{
					cube.performRight();
				}
				else if(token == 'L')
				{
					cube.performLeft();
				}
				else if(token == 'U')
				{
					cube.performUp();
				}
				else if(token == 'B')
				{
					cube.performBack();
				}
				else if(token == 'F')
				{
					cube.performFront();
				}
				else if(token == 'D')
				{
					cube.performDown();
				}
				else if(token == 'X' || token == 'x')
				{
					System.out.print("Exit command received.");
					break outerloop;
				}
				else
				{
					System.out.print("Undefined command... Please try again:" + "\n");
					break;
				}
			}
			System.out.print(cube.print() + " ");
		}
		scan.close();
	}

}
