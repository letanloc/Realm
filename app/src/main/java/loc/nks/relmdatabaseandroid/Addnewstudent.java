package loc.nks.relmdatabaseandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import loc.nks.relmdatabaseandroid.Adapter.MainActivity;
import loc.nks.relmdatabaseandroid.R;
import loc.nks.relmdatabaseandroid.Untils.Query;
import loc.nks.relmdatabaseandroid.data.StudentDAO;
import loc.nks.relmdatabaseandroid.model.Student;

public class Addnewstudent extends AppCompatActivity {
    Query q;
    EditText edtName, edtMark, edtIdST;
    Button btnAddST;
    StudentDAO studentDAO;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addnewstudent);
        q = new Query(this);
        studentDAO = new StudentDAO(this);
        init();
    }

    private void init() {
        edtName = (EditText) q.id(R.id.edtNameST);
        edtIdST = (EditText) q.id(R.id.edtIdST);
        edtMark = (EditText) q.id(R.id.edtMarkST);
        btnAddST = (Button) q.id(R.id.btnAddST);
        btnAddST.setOnClickListener(click);
    }


    // onclick
    private View.OnClickListener click = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Toast.makeText(getApplicationContext(), "ASSAA", Toast.LENGTH_SHORT).show();

            startActivity(new Intent(getApplicationContext(), MainActivity.class));
            finish();
//            }
        }
    };

    // thuc hien them mot   st vao realm
    @Override
    public void finish() {
        Student st = new Student();
        st.setName(q.St(edtName));
        st.setMark(q.Dou(edtMark));
        st.setStudientId(q.St(edtIdST));
        st.setClassification(DK(q.Inte(q.St(edtMark))));
        studentDAO.Insert(st);
        Log.e("thuc hien kiem tra","ssasas");
        super.finish();
    }

    public String DK(int num) {
        String St = "Kem";
        if (num >= 8) St = "gioi";
        else if ((num < 8) && num >= 6.5) St = "Kha";
        else if (num < 6.5 && num >= 5) St = "Trung binh";
        return St;
    }

    public boolean ValIsEmty(Object... val) {
        for (Object v : val) {
            if (q.St(v).trim().length() > 0) {
                return true;
            }
        }
        return false;
    }
}

