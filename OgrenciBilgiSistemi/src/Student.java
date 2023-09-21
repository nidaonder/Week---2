public class Student {
    Course mat;
    Course fizik;
    Course kimya;
    String name;
    String stuNo;
    int classes;
    double avarage;
    boolean isPass;

    Student(String name, String stuNo, int classes, Course mat, Course fizik, Course kimya) {
        this.name = name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.mat = mat;
        this.fizik = fizik;
        this.kimya = kimya;
        this.isPass = false;
    }
    public void addBulkExamNote(int mat, int fizik, int kimya) {
        if (mat >= 0 && mat <= 100) {
            this.mat.note = mat;
        }
        if (fizik >= 0 && fizik <= 100) {
            this.fizik.note = fizik;
        }
        if (kimya >= 0 && kimya <= 100) {
            this.kimya.note = kimya;
        }
    }

    public void givePerformanceNote (String code, int performanceNote) {   // Ödevde istenen Sözlü Notu bu kısımda dahil ediliyor.
        if (performanceNote >= 0 && performanceNote <= 100) {
            if (code == "MAT101" ) {
                this.mat.performanceNote = performanceNote;
            } else if (code == "FZK101") {
                this.fizik.performanceNote = performanceNote;
            } else if (code == "KMY101") {
                this.kimya.performanceNote = performanceNote;
            } else {
                System.out.println("Hatalı Ders Kodu Girişi Yaptınız!");
            }
        }
    }

    public void isPass() {
        if (this.mat.note == 0 || this.fizik.note == 0 || this.kimya.note == 0) {
            System.out.println("Notlar tam olarak girilmemiş");
        } else {
            this.isPass = isCheckPass();
            printNote();
            System.out.println("Ortalama = " + this.avarage);
            if (this.isPass) {
                System.out.println("Sınıfı geçti.");
            } else {
                System.out.println("Sınıfta kaldı.");
            }
        }
    }

    public void calcAvarage()  {
        this.avarage = (((0.1 * this.mat.performanceNote) + (0.9 * this.mat.note)) + ((0.2 * this.fizik.performanceNote) +(0.8 * this.fizik.note)) + ((0.3 * this.kimya.performanceNote) +(0.7*this.kimya.note) )) / 3;
    }

    public boolean isCheckPass() {
        calcAvarage();
        return this.avarage >= 55;
    }

    public void printNote() {
        System.out.println(" =================== ");
        System.out.println("Öğrenci : " + this.name);
        System.out.println("Matematik notu : " + this.mat.note + " Matematik Sözlüsü : " + this.mat.performanceNote);
        System.out.println("Fizik notu : " + this.fizik.note + " Fizik Sözlüsü : " + this.fizik.performanceNote);
        System.out.println("Kimya notu : " + this.kimya.note + " Kimya Sözlüsü : " + this.kimya.performanceNote);
    }
}
