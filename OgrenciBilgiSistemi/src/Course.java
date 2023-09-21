public class Course {
    Teacher courseTeacher;
    String name;
    String code;
    String prefix;
    int note;
    int performanceNote;   // Course sınıfına nitelik olarak sözlü notu dahil edildi.


    Course (String name, String code, String prefix) {
        this.name = name;
        this.code = code;
        this.prefix = prefix;
        this.note = 0;
        this.performanceNote = 0;
    }
    public void addTeacher(Teacher t) {
        if (this.prefix.equals(t.branch)) {
            this.courseTeacher = t;
            System.out.println("İşlem başarılı");
        } else {
            System.out.println(t.name + " Bu dersi veremez!");
        }
    }

    public void printTeacher() {
        if (this.courseTeacher != null) {
            System.out.println(this.name + " Dersinin akademisyeni " + this.courseTeacher.name);
        } else {
            System.out.println(this.name + " Dersine akademisyen atanmamıştır.");
        }
    }
}
