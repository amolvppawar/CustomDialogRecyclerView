package com.example.parsaniahardik.customdialogrecyclerview;

import android.content.Context;

import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.List;

public class AdapterRe extends RecyclerView.Adapter<AdapterRe.MyViewHolder> {

    private LayoutInflater inflater;
    private List<DriverVehicle> driverVehicles;


    public AdapterRe(Context ctx, List<DriverVehicle> driverVehicles){

        inflater = LayoutInflater.from(ctx);
        this.driverVehicles = driverVehicles;
    }

    @Override
    public AdapterRe.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.rv_layout, parent, false);
        MyViewHolder holder = new MyViewHolder(view);

        return holder;
    }

    @Override
    public void onBindViewHolder(AdapterRe.MyViewHolder holder, int position) {

        holder.name.setText(driverVehicles.get(position).getVehicleNo());

    }

    @Override
    public int getItemCount() {
        return driverVehicles.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView name;
        RadioButton radioButton;
        CardView card_view;
        private RadioButton lastCheckedRB = null;
        public MyViewHolder(View itemView) {
            super(itemView);
            name = (TextView) itemView.findViewById(R.id.name);
            radioButton = (RadioButton) itemView.findViewById(R.id.radioButton);
            card_view=(CardView) itemView.findViewById(R.id.card_view);;
//            itemView.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    MainActivity.textView.setText("You have selected : "+ driverVehicles.get(getAdapterPosition()).getCabNo());
//                    MainActivity.dialog.dismiss();
//                }
//            });
            radioButton.setEnabled(false);
            card_view.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    radioButton.setEnabled(true);
                    radioButton.setChecked(true);
                    MainActivity.textView.setText("You have selected : "+ driverVehicles.get(getAdapterPosition()).getCabNo());
                    MainActivity.dialog.dismiss();
//                    radioButton.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//                        @Override
//                        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//
//                            if (lastCheckedRB != null) {
//                                lastCheckedRB.setChecked(false);
//                            }
//                            //store the clicked radiobutton
//                            lastCheckedRB = radioButton;
//
//                        }
//                    });

                }
            });


        }

    }
}