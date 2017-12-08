package com.example.rahim.carpoolapp1;


import android.app.DatePickerDialog;
import android.app.FragmentManager;
import android.icu.util.Calendar;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;

/**
 * A simple {@link Fragment} subclass.
 */
public class SearchRide extends Fragment {
private Button btndate,btntime;
    private EditText date,time;




    public SearchRide() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragmen
        return inflater.inflate(R.layout.fragment_search_ride, container, false);

    }
    public void onViewCreated(View view, Bundle savedInstanceState) {
        btndate=(Button)getActivity().findViewById(R.id.btn_date) ;
        btntime=(Button)getActivity().findViewById(R.id.btn_time) ;
        date=(EditText)getActivity().findViewById(R.id.setdate) ;
        super.onViewCreated(view, savedInstanceState);
        btndate.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                showDatePicker();
            }
        });
        btntime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentManager fm = getActivity().getFragmentManager();
                TimePickerFragment dialog = new TimePickerFragment();
                dialog.show(fm,"TimerDailog");
            }
        });




    }
    @RequiresApi(api = Build.VERSION_CODES.N)
    private void showDatePicker() {
        DatePickerFragment date = new DatePickerFragment();
        /**
         * Set Up Current Date Into dialog
         */
        Calendar calender = Calendar.getInstance();
        Bundle args = new Bundle();
        args.putInt("year", calender.get(Calendar.YEAR));
        args.putInt("month", calender.get(Calendar.MONTH));
        args.putInt("day", calender.get(Calendar.DAY_OF_MONTH));
        date.setArguments(args);
        /**
         * Set Call back to capture selected date
         */
        date.setCallBack(ondate);
        date.show(getFragmentManager(), "Date Picker");
    }

    DatePickerDialog.OnDateSetListener ondate = new DatePickerDialog.OnDateSetListener() {

        public void onDateSet(DatePicker view, int year, int monthOfYear,
                              int dayOfMonth) {

            date.setText(String.valueOf(dayOfMonth) + "-" + String.valueOf(monthOfYear+1)
                                     + "-" + String.valueOf(year));
        }
    };




}




