package com.example.littletwo.fragmentandactivity;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


/**
 * A simple {@link Fragment} subclass.
 */
public class SecondFragment extends Fragment implements View.OnClickListener{

    private Button backBtn;
    private Button toSunBtn;

    public SecondFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View contentView = inflater.inflate(R.layout.fragment_second, container, false);
        backBtn = (Button)contentView.findViewById(R.id.backToFirst);
        toSunBtn = (Button)contentView.findViewById(R.id.jumpToSubactivity);
        backBtn.setOnClickListener(this);
        toSunBtn.setOnClickListener(this);
        return contentView;
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.backToFirst:{
                System.out.print("Back Button Clicked!");
                getActivity().getSupportFragmentManager().popBackStack();
                break;
            }
            case R.id.jumpToSubactivity:{
                Intent intent = new Intent(getActivity(),SubActivity.class);
                startActivity(intent);
            }
        }
    }
}
