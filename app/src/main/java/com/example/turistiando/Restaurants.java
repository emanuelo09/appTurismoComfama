package com.example.turistiando;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Restaurants extends AppCompatActivity {

    ArrayList<Restaurant> list2 = new ArrayList<>();
    RecyclerView logicalList2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        logicalList2 = findViewById(R.id.recycler2);
        logicalList2.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));

        createRestaurantList();
        Adapter2 adaptor = new Adapter2(list2);
        logicalList2.setAdapter(adaptor);

    }

    private void createRestaurantList() {

        list2.add(new Restaurant(R.drawable.restaurant1, "Restaurant 1", "Venga pase un rato agradable", "Comida, Cafe, Lugar agradable" ));
        list2.add(new Restaurant(R.drawable.restaurant2, "Restaurant 2", "Venga pase un rato agradable", "Comida, Cafe, Lugar agradable" ));
        list2.add(new Restaurant(R.drawable.restaurant3, "Restaurant 3", "Venga pase un rato agradable", "Comida, Cafe, Lugar agradable" ));
        list2.add(new Restaurant(R.drawable.restaurant4, "Restaurant 4", "Venga pase un rato agradable", "Comida, Cafe, Lugar agradable" ));


    }
}