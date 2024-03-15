package codsoft;
import java.util.Scanner;
public class StudentGradeCalculator {
    static Scanner sc = new Scanner(System.in);
          int number;
          int sum;
     static StudentGradeCalculator stCalculator = new StudentGradeCalculator();

    public static void main(String[] args) {
        int result = stCalculator.totalMark();
        float average = (result/ stCalculator.number);

        System.out.println("Total marks : "+result);
        System.out.println("Your average : "+average);
        System.out.println("Your Grades : "+stCalculator.grade());
    }
    int totalMark(){
        System.out.println("Enter number of subject ");
        number = sc.nextInt();
        int [] subject = new int[number];
        System.out.println("Enter all your marks out of 100 ");
        for(int i = 0; i < subject.length; i++){
            subject[i] = sc.nextInt();
        }

        for(int i = 0; i < subject.length; i++){
            sum += subject[i];
        }
        return sum;
    }
    String grade(){
        String grades="";
        int number = stCalculator.sum;
        int avg = number/stCalculator.number;
        if(avg >= 80 && avg <= 100){
            grades = "A+";
        }
        else if(avg >= 75 && avg <= 79){
             grades = "A";
        }
        else if(avg >= 70 && avg <= 74){
             grades = "A-";
        }
        else if(avg >= 65 && avg <= 69){
             grades = "B+";
        }
        else if(avg >= 60 && avg <= 64){
             grades = "B";
        }
        else if(avg >= 55 && avg <= 59){
             grades = "B-";
        }
        else if(avg >= 50 && avg <= 54){
             grades = "C+";
        }
        else if(avg >= 45 && avg <= 49){
             grades = "C";
        }
        else if(avg >= 40 && avg <= 44){
             grades = "D";
        }
        else if(avg >= 0 && avg <= 39){
             grades = "F";
        }
        else{
            grades = "wrong Input";
        }
        return grades;
    }
}
