package com.example.google_fundamentals;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


public class StudentViewHolder extends RecyclerView.ViewHolder {
    private final TextView firstNameText;
    private final TextView lastNameText;


    public StudentViewHolder(@NonNull View itemView) {
        super(itemView);
        lastNameText = itemView.findViewById(R.id.lastName);
        firstNameText = itemView.findViewById(R.id.firstName);
    }

    public TextView getFirstNameText() {
        return firstNameText;
    }

    public TextView getLastNameText() {
        return lastNameText;
    }
}
