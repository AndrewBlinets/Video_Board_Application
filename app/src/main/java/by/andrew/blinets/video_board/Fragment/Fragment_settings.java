package by.andrew.blinets.video_board.Fragment;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import by.andrew.blinets.video_board.R;

/**
 * Created by Андрей on 13.02.2017.
 */

public class Fragment_settings extends Fragment {

    private static int LAYOUT = R.layout.fragment_settings;
    private View view;

    public Fragment_settings() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT,container,false);
        return view;
    }
}
