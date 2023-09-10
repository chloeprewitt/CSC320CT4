package CT4;
import java.util.Scanner;	
public class GradeStatistics {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
float valuesSum = 0;
float numValues = 10;
float currValue=0;
int i=0;
float max = 0;
float min = 110;
//input loop
System.out.println("Enter a grade: ");
for(i=0; i<numValues; ++i) {
	currValue=input.nextFloat();
	if (i==0) {
		max = currValue;
		min = currValue; //assuming a grade can't be higher than 110
	}
			valuesSum+=currValue;
			if (currValue > max) {
				max = currValue;
			}
			if (currValue < min) {
				min = currValue;
			}
				System.out.println(max);
				System.out.println(min);
}
//printing average, min, and max
System.out.println("Average: " + valuesSum/numValues);
System.out.println("Maximum: " + max);
System.out.println("Minimum: " + min);

	}
}

