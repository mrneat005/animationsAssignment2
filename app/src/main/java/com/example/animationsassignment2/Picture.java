package com.example.animationsassignment2;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Picture#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Picture extends Fragment {

    AnimationDrawable attack,idle,crouch,jump,run;
    ImageView myImageView;

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Picture() {
        // Required empty public constructor
    }


    /** function for animations*/
    public void startAnimation(int animationValue)
    {
        switch (animationValue)
        {
            //Attack
            case 1:
            {
                    myImageView.setBackgroundResource(R.drawable.attack);
                    attack = (AnimationDrawable) myImageView.getBackground();

                    attack.start();

                break;
            }
            case 2:
            {
                    myImageView.setBackgroundResource(R.drawable.crouch);
                    crouch = (AnimationDrawable) myImageView.getBackground();
                    crouch.start();
                break;
            }
            case 3:
            {
                myImageView.setBackgroundResource(R.drawable.run);
                run = (AnimationDrawable) myImageView.getBackground();
                run.start();
                break;
            }
            case 4:
            {
                myImageView.setBackgroundResource(R.drawable.idle);
                idle = (AnimationDrawable) myImageView.getBackground();
                idle.start();
                break;
            }
            case 5:
            {
                myImageView.setBackgroundResource(R.drawable.jump);
                jump = (AnimationDrawable) myImageView.getBackground();
                jump.start();
                break;
            }
            default:
            {
                myImageView.setBackgroundResource(R.drawable.idle);
                idle = (AnimationDrawable) myImageView.getBackground();
                idle.start();
                break;
            }
        }
    }



    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Picture.
     */
    // TODO: Rename and change types and number of parameters
    public static Picture newInstance(String param1, String param2) {
        Picture fragment = new Picture();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_picture, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        myImageView = getActivity().findViewById(R.id.imageView2);
    }
}