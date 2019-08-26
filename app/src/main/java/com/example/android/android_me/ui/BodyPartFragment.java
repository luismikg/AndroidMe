package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

public class BodyPartFragment extends Fragment {

    //Constructor
    public BodyPartFragment() {
    }

    /**
     * Callback: To send a message to this fragment in order to know that it has been displayed
     */
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        //Inflate the AndroidMe fragment layout
        View rootView = inflater.inflate(R.layout.fragmen_body_part, container, false);

        //Get a reference too the ImageView in the fragment layout
        ImageView imageView = (ImageView) rootView.findViewById( R.id.body_part_image_view );

        //Set the image resource to display
        imageView.setImageResource( AndroidImageAssets.getHeads().get(0) );

        //Return root view
        return rootView;
    }
}
