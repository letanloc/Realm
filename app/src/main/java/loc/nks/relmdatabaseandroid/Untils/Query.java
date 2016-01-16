package loc.nks.relmdatabaseandroid.Untils;

import android.app.Activity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import loc.nks.relmdatabaseandroid.R;

/**
 * Created by loc on 07/01/2016.
 */
// bản beta
public class Query extends Wiget {
    public Query(Activity activity) {
        super(activity);
    }

    @Override
    public View id(int id, View... v) {
        return super.id(id, v);
    }

    @Override
    public String St(Object v) {
        return super.St(v);
    }

    @Override
    public double Dou(Object v) {
        return super.Dou(v);
    }
    @Override
    public int Inte(Object v) {
        return super.Inte(v);
    }
}
