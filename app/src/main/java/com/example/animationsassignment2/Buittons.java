package com.example.animationsassignment2;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Buittons#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Buittons extends Fragment {
    private Button attack,crouch,jump,run,idle;
    private  myListener listener;


    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public Buittons() {
        // Required empty public constructor
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        try {
            listener = (myListener) context;
        }catch (ClassCastException exp)
        {
            throw new ClassCastException(context.toString() + "Interface not created in the host Activity");

        }
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment Buittons.
     */








    // TODO: Rename and change types and number of parameters
    public static Buittons newInstance(String param1, String param2) {
        Buittons fragment = new Buittons();
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
        return inflater.inflate(R.layout.fragment_buittons, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        listener.onButtonClicked(0);
        attack = getActivity().findViewById(R.id.attackButton);
        crouch = getActivity().findViewById(R.id.crouchButton);
        run = getActivity().findViewById(R.id.runButton);
        idle = getActivity().findViewById(R.id.idleButton);
        jump = getActivity().findViewById(R.id.jumpButton);

        attack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onButtonClicked(1);
            }
        });
        crouch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onButtonClicked(2);
            }
        });
        run.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onButtonClicked(3);
            }
        });
        idle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onButtonClicked(4);
            }
        });
        jump.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onButtonClicked(5);
            }
        });
    }


    public interface myListener{
        public void onButtonClicked(int animationValue);

    }
}