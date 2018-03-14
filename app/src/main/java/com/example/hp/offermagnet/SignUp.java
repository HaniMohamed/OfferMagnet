package com.example.hp.offermagnet;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;



public class SignUp  extends Fragment {
Button btn;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        final View rootView = inflater.inflate(R.layout.tab_signup, container, false);

      btn=(Button) rootView.findViewById(R.id.signup);
      btn.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
             Intent intent=new Intent(view.getContext() ,Category.class);
              startActivity(intent);
          }
      });

        return rootView;
    }
}
