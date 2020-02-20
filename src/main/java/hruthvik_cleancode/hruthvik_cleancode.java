package hruthvik_cleancode;
import java.io.*;
import java.io.IOException;

public class hruthvik_cleancode {
	public static void main(String[] args) throws IOException
	{
		simple_and_compound_Interest interest_obj = new simple_and_compound_Interest();
		interest_obj.calculateInterest();
		House_Construction_Cost_Estimation house_obj= new House_Construction_Cost_Estimation();
		house_obj.costCalculation();
	}
}
