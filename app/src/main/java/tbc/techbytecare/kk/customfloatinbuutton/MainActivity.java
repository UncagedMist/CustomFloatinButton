package tbc.techbytecare.kk.customfloatinbuutton;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.github.clans.fab.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton fabPerson,fabExplore,fabExit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fabExit = findViewById(R.id.fabExit);
        fabExplore = findViewById(R.id.fabExplore);
        fabPerson = findViewById(R.id.fabPerson);

        fabPerson.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You Selected FabPerson!!!", Toast.LENGTH_SHORT).show();
            }
        });

        fabExplore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You Selected FabExplore!!!", Toast.LENGTH_SHORT).show();
            }
        });

        fabExit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "You Selected FabExit!!!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
