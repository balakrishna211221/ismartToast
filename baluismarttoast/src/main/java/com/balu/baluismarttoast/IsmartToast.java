package com.balu.baluismarttoast;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.cardview.widget.CardView;

public class IsmartToast {
    TextView textView;
    Context context;
    ImageView imageView;
    CardView cardView;

    void setIsmartToast(Activity mActivity , String message, Boolean Showimage, int textcolor, int Toastbackgroundcolor, Drawable image)
    {

        LayoutInflater mInflater = /*(LayoutInflater)
                mActivity.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);*/mActivity.getLayoutInflater();

        View contentView = mInflater.inflate(R.layout.customtoast, null, false);

        textView = (TextView) contentView.findViewById(R.id.toast);
        imageView = contentView.findViewById(R.id.image);
        cardView=contentView.findViewById(R.id.card);

        textView.setText(message);

        if(Showimage==true){
            textView.setText(message);
            textView.setTextColor(textcolor);
            cardView.setCardBackgroundColor(Toastbackgroundcolor);
            imageView.setImageDrawable(image);
            Toast toast = new Toast(mActivity);
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.BOTTOM,0, 0);
            toast.setMargin(0, 0.1f);
            toast.setView(contentView);//setting the view of custom toast layout
            toast.show();


        }
        else {
            textView.setText(message);
            textView.setTextColor(textcolor);
            cardView.setCardBackgroundColor(Toastbackgroundcolor);
            imageView.setVisibility(View.GONE);
            Toast toast = new Toast(mActivity);
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setGravity(Gravity.BOTTOM,0, 0);
            toast.setMargin(0, 0.1f);
            toast.setView(contentView);//setting the view of custom toast layout
            toast.show();
        }


    }
}
