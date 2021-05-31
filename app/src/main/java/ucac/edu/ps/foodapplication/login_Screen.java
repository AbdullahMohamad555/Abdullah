package ucac.edu.ps.foodapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class login_Screen extends AppCompatActivity {
    Button btn_login;
    TextView tv_forgotPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_screen);

        btn_login = findViewById(R.id.btn_login);
        tv_forgotPassword = findViewById(R.id.tv_login_forgotPass);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), TabedActivity.class);
                startActivity(intent);
            }
        });

        tv_forgotPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), forgotPassword.class);
                startActivity(intent);
            }
        });


    }
}