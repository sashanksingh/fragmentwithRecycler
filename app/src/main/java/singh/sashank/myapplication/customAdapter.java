package singh.sashank.myapplication;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;



import java.util.List;


public class customAdapter extends RecyclerView.Adapter<customAdapter.ViewHolder> {

    private List<model> list;


    public customAdapter(List<model> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public customAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        Context context = viewGroup.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View contactView = inflater.inflate(R.layout.layout_design, viewGroup, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(contactView);


        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull customAdapter.ViewHolder viewHolder, int i) {
      model moda = list.get(i);
        Bundle bundle=new Bundle();
        String name=moda.getName();
        String address=moda.getAddress();
        String faculty=moda.getFaculty();
        String number=moda.getNumber();


        TextView textViewName = viewHolder.nameText;
        textViewName.setText(moda.getName());



        TextView textViewAddress = viewHolder.addressText;
        textViewAddress.setText(moda.getAddress());

        TextView textViewContact = viewHolder.numberText;
        textViewContact.setText(moda.getNumber());

        TextView textViewFaculty = viewHolder.facultyText;
      textViewFaculty.setText(moda.getFaculty());


      viewHolder.itemView.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

              model moda=list.get(i);



              bundle.putString("name",name);
              bundle.putString("faculty",faculty);
              bundle.putString("number",number);
              bundle.putString("address",address);
              BlankFragment blankFragment=new BlankFragment();
              blankFragment.setArguments(bundle);
          }
      });


    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class ViewHolder extends RecyclerView.ViewHolder {

        public TextView nameText;
        public TextView facultyText;
        public TextView numberText;
        public TextView addressText;


        public ViewHolder(View itemView) {

            super(itemView);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                }
            });

            nameText =  itemView.findViewById(R.id.name);
            facultyText=itemView.findViewById(R.id.faculty);
            numberText=itemView.findViewById(R.id.number);
            addressText=itemView.findViewById(R.id.address);

        }



    }
}
