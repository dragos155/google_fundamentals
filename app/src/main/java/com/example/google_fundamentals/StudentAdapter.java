package com.example.google_fundamentals;

import android.graphics.Color;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class StudentAdapter extends RecyclerView.Adapter<StudentViewHolder> {
    private final List<Student> students;

    public StudentAdapter(List<Student> students) {
        this.students = students;
    }
    @Override
    public int getItemCount() { return students.size(); }

    @NonNull
    @Override
    public StudentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= View.inflate(parent.getContext(),R.layout.student_row,null);
        return new StudentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull StudentViewHolder holder, int position) {
        Student student=students.get(position);
        holder.getFirstNameText().setText("First Name : "+student.getPrename());
        holder.getLastNameText().setText("Last Name : "+student.getName());

        if (position % 2 == 0) {
            holder.itemView.findViewById(R.id.item).setBackgroundColor(Color.LTGRAY);
        }

    }



}