package com.sih.sihshoplistmodule;

import android.app.Dialog;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class RatingActivity extends AppCompatActivity {


    Dialog dialog;
    Button ratingsubmit;
    Button done;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rating);

        dialog=new Dialog(this);

                dialog.setContentView(R.layout.dialog_sucussfull);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();





    }


}
