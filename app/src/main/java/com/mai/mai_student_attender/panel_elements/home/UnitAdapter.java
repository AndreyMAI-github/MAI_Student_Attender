package com.mai.mai_student_attender.panel_elements.home;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.mai.mai_student_attender.R;

public class UnitAdapter extends ArrayAdapter<Unit> {

    private Context context;
    private Unit[] units;


    public UnitAdapter(Context context, Unit[] units){
        super(context, R.layout.listitem_main, units);
        this.context = context;
        this.units = units;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.listitem_main, parent, false);

        //ImageView imageView = (ImageView) view.findViewById(R.id.number);
        //imageView.setImageResource(R.drawable.ic_launcher_foreground);

        TextView discipline = (TextView) view.findViewById(R.id.discipline);
        discipline.setText(this.units[position].getDiscipline());

        TextView time = (TextView) view.findViewById(R.id.time);
        time.setText(this.units[position].getTime());

        TextView type = (TextView) view.findViewById(R.id.type);
        type.setText(this.units[position].getType());


        return view;
    }
}
