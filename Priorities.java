package ramazaniperlik;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Priorities {
    //
    public ArrayList<Student> getStudents(List<String> events)
    {

        //Student tipinde bir student queue oluşturduk.
        PriorityQueue<Student> pq = new PriorityQueue<Student>();

        //Main tarafından argüman olarak gönderilen events string listi tek tek foreach ile dolaşıyoruz.
        for(String i:events)
        {
            //String tipte bir dizi oluşturduk.
            String[] s = new String[4];
            //Burada ise; mevcut satırı split ile boşluklardan(\\space) ayırıyoruz.
            s = i.split("\\s");
            //Bölünen satır s dizisine atıldıktan sonra dizi boyutu kontrol ediliyor.
            if(s.length>1)
            {
                //Burada ise; dizi boyutu 1'den büyükse dizideki 1,2 ve 3. indisteki değerleri boxing
                //işlemlerini yaparak pq listesine ekleyecek.
                pq.add(new Student(s[1],Double.valueOf(s[2]),Integer.valueOf(s[3])));
            }
            else
            {
                pq.poll();
            }
        }
        return new ArrayList<Student>(pq);
    }
}
