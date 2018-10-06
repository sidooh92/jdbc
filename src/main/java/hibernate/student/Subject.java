package hibernate.student;


import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "SUBJECT")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idSubject;

    private String subjectName;

    @ManyToMany
    @JoinTable(name = "SUBJECT_STUDENT",
                joinColumns =
                        {@JoinColumn(name="subject_id")},
                inverseJoinColumns =
                        {@JoinColumn(name="student_id")})
    private Set<Student> students;

    public Subject() {
    }

    public int getIdSubject() {
        return idSubject;
    }

    public void setIdSubject(int idSubject) {
        this.idSubject = idSubject;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public void setStudents(Set<Student> students) {
        this.students = students;
    }
}
