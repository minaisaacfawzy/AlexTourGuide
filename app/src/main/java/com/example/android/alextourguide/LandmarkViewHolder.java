package com.example.android.alextourguide;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by M on 15/06/2018.
 */

public class LandmarkViewHolder extends RecyclerView.ViewHolder {
    TextView txtvName;
    TextView txtvDesc;
    ImageView imgvLandmark;

    public LandmarkViewHolder(View itemView) {
        super(itemView);
        txtvName = itemView.findViewById(R.id.txtv_location_name);
        txtvDesc = itemView.findViewById(R.id.txtv_location_desc);
        imgvLandmark = itemView.findViewById(R.id.imgv_location);
    }

    public void bindLandmark(Landmark landmark){
            txtvName.setText(landmark.getmName());
            txtvDesc.setText(landmark.getmDescription());
            imgvLandmark.setImageBitmap(landmark.getBitmapImage());
    }

}
