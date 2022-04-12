import java.io.IOException;
import java.util.Scanner;
class Main {
  private static Scanner x;
  public static void main(String[] args) {
    try {
    Service1 odwo = new Service1();
      
    int k;
      System.out.println("wybierz funkcje ");
      System.out.println(" 1. Dodanie studenta \n 2. Wypisanie listy studnetow  \n  3. koniec");
      Scanner to = new Scanner(System.in);
      k = to.nextInt();

      switch(k)
        {
          case 1:
          System.out.println("Podaj imie i wiek i date urodzenia studenta: ");
          x = new Scanner (System.in);
          String i = x.nextLine();
          int w = x.nextInt();
          String d = x.nextLine();  
          odwo.addStudent(new Student(i,w,d));
            System.out.println("Dodano studenta do bazy");
            break;
            case 2:
          var students = odwo.getStudents();
          for(Student current : students) {
          System.out.println(current.ToString());  
            
        }
      

      

      }
    } catch (IOException e) {

      

    }
  }
}