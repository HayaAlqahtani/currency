package com.joincoded.currencies;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.joincoded.currencies.adapter.currencyadapt;
import com.joincoded.currencies.data.Dataclass;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView currencyRecyclerView;

    ArrayList<Dataclass> currencys = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        currencyRecyclerView = findViewById(R.id.currencyRecyclerView);
        currencyRecyclerView.setLayoutManager(new LinearLayoutManager(this));
        currencyadapt adaptcurrency = new currencyadapt(currencys);
        currencyRecyclerView.setAdapter(adaptcurrency);
        addcurrency();
    }

    private void addcurrency() {
        currencys.add(new Dataclass("US Dollar:","USD",0.31));
        currencys.add(new Dataclass("Great British pound","GBP",0.256));
        currencys.add(new Dataclass("united arab emirates","AED",0.11));
    }


}