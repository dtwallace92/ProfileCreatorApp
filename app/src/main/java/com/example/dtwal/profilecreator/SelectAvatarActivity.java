package com.example.dtwal.profilecreator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class SelectAvatarActivity extends AppCompatActivity {

    ImageButton F1;
    ImageView avatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_avatar);

        F1 = (ImageButton) findViewById(R.id.F1);
        avatar = (ImageView) findViewById(R.id.AvatarImage);

        F1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                avatar.setImageResource(R.drawable.avatar_f_1);
                Intent intent2 = new Intent(SelectAvatarActivity.this, MainActivity.class);
            }
        });
    }
}
