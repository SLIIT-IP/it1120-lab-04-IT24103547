import java.util.Scanner;
public class IT24103547Lab4Q2 {
public static void main(String[] args) 
{
Scanner scanner = new Scanner(System.in);

System.out.print("Enter exam marks (0-100):");
int examMarks = scanner.nextInt();

while (examMarks < 0 || examMarks > 100){
System.out.print("Invalid examMarks (0-100):");
examMarks = scanner.nextInt();
}

System.out.print("Enter lab submission marks (0-100):");
int labMarks = scanner.nextInt();

while (labMarks < 0 || labMarks > 100 ){
System.out.print("Invalid lab submission Marks (0-100):");
labMarks = scanner.nextInt();
}

System.out.print("Enter percentage for exam marks:");
double examPercentage = scanner.nextDouble();

System.out.print("Enter percentage for lab marks:");
double labPercentage = scanner.nextDouble();

while (examPercentage < 0 || labPercentage < 0 || examPercentage + labPercentage !=100) {
System.out.println("Percentages must add up to 100");

System.out.print("Enter Percentage for exam marks:");
examPercentage = scanner.nextDouble();

System.out.print("Enter Percentage for lab marks:");
labPercentage = scanner.nextDouble();
}

double finalMark = (examMarks * examPercentage/100) + (labMarks * labPercentage/100);

System.out.println("The final mark is "+finalMark);

scanner.close();
}
}

