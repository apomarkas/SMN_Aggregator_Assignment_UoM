package com.example.smn_aggregator_assignment;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.smn_aggregator_assignment.Post;
import com.example.smn_aggregator_assignment.R;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class PostsAdapter extends ArrayAdapter<Post> {
    private Context context;
    private int resource;



    public PostsAdapter(@NonNull Context context, int resource, @NonNull ArrayList<Post> objects) {
        super(context, resource, objects);
       this.context = context;
       this.resource = resource;


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        String text = getItem(position).getPostText();
        String url = getItem(position).getUrl();
        //Image image = getItem(position).getImage();

        Post post = new Post(text,url);
        LayoutInflater inflater = LayoutInflater.from(context);
        convertView = inflater.inflate(resource,parent,false);
        TextView tvText = convertView.findViewById(R.id.postInfo);
        ImageView imView = convertView.findViewById(R.id.logo);
        //TextView urlText = convertView.findViewById(R.id.urlTextView);

        tvText.setText(text);

        imView.setImageResource(R.drawable.icon);

        //urlText.setText(url);

        return convertView;


    }
}
