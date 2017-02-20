package by.andrew.blinets.video_board.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import by.andrew.blinets.video_board.R;
import by.andrew.blinets.video_board.model.Advretisement;

/**
 * Created by Андрей on 20.02.2017.
 */

public class Adapter_advretisement extends BaseAdapter {

    Context ctx;
    LayoutInflater lInflater;
    ArrayList<Advretisement> List_advretisement;

    public Adapter_advretisement(Context ctx, ArrayList<Advretisement> list_categories) {
        this.ctx = ctx;
        this.lInflater = (LayoutInflater) ctx
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        List_advretisement = list_categories;
    }

    @Override
    public int getCount() {
        return List_advretisement.size();
    }

    @Override
    public Object getItem(int position) {
        return List_advretisement.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        Adapter_advretisement.ViewHolder holder = new Adapter_advretisement.ViewHolder();
        if (view == null) {
            view = lInflater.inflate(R.layout.activity_iteam_advertisement, parent, false);

          //  holder.Name_ViewHolder = (TextView) view.findViewById(R.id.item_sub_and_category_textView);
            view.setTag(holder);
        } else
            holder = (Adapter_advretisement.ViewHolder) view.getTag();
        if (position % 2 == 0)
            view.setBackgroundColor(0xFFE6E6E6);
        else
            view.setBackgroundColor(0xFFE8E8E8);
        Advretisement obj = getItems(position);
       // holder.Name_ViewHolder.setText(obj.getName_category());
        return view;
    }

    private Advretisement getItems(int position) {
        return ((Advretisement) List_advretisement.get(position));
    }

    static class ViewHolder {
        public TextView Name_ViewHolder;
    }
}
