package ramazaniperlik;

//Student sınıfı oluşturuldu ve bir sınıfa ait farklı instanceların değerlerini karşılaştırabilmek için
//Comparable<Student> implemente edildi.
class Student implements Comparable<Student>{
    //Sınıfa ait fieldlar oluşturuldu.
    String name = new String();
    double cgpa;
    int id;

    public Student(String name,double cgpa,int id)
    {
        this.name = name;
        this.cgpa = cgpa;
        this.id = id;
    }
    public String getName(){
        return this.name;
    }

    //Buradaki compareTo methodu Comparable interface'inden overload edilmiştir.Mevcuttaki ve parametre olarak
    //belirtilen değerlerin karşılaştırmasını yapar.
    public int compareTo(Student s)
    {
        if(cgpa == s.cgpa)
        {
            if(name.compareTo(s.name) == 0)
            {
                if(id == s.id)
                    return 0;
                else if (id > s.id)
                    return 1;
                else
                    return -1;
            }
            else
                return name.compareTo(s.name);
        }
        else if(cgpa > s.cgpa)
            return -1;
        else
            return 1;
    }

}