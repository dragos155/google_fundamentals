package com.example.google_fundamentals;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Student> students =getStudents();
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        StudentAdapter adapter = new StudentAdapter(students);
        RecyclerView recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
    private List<Student> getStudents() {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("1", "1"));
        students.add(new Student("2", "2"));
        students.add(new Student("3", "3"));
        students.add(new Student("4", "4"));
        students.add(new Student("5", "5"));
        students.add(new Student("6", "6"));
        students.add(new Student("7", "7"));
        students.add(new Student("8", "8"));
        students.add(new Student("9", "9"));
        students.add(new Student("10", "10"));
        return students;
    }
}



