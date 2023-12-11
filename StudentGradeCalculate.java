import java.util.Scanner;

public class StudentGradeCalculate 
{
public static void main(String[] args) 
{
 Scanner scanner = new Scanner(System.in);
// Get number of subjects
 System.out.print("Enter the number of subjects: ");
 int noofsub = scanner.nextInt();

// Initialize variables
 int totalMarks = 0;
 int[] marks = new int[noofsub];

// Get marks for each subject
 for (int i = 0; i < noofsub; i++) 
{
 System.out.print("Enter marks for subject " + (i + 1) + ": ");
 marks[i] = scanner.nextInt();
 totalMarks += marks[i];
 }

// Calculate average percentage
 double averagePercentage = (double) totalMarks / noofsub;

// Calculate grade
 String grade;
 if (averagePercentage >= 90)
 {
  grade = "A";
 } 
else if (averagePercentage >= 80) 
{
 grade = "B";
} 
else if (averagePercentage >= 70) 
{
 grade = "C";
} 
else if (averagePercentage >= 60) 
{
 grade = "D";
} 
else 
{
 grade = "E";
}

// Display results
System.out.println("Total Marks: " + totalMarks);
System.out.println("Average Percentage: " + averagePercentage + "%");
System.out.println("Grade: " + grade);
    }
}