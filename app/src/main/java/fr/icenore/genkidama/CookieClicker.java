package fr.icenore.genkidama;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class CookieClicker extends AppCompatActivity {

    private TextView points;
    private ImageView cookie;
    public static int Click = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cookie_clicker);

        this.points = (TextView) findViewById(R.id.points);
        points.setText("Points : " + Click);
        this.cookie = (ImageView) findViewById(R.id.cookie);

        cookie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Click++;
                points.setText("Points : " + Click);
            }
        });
    }
}