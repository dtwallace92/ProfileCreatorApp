package com.example.dtwal.profilecreator;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText nameField;
    EditText emailField;
    Button submitButton;
    ImageView avatar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nameField = (EditText) findViewById(R.id.NameField);
        emailField = (EditText) findViewById(R.id.EmailField);
        submitButton = (Button) findViewById(R.id.submitButton);
        avatar = (ImageView) findViewById(R.id.AvatarImage);

        //Submit button on click
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                validateText();
            }
        });

        avatar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SelectAvatarActivity.class);
                //startActivityForResult(intent);
            }
        });

    }

    public void validateText() {
        if (nameField.getText().toString().trim().length() == 0) {
            //nameField.setError("Name field cannot be left blank");
            Toast.makeText(this, "Name field cannot be blank", Toast.LENGTH_LONG).show();
        }

        if (isValidEmail(emailField.getText().toString()) == false)
            Toast.makeText(this, "Invalid email", Toast.LENGTH_SHORT).show();

    }

    public final static Boolean isValidEmail(CharSequence target) {
        if (target == null)
            return false;

        return Patterns.EMAIL_ADDRESS.matcher(target).matches();
    }

}
