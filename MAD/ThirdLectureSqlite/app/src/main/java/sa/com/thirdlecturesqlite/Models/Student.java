package sa.com.thirdlecturesqlite.Models;

import com.activeandroid.Model;
import com.activeandroid.annotation.Column;
import com.activeandroid.annotation.Table;

/**
 * Created by akashs on 3/1/17.
 */

@Table(name="StudentInfo")
public class Student extends Model{

    public Student() {
    }

    @Column(name = "StudentId",index = true)
    public int studentId;

    @Column(name = "StudentName")
    public String studentName;

    @Column(name = "StudentCGPA")
    public double cgpa;

    public Student(int studentId, String studentName, double cgpa) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.cgpa = cgpa;
    }
}






