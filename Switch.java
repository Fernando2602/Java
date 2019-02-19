import java.util.Scanner;

public class Switch{
  public static void main(String[] args){
    int total = 0, totalGrade = 0, gradeA = 0, gradeB = 0, gradeC = 0, gradeD = 0, gradeF = 0;
    Scanner input = new Scanner(System.in);

    while (input.hasNext()){
      totalGrade++;
      int grade = input.nextInt();
      total += grade/10;

      switch (grade/10){
        case 9:
        case 10:
          gradeA++;
          break;
        case 8:
          gradeB++;
          break;
        case 7:
          gradeC++;
          break;
        case 6:
          gradeD++;
          break;
        default:
          gradeF++;
          break;
      }

      System.out.print(total);

    }

  }
}
