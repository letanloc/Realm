package loc.nks.relmdatabaseandroid.App;

eximport android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by loc on 07/01/2016.
 */
// phần này không dùng tới
public class Myapp extends Application {
    Realm dataRealm;
    @Override
    public void onCreate() {
        super.onCreate();
      
        dataRealm = Realm.getInstance(this);
        // tạo một realm có tên
//        dataRealm = Realm.getInstance(new RealmConfiguration.Builder(this).name("Data.realm").build());
//        ContentProvider
//        st = new Student();
        // thưc hiên
//        myream = Realm.getInstance(new RealmConfiguration.Builder(this).name("MyotherRea2lms.realm").build());
//        WriteArray();
//        StudentArraylist();

    }
}
