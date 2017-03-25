import java.awt.List;

public class RubiksCube 
{
	char[] sigma = new char[8];
	char[] tao = new char[12];
	char[] x = new char[8];
	char[] y = new char[12];
	char buffer;
	public RubiksCube()
	{
		toSolved();
	}
	public void performRight()
	{
		buffer = sigma[2];
		sigma[2] = sigma[1];
		sigma[1] = sigma[6];
		sigma[6] = sigma[7];
		sigma[7] = buffer;
		buffer = tao[1];
		tao[1] = tao[6];
		tao[6] = tao[9];
		tao[9] = tao[5];
		tao[5] = buffer;
		buffer = x[1];
		x[1] = Integer.toString(((Character.getNumericValue(x[6]) + 1)%3)).charAt(0);
		x[6] = Integer.toString(((Character.getNumericValue(x[7]) + 2)%3)).charAt(0);
		x[7] = Integer.toString(((Character.getNumericValue(x[2]) + 1)%3)).charAt(0);
		x[2] = Integer.toString(((Character.getNumericValue(buffer) + 2)%3)).charAt(0);
		buffer = y[5];
		y[5] = y[1];
		y[1] = y[6];
		y[6] = y[8];
		y[8] = buffer;
	}
	public void performLeft()
	{
		buffer = sigma[0];
		sigma[0] = sigma[3]; 
		sigma[3] = sigma[4];
		sigma[4] = sigma[5];
		sigma[5] = buffer;
		buffer = tao[3];
		tao[3] = tao[4];
		tao[4] = tao[11];
		tao[11] = tao[7];
		tao[7] = buffer;
		buffer = x[0];
		x[0] = Integer.toString(((Character.getNumericValue(x[3]) + 2)%3)).charAt(0);
		x[3] = Integer.toString(((Character.getNumericValue(x[4]) + 1)%3)).charAt(0);
		x[4] = Integer.toString(((Character.getNumericValue(x[5]) + 2)%3)).charAt(0);
		x[5] = Integer.toString(((Character.getNumericValue(buffer) + 1)%3)).charAt(0);
		buffer = y[3];
		y[3] = y[4];
		y[4] = y[11];
		y[11] = y[7];
		y[7] = buffer;
	}
	public void performUp()
	{
		buffer = sigma[0];
		sigma[0] = sigma[1];
		sigma[1] = sigma[2];
		sigma[2] = sigma[3];
		sigma[3] = buffer;
		buffer = tao[2];
		tao[2] = tao[1];
		tao[1] = tao[0];
		tao[0] = tao[3];
		tao[3] = buffer;
		buffer = x[0];
		x[0] = x[1];
		x[1] = x[2];
		x[2] = x[3];
		x[3] = buffer;
		buffer = y[0];
		y[0] = y[3];
		y[3] = y[2];
		y[2] = y[1];
		y[1] = buffer;
	}
	public void performDown()
	{
		buffer = sigma[5];
		sigma[5] = sigma[4];
		sigma[4] = sigma[7];
		sigma[7] = sigma[6];
		sigma[6] = buffer;
		buffer = tao[8];
		tao[8] = tao[11];
		tao[11] = tao[10];
		tao[10] = tao[9];
		tao[9] = buffer;
		buffer = x[5];
		x[5] = x[4];
		x[4] = x[7];
		x[7] = x[6];
		x[6] = buffer;
		buffer = y[8];
		y[8] = y[9];
		y[9] = y[10];
		y[10] = y[11];
		y[11] = buffer;
	}
	public void performFront()
	{
		buffer = sigma[0];
		sigma[0] = sigma[5];
		sigma[5] = sigma[6];
		sigma[6] = sigma[1];
		sigma[1] = buffer;
		buffer = tao[2];
		tao[2] = tao[7];
		tao[7] = tao[10];
		tao[10] = tao[6];
		tao[6] = buffer;
		buffer = x[0];
		x[0] = Integer.toString(((Character.getNumericValue(x[5]) + 1)%3)).charAt(0);
		x[5] = Integer.toString(((Character.getNumericValue(x[6]) + 2)%3)).charAt(0);
		x[6] = Integer.toString(((Character.getNumericValue(x[1]) + 1)%3)).charAt(0);
		x[1] = Integer.toString(((Character.getNumericValue(buffer) + 2)%3)).charAt(0);
		buffer = y[2];
		y[2] = Integer.toString(((Character.getNumericValue(y[7]) + 1)%2)).charAt(0);
		y[7] = Integer.toString(((Character.getNumericValue(y[10]) + 1)%2)).charAt(0);
		y[10] = Integer.toString(((Character.getNumericValue(y[6]) + 1)%2)).charAt(0);
		y[6] = Integer.toString(((Character.getNumericValue(buffer) + 1)%2)).charAt(0);
	}
	public void performBack()
	{
		buffer = sigma[2];
		sigma[2] = sigma[7];
		sigma[7] = sigma[4];
		sigma[4] = sigma[3];
		sigma[3] = buffer;
		buffer = tao[0];
		tao[0] = tao[5];
		tao[5] = tao[8];
		tao[8] = tao[4];
		tao[4] = buffer;
		buffer = x[2];
		x[2] = Integer.toString(((Character.getNumericValue(x[7]) + 1)%3)).charAt(0);
		x[7] = Integer.toString(((Character.getNumericValue(x[4]) + 2)%3)).charAt(0);
		x[4] = Integer.toString(((Character.getNumericValue(x[3]) + 1)%3)).charAt(0);
		x[3] = Integer.toString(((Character.getNumericValue(buffer) + 2)%3)).charAt(0);
		buffer = y[0];
		y[0] = Integer.toString(((Character.getNumericValue(y[5]) + 1)%2)).charAt(0);
		y[5] = Integer.toString(((Character.getNumericValue(y[8]) + 1)%2)).charAt(0);
		y[8] = Integer.toString(((Character.getNumericValue(y[4]) + 1)%2)).charAt(0);
		y[4] = Integer.toString(((Character.getNumericValue(buffer) + 1)%2)).charAt(0);
	}
	public String print()
	{
		String result = "";
		result += '(';
		for(int i = 0; i < 7; i++)
		{
			result += sigma[i] + ", ";
		}
		result+= sigma[7] +"), (";
		for(int i = 0; i < 11; i++)
		{
			result += tao[i] + ", ";
		}
		result+= tao[11] +"), (";
		for(int i = 0; i < 7; i++)
		{
			result += x[i] + ", ";
		}
		result+= x[7] +"), (";
		for(int i = 0; i < 11; i++)
		{
			result += y[i] + ", ";
		}
		result += y[11] + ")";
		return result;
	}
	public void toSolved()
	{
		for(int i = 0; i < 8; i++)
		{
			sigma[i] = (Integer.toString(i+1)).charAt(0);
			x[i] = Integer.toString(0).charAt(0);
		}
		for(int j = 0; j < 12; j++)
		{
			tao[j] = (Integer.toString(j+1, 16)).charAt(0);
			y[j] = (Integer.toString(0)).charAt(0);
		}
	}
}
