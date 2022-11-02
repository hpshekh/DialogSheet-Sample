package com.hpshekh.dialogsheet_sample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button BottomSheetDialogFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomSheetDialogFragment = findViewById(R.id.BottomSheetDialogFragment);

        BottomSheetDialogFragment.setOnClickListener(view -> {
            Bundle bundle = new Bundle();
            bundle.putString("title", "Delete");
            bundle.putString("message", "Do you want to delete the file?");
            bundle.putString("positive", "Delete");
            bundle.putString("negative", "Cancel");

            MyBottomSheetDialogFragment bottomSheet = new MyBottomSheetDialogFragment();
            bottomSheet.setArguments(bundle);
            bottomSheet.show(getSupportFragmentManager(), "MyBottomSheetDialogFragment");
        });

    }
}