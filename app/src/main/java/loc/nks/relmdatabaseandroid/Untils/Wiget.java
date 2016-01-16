package loc.nks.relmdatabaseandroid.Untils;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.widget.EditText;

/**
 * Created by loc on 07/01/2016.
 */
public class Wiget {
    Activity activity;

    //Beta

    public Wiget(Activity activity) {
        this.activity = activity;

    }

    ;

    public View id(int id, View... v) {
        return v.length ==0 ? activity.findViewById(id) : v[0].findViewById(id);
    }

    public String St(Object v) {
        if (v instanceof EditText) return ((EditText) v).getText().toString();
        return null;
    }


    public double Dou(Object v) {
        if (v instanceof EditText) return Double.valueOf(St(v));
        return 0;
    }

    public int Inte(Object v) {
        if (v instanceof EditText) return Integer.valueOf(St(v));
        return 0;
    }

}
