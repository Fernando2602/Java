public class ForStatement{
  public static void main(String[] args){
    // for (int counter = 1; counter <= 10; counter++){
    //   System.out.println(counter);
    // }

    int total = 0;
    for (int counter = 2; counter <=20; total += counter, counter += 2){
      System.out.println(total);
      System.out.println(counter);
    }
    System.out.printf("La suma total de los numeros fue: %s", total);

  }
}
