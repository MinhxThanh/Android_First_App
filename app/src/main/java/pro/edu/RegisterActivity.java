package pro.edu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("data");
        String name = bundle.getString("name");

        Toast.makeText(this, "You name: " + name, Toast.LENGTH_LONG).show();
    }
}