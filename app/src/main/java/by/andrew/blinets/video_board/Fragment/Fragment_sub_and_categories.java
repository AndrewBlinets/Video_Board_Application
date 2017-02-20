package by.andrew.blinets.video_board.Fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import by.andrew.blinets.video_board.R;

/**
 * Created by Андрей on 16.02.2017.
 */

public class Fragment_sub_and_categories extends Fragment {

    private static int LAYOUT = R.layout.mainfragment;
    private View view;
    private boolean flag;

    public Fragment_sub_and_categories() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(LAYOUT,container,false);

        flag = true;
        if(flag)
            ((TextView) view.findViewById(R.id.textView_mainfragment)).setText(R.string.categore);
        else
            ((TextView) view.findViewById(R.id.textView_mainfragment)).setText(R.string.subcategore);
        return view;
    }
}
