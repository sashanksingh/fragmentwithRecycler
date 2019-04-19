package singh.sashank.myapplication;

import android.content.res.Configuration;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    FrameLayout frameLayout;
    ListView listView;

    RecyclerView recyclerView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



       ArrayList<model> arrayList=new ArrayList<>();
       arrayList.add(new model("Sashank Singh","computer Science","1234567","kharar"));
        arrayList.add(new model("ram kumar","management","1234112","landra"));
        arrayList.add(new model("sita prasad","humanatics","3234234567","chandigarhr"));
        arrayList.add(new model("hari kumar","sociology","1242347","mohali"));
        arrayList.add(new model("Shyam chand","computer Science","12234234","chandigarh"));

        frameLayout=findViewById(R.id.container);
        recyclerView=findViewById(R.id.recyclerView);
        customAdapter customAdapter=new customAdapter(arrayList);
        recyclerView.setAdapter(customAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        int orientation = this.getResources().getConfiguration().orientation;
        if (orientation == Configuration.ORIENTATION_PORTRAIT) {
            // code for portrait mode
        } else {
            FragmentManager fragmentManager=getSupportFragmentManager();
            FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
            fragmentTransaction.replace(R.id.container,new BlankFragment(),null);
            fragmentTransaction.commit();
        }











    }

}
