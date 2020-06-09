package com.hashtech360.hashtech360;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.DatePickerDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.text.InputType;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;


public class PopupActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    private Button btnBook;
    private  TextView btnClose;
    private AutoCompleteTextView services;
    private String selection;
    private EditText date;
    DatePickerDialog picker;
    private FirebaseAuth auth;
    //private int mYear;
    //private int mMonth;
    //private int mDay;
    private String current_date;
    private String current_service;
    int appointment_no;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_popup);

        auth = FirebaseAuth.getInstance();

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width = dm.widthPixels;
        int height = dm.heightPixels;
        getWindow().setLayout((int) (width * .9), (int) (height * .8));

        FirebaseDatabase database = FirebaseDatabase.getInstance();
        final DatabaseReference mRef = database.getReference("appointments");

        date = findViewById(R.id.mDate);
        date.setInputType(InputType.TYPE_NULL);
        date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar calendar = Calendar.getInstance();
                int day = calendar.get(Calendar.DAY_OF_MONTH);
                int month = calendar.get(Calendar.MONTH);
                int year = calendar.get(Calendar.YEAR);
                // date picker dialog
                picker = new DatePickerDialog(PopupActivity.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                                date.setText(dayOfMonth + "/" + (monthOfYear + 1) + "/" + year);
                                current_date = (dayOfMonth+"/"+(monthOfYear +1)+"/"+ year);
                            }
                        }, year, month, day);
                picker.show();
            }
        });

        btnBook = findViewById(R.id.btn_book);
        btnBook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (TextUtils.isEmpty(current_service)) {
                    Toast.makeText(getApplicationContext(), "Enter a service!", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (TextUtils.isEmpty(current_date)) {
                    Toast.makeText(getApplicationContext(), "Enter a date!", Toast.LENGTH_SHORT).show();
                    return;
                }

                String user_id = auth.getCurrentUser().getUid();

                DatabaseReference current_user_db = FirebaseDatabase.getInstance().getReference()
                        .child("Appointments").child(user_id);
                Map newPost = new HashMap();
                newPost.put("Service", current_service);
                //current_user_db.push().setValue(newPost);
                newPost.put("Date", current_date);
                current_user_db.push().setValue(newPost);
                Toast.makeText(PopupActivity.this, "Appointment booked!", Toast.LENGTH_SHORT).show();
                finish();
                //https://stackoverflow.com/questions/47252076/notify-user-when-a-date-is-near
            }
        });
        btnClose = findViewById(R.id.btn_close);
        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        services = findViewById(R.id.services);
        final ArrayAdapter<String> arrayAdapter = new ArrayAdapter<>(
                this, android.R.layout.simple_list_item_1, getResources()
                .getStringArray(R.array.services_spinner));

        services.setAdapter(arrayAdapter);
        services.setCursorVisible(false);
        services.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                services.showDropDown();
                selection = (String) parent.getItemAtPosition(position);
                Toast.makeText(getApplicationContext(), selection, Toast.LENGTH_SHORT);
                current_service = selection;
            }
        });

        services.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View arg0) {
                services.showDropDown();
            }
        });

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
}
