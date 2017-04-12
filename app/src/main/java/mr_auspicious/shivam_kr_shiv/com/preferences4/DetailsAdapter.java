package mr_auspicious.shivam_kr_shiv.com.preferences4;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;


public class DetailsAdapter extends ArrayAdapter<Details> {


    public DetailsAdapter(@NonNull Context context, @NonNull List<Details> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;

        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.layout_design,parent,false);
        }

        Details details = getItem(position);

        TextView textview = (TextView) listItemView.findViewById(R.id.t1);
        if (details != null) {
            textview.setText(details.geName());
        }

        TextView textView = (TextView) listItemView.findViewById(R.id.t2);
        if (details != null) {
            textView.setText(details.getDate());
        }

        TextView textView1 = (TextView) listItemView.findViewById(R.id.t3);
        if (details != null) {
            textView1.setText(details.getPhoneno());
        }


        return listItemView;
    }
}
