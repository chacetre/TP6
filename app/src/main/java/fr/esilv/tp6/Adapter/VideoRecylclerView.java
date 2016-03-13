package fr.esilv.tp6.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import fr.esilv.tp6.Model.VideoInfo;
import fr.esilv.tp6.R;
import fr.esilv.tp6.Model.YoutubeVideo;

/**
 * Created by Charlotte on 26/02/2016.
 */
public class VideoRecylclerView extends RecyclerView.Adapter<VideoRecylclerView.ViewHolder>  {

        public List<YoutubeVideo> list;
        private Context context;

        public VideoRecylclerView(List<YoutubeVideo> list,Context context ) {
                this.list = list;
                this.context = context;
        }

        @Override
        public VideoRecylclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
                View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_main, parent, false);
                return new ViewHolder(v);
        }
        @Override
        public void onBindViewHolder(ViewHolder holder, int position) {
                //YoutubeVideo item = list.get(position);
                holder.text.setText(list.get(position).snippet.title);

        }
        @Override
        public int getItemCount() {return 0;}


        public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
                public TextView text;

                public ViewHolder(View itemView) {
                        super(itemView);

                        text = (TextView) itemView.findViewById(R.id.titre_text);
                        itemView.setOnClickListener(this); // permet de clicker sur les views
                }

                @Override
                public void onClick(View v) {
                        Intent i = new Intent(v.getContext(), VideoInfo.class);
                       // i.putExtra("video",list.get(getAdapterPosition()));
                        v.getContext().startActivity(i);
                }
        }
}