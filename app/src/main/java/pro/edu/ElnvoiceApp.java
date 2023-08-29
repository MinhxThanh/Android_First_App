package pro.edu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class ElnvoiceApp extends AppCompatActivity {
    private EditText etStartElecIndex, etEndElecIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_elnvoice_app);

        etStartElecIndex = findViewById(R.id.etStartElecIndex);
        etEndElecIndex = findViewById(R.id.etEndElecIndex);
    }

    public void btnCalculate_OnClick(View view) {
        int startElecIndex = Integer.parseInt(etStartElecIndex.getText().toString());
        int endElecIndex = Integer.parseInt(etEndElecIndex.getText().toString());

        int result = endElecIndex - startElecIndex;

        Intent intent = new Intent(this, ResultCalculate.class);
        Bundle bundle = new Bundle();
        bundle.putInt("eResult", result);

        intent.putExtra("data", bundle);
        startActivity(intent);
    }
}