package by.andrew.blinets.video_board.Adapter;


import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import by.andrew.blinets.video_board.R;
import by.andrew.blinets.video_board.dto.Categories;

/**
 * Created by Андрей on 13.02.2017.
 */

public class Adapter_sub_and_category extends BaseAdapter {

    Context ctx;
    LayoutInflater lInflater;
    ArrayList<Categories> List_categories;

    public Adapter_sub_and_category(Context ctx, ArrayList<Categories> list_categories) {
        this.ctx = ctx;
        this.lInflater = (LayoutInflater) ctx
                .getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        List_categories = list_categories;
    }

    @Override
    public int getCount() {
        return List_categories.size();
    }

    @Override
    public Object getItem(int position) {
        return List_categories.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        ViewHolder holder = new ViewHolder();
        if (view == null) {
            view = lInflater.inflate(R.layout.iteam_sub_and_category, parent, false);

            holder.Name_ViewHolder = (TextView) view.findViewById(R.id.item_sub_and_category_textView);
            view.setTag(holder);
        } else
            holder = (ViewHolder) view.getTag();
        if (position % 2 == 0)
            view.setBackgroundColor(0xFFE6E6E6);
        else
            view.setBackgroundColor(0xFFE8E8E8);
        Categories obj = getItems(position);
        holder.Name_ViewHolder.setText(obj.getName_category());
        return view;
    }

    private Categories getItems(int position) {
        return ((Categories)List_categories.get(position));
    }

    static class ViewHolder {
        public TextView Name_ViewHolder;
    }
}
