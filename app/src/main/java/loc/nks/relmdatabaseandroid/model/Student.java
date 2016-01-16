package loc.nks.relmdatabaseandroid.model;

import io.realm.Realm;
import io.realm.RealmConfiguration;
import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

/**
 * Created by loc on 07/01/2016.
 */
public class Student extends RealmObject {

    private int Id;

      public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    private String StudientId;
    private String Name;
    private double Mark;
    private int Age;
    private String classification;

    public Student(int id, String studientId, String name, double mark, int age, String classification) {
        Id = id;
        StudientId = studientId;
        Name = name;
        Mark = mark;
        Age = age;
        this.classification = classification;
    }

    public Student() {
    }

    ;

    public String getStudientId() {
        return StudientId;
    }

    public void setStudientId(String studientId) {
        StudientId = studientId;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getMark() {
        return Mark;
    }

    public void setMark(double mark) {
        Mark = mark;


    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

//    public int Id() {
//
//
//    }

}
