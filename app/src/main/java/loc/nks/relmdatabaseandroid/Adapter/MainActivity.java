package loc.nks.relmdatabaseandroid.Adapter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import io.realm.Realm;
import loc.nks.relmdatabaseandroid.Addnewstudent;
import loc.nks.relmdatabaseandroid.R;
import loc.nks.relmdatabaseandroid.data.StudentDAO;
import loc.nks.relmdatabaseandroid.model.Student;
import loc.nks.relmdatabaseandroid.studentAdapter;

public class MainActivity extends AppCompatActivity {
    Student st;
    Realm raRealm;
    Realm myream;
    RecyclerView recyclerView;
    StudentDAO StDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        StDAO = new StudentDAO(this);
        init();
        adapte = new studentAdapter(StDAO.StudentList());
        recyclerView.setAdapter(adapte);
        StDAO.StudentList();
    }

    //
//    public void StudentArraylist() {
    //        RealmResults<Student> RlistStudent = raRealm.where(Student.class).findAll();
//        Log.e("Demo", RlistStudent.size() + "");
//
//    }

    studentAdapter adapte;

    @Override
    protected void onRestart() {
        super.onRestart();
        // load all student from data data
        adapte = new studentAdapter(StDAO.StudentList());
        recyclerView.setAdapter(adapte);
        StDAO.StudentList();
    }

    private void init() {
        recyclerView = (RecyclerView) findViewById(R.id.Re);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        (findViewById(R.id.FloadAdd)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), Addnewstudent.class));
            }
        });
    }
/// first demo
//    //
//    public void WriteArray() {
//        raRealm.beginTransaction();
//        Student Rm = raRealm.createObject(Student.class);
//
//        Rm.setId(11);
//        Rm.setAge(10);
//        Rm.setMark(11.1);
//        Rm.setName("Le tan loc");
//        Rm.setClassification("demo");
//        raRealm.commitTransaction();
//
//
//        //c2
////        Student Rm2 = new Student();
////        Rm2.setId(21);
////        Rm2.setAge(10);
////        Rm2.setMark(11.1);
////        Rm2.setName("Le tan loc");
////        Rm2.setClassification("demo");
////
////        raRealm.beginTransaction();
////        Student copyOfCountry2 = raRealm.copyToRealm(Rm2);
////        raRealm.commitTransaction();
//        raRealm.beginTransaction();
//        Rm = raRealm.createObject(Student.class);
//        Rm.setId(12);
//        Rm.setAge(10);
//        Rm.setMark(11.1);
//        Rm.setName("Le tan loc");
//        Rm.setClassification("demo");
//        raRealm.commitTransaction();
//
//        raRealm.beginTransaction();
//        Rm = raRealm.createObject(Student.class);
//        Rm.setId(13);
//        Rm.setAge(10);
//        Rm.setMark(11.1);
//        Rm.setName("Le tan loc");
//        Rm.setClassification("demo");
//        raRealm.commitTransaction();
//
//        raRealm.beginTransaction();
//        Rm = raRealm.createObject(Student.class);
//        Rm.setId(14);
//        Rm.setAge(10);
//        Rm.setMark(11.1);
//        Rm.setName("Le tan loc");
//        Rm.setClassification("demo");
//        raRealm.commitTransaction();
//    }
}
