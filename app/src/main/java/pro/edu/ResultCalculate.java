package pro.edu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class ResultCalculate extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result_calculate);

        Intent intent = getIntent();
        Bundle bundle = intent.getBundleExtra("data");

        int result = bundle.getInt("eResult");

        TextView textView = findViewById(R.id.tvResult);
        textView.setText("Số điện tiêu thụ trong tháng là: " + result);
    }
}