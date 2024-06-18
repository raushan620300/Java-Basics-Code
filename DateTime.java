
import java.time.LocalDateTime;

  public class DateTime {
     public static void getTime() {
         LocalDateTime myObj = LocalDateTime.now();
         System.out.println(myObj);
     }
     public static void main(String[] args) {
        getTime();
     }    
}
