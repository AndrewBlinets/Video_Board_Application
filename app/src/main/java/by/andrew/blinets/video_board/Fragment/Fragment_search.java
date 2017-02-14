package by.andrew.blinets.video_board.Fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import by.andrew.blinets.video_board.R;

/**
 * Created by Андрей on 13.02.2017.
 */

public class Fragment_search extends Fragment {

    private static int LAYOUT = R.layout.fragment_search;
    private View view;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT,container,false);
        return view;
    }
}
