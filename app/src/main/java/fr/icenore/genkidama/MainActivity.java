package fr.icenore.genkidama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private Button menu;
    private ImageView cookie;
    public static int easter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.menu = (Button) findViewById(R.id.menu);

        menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                android.content.Intent menuActivity = new android.content.Intent(getApplicationContext(), Menu.class);
                startActivity(menuActivity);
            }
        });

        this.cookie = (ImageView) findViewById(R.id.cookie);

        cookie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                easter++;
                if (easter == 5) {
                    android.content.Intent cookieActivity = new android.content.Intent(getApplicationContext(), CookieClicker.class);
                    startActivity(cookieActivity);
                    easter = 0;
                }
            }
        });
    }
}