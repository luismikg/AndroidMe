package com.example.android.android_me.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.android.android_me.R;
import com.example.android.android_me.data.AndroidImageAssets;

import java.util.List;

public class BodyPartFragment extends Fragment {

    // Tags
    private static final String TAG = "BodyPartFragment";

    private List<Integer> mImageIds;
    private int mListIndex;

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
        if( this.mImageIds != null ){
            imageView.setImageResource( this.mImageIds.get( this.mListIndex ) );
        }else{
            Log.v(BodyPartFragment.TAG, "Este fragmento tiene un null en la lista de imagenes");
        }

        this.setClickListener( imageView );

        //Return root view
        return rootView;
    }

    private void setClickListener(final ImageView imageView){
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                BodyPartFragment.this.mListIndex += 1;

                if( BodyPartFragment.this.mListIndex == BodyPartFragment.this.mImageIds.size() ){
                    BodyPartFragment.this.mListIndex = 0;
                }

                int idx = BodyPartFragment.this.mListIndex;
                imageView.setImageResource( BodyPartFragment.this.mImageIds.get( idx ) );
            }
        });
    }

    public void setmImageIds(List<Integer> mImageIds) {
        this.mImageIds = mImageIds;
    }

    public void setmListIndex(int mListIndex) {
        this.mListIndex = mListIndex;
    }
}
