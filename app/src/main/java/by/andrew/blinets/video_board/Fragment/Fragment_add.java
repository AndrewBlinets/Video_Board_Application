package by.andrew.blinets.video_board.Fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import by.andrew.blinets.video_board.R;

/**
 * Created by Андрей on 13.02.2017.
 */

public class Fragment_add extends Fragment {

    private static int LAYOUT = R.layout.fragment_add;
    private View view;

    public Fragment_add() {
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public static Fragment_add newInstance() {
        Fragment_add fragment = new Fragment_add();
        //Bundle args = new Bundle();
        //fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT,container,false);
        return view;
    }
}
