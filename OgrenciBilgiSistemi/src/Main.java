public class Main {
    public static void main(String[] args) {

        Course mat = new Course("Matematik" , "MAT101", "MAT");
        Course fizik = new Course("Fizik", "FZK101", "FZK");
        Course kimya = new Course("Kimya", "KMY101", "KMY");

        Teacher t1 = new Teacher("Mahmut Hoca", "1111", "MAT");
        Teacher t2 = new Teacher("Fatma Hoca", "2222", "FZK");
        Teacher t3 = new Teacher("Ali Hoca", "3333", "KMY");

        mat.addTeacher(t1);
        fizik.addTeacher(t2);
        kimya.addTeacher(t3);

        Student s1 = new Student("İnek Şaban", "0101", 4, mat, fizik, kimya);
        s1.addBulkExamNote(50,20,40);
        s1.givePerformanceNote("MAT101",60);
        s1.givePerformanceNote("FZK101", 60);
        s1.givePerformanceNote("KMY101",80);
        s1.isPass();

        Student s2 = new Student("Güdük Necmi", "0202", 4, mat, fizik, kimya);
        s2.addBulkExamNote(100,50,40);
        s2.givePerformanceNote("MAT101", 70);
        s2.givePerformanceNote("FZK101", 80);
        s2.givePerformanceNote("KMY101",80);
        s2.isPass();

        Student s3 = new Student("Hayta İsmail", "0303", 4, mat, fizik, kimya);
        s3.addBulkExamNote(50,20,40);
        s3.givePerformanceNote("MAT101", 90);
        s3.givePerformanceNote("FZK101", 80);
        s3.givePerformanceNote("KMY101", 70);
        s3.isPass();
    }
}