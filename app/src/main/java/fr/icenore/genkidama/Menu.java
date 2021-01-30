package fr.icenore.genkidama;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Arrays;

public class Menu extends AppCompatActivity {

    public static String[] name = {""};

    private TextView list_player;
    private LinearLayout nameSupp;
    Button add_player;
    Button play;
    Button remove_player;
    Button remove_all_player;

    EditText nameInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        this.nameSupp = (LinearLayout) findViewById(R.id.nameSupp);
        ViewGroup.LayoutParams params = new ActionBar.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, 102);

        this.list_player = (TextView) findViewById(R.id.list_text);
        list_player.setText("Liste des joueurs :\n" + String.join("\n", name));
        nameInput = (EditText) findViewById(R.id.nom_joueur);
        add_player = (Button) findViewById(R.id.add_player);
        remove_player = (Button) findViewById(R.id.remove_player);
        remove_all_player = (Button) findViewById(R.id.remove_all_player);
        add_player.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (nameInput.getText().toString().length() > 2) {
                    name = Arrays.copyOf(name, name.length + 1);
                    name[name.length - 1] = nameInput.getText().toString();
                    nameInput.setText("");
                    Button croix = new Button(getApplicationContext());
                    croix.setLayoutParams(params);
                    croix.setBackgroundResource(R.drawable.croix);
                    croix.setTop(10);
                    croix.setId(name.length);
                    nameSupp.addView(croix);
                }
                list_player.setText("Liste des joueurs :\n" + String.join("\n", name));
            }
        });
        remove_player.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (name.length > 1)
                    name = Arrays.copyOf(name, name.length - 1);
                list_player.setText("Liste des joueurs :\n" + String.join("\n", name));
            }
        });
        remove_all_player.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String [] save = {""};
                name = save;
                list_player.setText("Liste des joueurs :\n" + String.join("\n", name));
            }
        });

        this.play = (Button) findViewById(R.id.play);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Game.class);
                intent.putExtra("string-array", name);
                startActivity(intent);
            }
        });
    }
    public static String [] getName() {
        return (name);
    }
}