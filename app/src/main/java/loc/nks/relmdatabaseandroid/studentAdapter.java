package loc.nks.relmdatabaseandroid;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import io.realm.RealmResults;
import loc.nks.relmdatabaseandroid.model.Student;

/**
 * Created by loc on 07/01/2016.
 */
public class studentAdapter extends RecyclerView.Adapter<studentAdapter.Viewhole> {
    RealmResults<Student> listStudent;

    public studentAdapter(RealmResults<Student> list) {
        listStudent = list;
    }

    @Override
    public Viewhole onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false);
        Viewhole vh = new Viewhole(v);

        return vh;

    }

    @Override
    public void onBindViewHolder(Viewhole h, int position) {
        h.txtSetion.setText(listStudent.get(position).getClassification());
        h.txtUsername.setText(listStudent.get(position).getName());
        h.txtMark.setText(listStudent.get(position).getMark() + "");
    }

    @Override
    public int getItemCount() {
        return listStudent.size();
    }
    
    class Viewhole extends RecyclerView.ViewHolder {
        TextView txtUsername, txtMark, txtSetion;

        public Viewhole(View v) {
            super(v);
            txtMark = (TextView) v.findViewById(R.id.txtMark);
            txtUsername = (TextView) v.findViewById(R.id.txtStudent);
            txtSetion = (TextView) v.findViewById(R.id.txtSection);


        }
    }

}
