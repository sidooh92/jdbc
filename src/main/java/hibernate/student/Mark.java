package hibernate.student;

import javax.persistence.*;

@Entity
@Table(name = "MARK")
public class Mark {
    public void setIdMark(int idMark) {
        this.idMark = idMark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idMark;

    private int mark;

    @ManyToOne
    @JoinColumn(name = "student_id")
    private Student student;


    public int getIdMark() {
        return idMark;
    }

    public int getMark() {
        return mark;
    }

    public Student getStudent() {
        return student;
    }

    public Mark() {
    }

    public Mark(int mark, Student student) {
        this.student = student;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Mark{" +
                "idMark=" + idMark +
                ", mark=" + mark +
                '}';
    }


}
