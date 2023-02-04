package com.example.turistiando;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Hotels extends AppCompatActivity {

    //ATRIBUTOS
    ArrayList<Hotel> list = new ArrayList<>();
    RecyclerView logicalList;

    //METODOS
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);

        logicalList = findViewById(R.id.recycler);
        logicalList.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));

        createHotelList();
        Adapter adapter = new Adapter(list);
        logicalList.setAdapter(adapter);

    }

    public void createHotelList(){

        list.add(new Hotel(R.drawable.hotel1, "Hotel 1", "$150000", ""));
        list.add(new Hotel(R.drawable.hotel2, "Hotel 2", "$150000", ""));
        list.add(new Hotel(R.drawable.hotel3, "Hotel 3", "$150000", ""));
        list.add(new Hotel(R.drawable.hotel4, "Hotel 4", "$150000", ""));


    }







    //Last Key
}