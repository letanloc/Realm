package loc.nks.relmdatabaseandroid.data;

import android.content.Context;
import android.util.Log;

import java.util.concurrent.atomic.AtomicInteger;
import io.realm.Realm;
import io.realm.RealmObject;
import io.realm.RealmResults;
import loc.nks.relmdatabaseandroid.model.Student;

/**
 * Created by loc on 07/01/2016.
  */

public class StudentDAO {
    Realm realm;

    public StudentDAO(Context context) {
        realm = Realm.getInstance(context);
    }


    // insert student
    public void Insert(Student st) {
        realm.beginTransaction();

        int id = realm.where(Student.class).max("Id") != null ? ( realm.where(Student.class).max("Id")).intValue() + 1 : 1;


        st.setId(id);
        Student student = realm.copyToRealm(st);
        realm.commitTransaction();
    }

    private static AtomicInteger id = new AtomicInteger();

    // thuc hien lay toan bo student
    public RealmResults<Student> StudentList() {
        return realm.where(Student.class).findAll();

    }

    public Student  getStudent(String name){
        RealmResults<Student>results =realm.where(Student.class).findAll().



    }

}
