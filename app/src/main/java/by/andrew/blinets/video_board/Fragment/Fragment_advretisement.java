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
 * Created by Андрей on 20.02.2017.
 */

public class Fragment_advretisement extends Fragment {

    private static int LAYOUT = R.layout.mainfragment;
    private View view;

    public Fragment_advretisement() {
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        view = inflater.inflate(LAYOUT,container,false);

        ((TextView) view.findViewById(R.id.textView_mainfragment)).setText(R.string.advretisement);

        return view;
    }
}
