package sa.com.thirdlecturesqlite;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.activeandroid.query.Select;

import java.util.List;

import sa.com.thirdlecturesqlite.Models.Student;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(R.id.textview);

        Student student1 = new Student(121,"Anik", 3.9);
        Student student2 = new Student(151,"Noman", 3.7);

        student1.save();
        student2.save();

        List<Student> studentList = (new Select()).from(Student.class).execute();

        String res="";
        for(Student tm : studentList){
            res += tm.studentName+" "+tm.cgpa+"\n";
        }
        textView.setText(res);
    }
}








