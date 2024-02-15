

import java.util.Scanner;

class Percentage {
    float per(int totMarks) {
        float p = (float) totMarks / 6;
        return p;
    }
}

class Studentgrade{
    public static void main(String[] args) {

        System.out.println("***************************");
        System.out.println(" STUDENT GRADE CALCULATOR");
        System.out.println("***************************");

        Scanner s = new Scanner(System.in);
        int i = 1, totalMarks = 0;

        while (i <= 6) {
            System.out.print("Enter marks of Subject-" + i +" :=");
            int Subjects = s.nextInt();

            if (Subjects < 0 || Subjects > 100) {
                System.out.println("Invalid marks...");
                continue;
            }

            totalMarks = totalMarks + Subjects;
            i++;
        }

        double averagePercentage = (totalMarks / (6 * 100.0)) * 100;

        String grade;

        if (averagePercentage >= 90) {
            grade = "A+";
        }
        else if (averagePercentage >= 80) {
            grade = "A";
        }
        else if (averagePercentage >= 70) {
            grade = "B";
        }
        else if (averagePercentage >= 60) {
            grade = "C";
        }
        else if (averagePercentage >= 50) {
            grade = "D";
        }
        else {
            grade = "F";
        }

        System.out.println("Total Marks: =" + totalMarks);
        Percentage ob = new Percentage();
        float pr = ob.per(totalMarks);
        System.out.println("Percentage: =" + pr);
        System.out.println("Grade: =" + grade);

        s.close();
    }
}
