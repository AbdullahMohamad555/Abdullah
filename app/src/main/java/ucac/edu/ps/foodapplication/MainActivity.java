package ucac.edu.ps.foodapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Intent intent;
    private Button btn_login, btn_create, btn_facebook, but_google;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn_login = findViewById(R.id.btn_login);
        but_google = findViewById(R.id.btn_google);
        btn_create = findViewById(R.id.btn_createAccount);

        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(getApplicationContext(), login_Screen.class);
                startActivity(intent);
            }
        });
        btn_create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(getApplicationContext(), CreateAccount_Screen.class);
                startActivity(intent);
            }
        });


    }

}