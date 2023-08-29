package pro.edu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static final String TAG = "MainActivity";
    private TextView textViewHello;

    @Override
    protected void onStart() {
        super.onStart();
        Log.i(TAG, "onStart: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i(TAG, "onStop: ");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i(TAG, "onDestroy: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i(TAG, "onPause: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i(TAG, "onResume: ");
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Log.i(TAG, "onBackPressed: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i(TAG, "onRestart: ");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textViewHello = findViewById(R.id.textViewHello);
        textViewHello.setText("Hello new code!");
    }

    public void btnRegister_OnClick(View view) {
        Intent intent = new Intent(this, RegisterActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("name", "we are my");
        intent.putExtra("data", bundle);
        startActivity(intent);
    }

    public void btnOpenElnvoiceApp_OnClick(View view) {
        Intent intent = new Intent(this, ElnvoiceApp.class);
        startActivity(intent);
    }
}