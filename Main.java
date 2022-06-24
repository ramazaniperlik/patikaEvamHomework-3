package ramazaniperlik;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    //Console'dan Input girebilmek için Scanner sınıfımızdan bir değer tanımladık.
        private static final Scanner scan = new Scanner(System.in);
        //Priorities sınıfındaki getStudents methodunu kullanablmek adına Priorities sınıfından instance oluşturduk.
        private static final  Priorities priorities = new Priorities();

        public static void main(String[] args) {
            //Burada while döngüsünün döneceği toplam satır sayısını alıyoruz.
            int totalEvents = Integer.parseInt(scan.nextLine());
            //Her bir satırı String listesine atacağımız events listesini tanımladık.
            List<String> events = new ArrayList<>();

            //Girilen inputtaki ilk satırdan sonraki satırlarımızı dönecek olan ve her satırı
            // events listesine atacak olan while döngüsünü oluşturduk.Döngü totalEvents değeri 1 azaltılarak 0'a
            //eşit olana kadar dönecek.
            while (totalEvents-- != 0) {
                String event = scan.nextLine();
                events.add(event);
            }

            //Console'dan alınan satırlar Priorities sınıfındaki getStudents sınıfına gönderildi ve oradan
            //dönecek olan liste Student tipindeki listeye atıldı.
            List<Student> students = priorities.getStudents(events);

            //students listsi boş mu diye kontrol sağlanacak.Boşsa ekrana "EMPTY" yazacak değilse içerisindeki
            //Student tipindeki nesnelerin isimleri doreach ile dönecek.
            if (students.isEmpty()) {
                System.out.println("EMPTY");
            } else {
                for (Student st: students) {
                    System.out.println(st.getName());
                }
            }
        }
    }