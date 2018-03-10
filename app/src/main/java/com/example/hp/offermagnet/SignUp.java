package com.example.hp.offermagnet;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * Created by hp on 25/02/2018.
 */

public class SignUp  extends Fragment {
Button btn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.tab_signup, container, false);

    //    btn=(Button) rootView.f

        return rootView;
    }
}
