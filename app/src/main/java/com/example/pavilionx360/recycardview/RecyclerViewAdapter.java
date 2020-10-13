package com.example.pavilionx360.recycardview;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyViewHolder> {

    private Context mContext;
    private List<Movie> mData;
    private ViewGroup parent;

    public RecyclerViewAdapter(Context mContext, List<Movie> mData) {

        this.mContext = mContext;
        this.mData = mData;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View view;
        LayoutInflater mInflater = LayoutInflater.from(mContext);
        view = mInflater.inflate(R.layout.cardview_item_book, parent, false);
        return new MyViewHolder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        holder.MovieTitle.setText(mData.get(position).getTitle());
        holder.MovieThumbnail.setImageResource(mData.get(position).getThumbnail());
        holder.CardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                
            }
        });


        //Set onclick Listener


    }

    @Override
    public int getItemCount() {

        return mData.size();

    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {

        TextView MovieTitle;
        ImageView MovieThumbnail;
        CardView CardView;

        public MyViewHolder(View itemView) {
            super(itemView);

            MovieTitle = (TextView) itemView.findViewById(R.id.Movie_Name_id);
            MovieThumbnail = (ImageView) itemView.findViewById(R.id.Movie_Poster_id);
            CardView = (CardView) itemView.findViewById(R.id.CardView_id);

        }
    }
}
