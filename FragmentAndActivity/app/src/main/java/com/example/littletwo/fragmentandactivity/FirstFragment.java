package com.example.littletwo.fragmentandactivity;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class FirstFragment extends Fragment implements View.OnClickListener{

    private Button jumpBtn;

    public FirstFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View contentView = inflater.inflate(R.layout.fragment_first, container, false);

        jumpBtn = (Button)contentView.findViewById(R.id.jumpButton);
        jumpBtn.setOnClickListener(this);

        return contentView;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.jumpButton:{
                getActivity()
                        .getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.fragment_container,new SecondFragment(),null)
                        .addToBackStack(null)
                        .commit();
            }
        }
    }
}
