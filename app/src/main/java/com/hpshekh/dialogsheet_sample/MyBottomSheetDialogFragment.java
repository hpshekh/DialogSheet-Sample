package com.hpshekh.dialogsheet_sample;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class MyBottomSheetDialogFragment extends BottomSheetDialogFragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_sheet_dialog_fragment, container, false);

        TextView title = view.findViewById(R.id.title);
        TextView message = view.findViewById(R.id.message);
        Button positiveBtn = view.findViewById(R.id.positiveBtn);
        Button negativeBtn = view.findViewById(R.id.negativeBtn);

        if (getArguments() != null) {
            title.setText(getArguments().getString("title"));
            message.setText(getArguments().getString("message"));
            positiveBtn.setText(getArguments().getString("positive"));
            negativeBtn.setText(getArguments().getString("negative"));
        }

        positiveBtn.setOnClickListener(view1 -> {
            Toast.makeText(getContext(), positiveBtn.getText().toString(), Toast.LENGTH_SHORT).show();
            dismiss();
        });
        negativeBtn.setOnClickListener(view1 -> {
            Toast.makeText(getContext(), negativeBtn.getText().toString(), Toast.LENGTH_SHORT).show();
            dismiss();
        });

        return view;
    }
}
