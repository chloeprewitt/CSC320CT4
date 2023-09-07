package CT4;

public class GradeStatistics {
import java.util.Scanner;	
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
float valuesSum = 0;
float numValues = 10;
float currValue=0;
int i=0;
//input loop
System.out.println("Enter a grade: ");
for(i=0; i<numValues;++i) {
	currValue=input.nextFloat();
			valuesSum+=currValue;
}
	}
}

