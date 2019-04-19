package singh.sashank.myapplication;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BlankFragment extends Fragment {
    TextView name1,address1,number1,faculty1;


    public BlankFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


      View view= inflater.inflate(R.layout.fragment_blank, container, false);
      name1=view.findViewById(R.id.name);
      address1=view.findViewById(R.id.address);
      number1=view.findViewById(R.id.number);
      faculty1=view.findViewById(R.id.faculty);



        name1.setText("");
        address1.setText("");
        number1.setText("");
        faculty1.setText("");

        String name=getArguments().getString("name");
        String faculty=getArguments().getString("faculty");
        String number=getArguments().getString("number");
        String address=getArguments().getString("address");
        name1.setText(name);
        address1.setText(address);
        number1.setText(number);
        faculty1.setText(faculty);




      return view;
    }

}
