package com.example.android.alextourguide;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by M on 08/06/2018.
 */

public class LandmarkAdapter extends RecyclerView.Adapter<LandmarkViewHolder> {
    ArrayList<Landmark> landmarks;
    Context context;

    public LandmarkAdapter(ArrayList<Landmark> landmarks, Context context) {
        this.landmarks = landmarks;
        this.context = context;
    }

    @Override
    public LandmarkViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        return new LandmarkViewHolder(view);
    }

    @Override
    public void onBindViewHolder(LandmarkViewHolder holder, int position) {
        Landmark landmark = landmarks.get(position);
        holder.bindLandmark(landmark);
    }

    @Override
    public int getItemCount() {
        return landmarks.size();
    }
}
