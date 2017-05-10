package com.wordpress.farhantanvirutshaw.abc;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by utshaw on 4/14/17.
 */

public class WordAdapter extends ArrayAdapter<Word> {

    Context context;
    private int color;

    WordAdapter(Context context, ArrayList<Word> lists,int color)
    {
        super(context , 0 , lists);
        this.context = context;
        this.color = color;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null)
        {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item,parent,false);
        }

        LinearLayout textContainer = (LinearLayout) listItemView.findViewById(R.id.text_container);
        textContainer.setBackgroundColor(ContextCompat.getColor(context, color));
        Word currentWord = getItem(position);

        TextView englishWordView = (TextView) listItemView.findViewById(R.id.english_word);
        TextView miwokWordView = (TextView) listItemView.findViewById(R.id.miwok_word);

        englishWordView.setText(currentWord.getDefaultTranslation());
        miwokWordView.setText(currentWord.getMiwokTranslation());

        ImageView listImageView = (ImageView) listItemView.findViewById(R.id.list_item_icon);

        if(currentWord.hasImage())
        {
            listImageView.setImageResource(currentWord.getImageResourceId());
            listImageView.setVisibility(View.VISIBLE);
        }
        else
        {
            listImageView.setVisibility(View.GONE);
        }

        return listItemView;


    }
}
