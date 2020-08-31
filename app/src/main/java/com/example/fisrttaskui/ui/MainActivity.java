package com.example.fisrttaskui.ui;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.example.fisrttaskui.R;
import com.example.fisrttaskui.adapter.RecycleAdapter;
import com.example.fisrttaskui.model.PropertiesHome;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView rcHottestProperties,rcPropertiesForRent;
    RecycleAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
setUp();
    }

    @SuppressLint("WrongConstant")
    private void setUp() {
        rcHottestProperties=findViewById(R.id.recyclerView_HottestProperties);
        rcPropertiesForRent=findViewById(R.id.recyclerView_PropertiesforRent);

        rcHottestProperties.setLayoutManager(new LinearLayoutManager(this,
                LinearLayout.HORIZONTAL,false));
        rcPropertiesForRent.setLayoutManager(new LinearLayoutManager(this,
                LinearLayout.HORIZONTAL,false));
        adapter=new RecycleAdapter(this);
        adapter.setList(hottestPropertiesArray());
        rcHottestProperties.setAdapter(adapter);

        adapter=new RecycleAdapter(this);
        adapter.setList(propertiesForRentArray());
        rcPropertiesForRent.setAdapter(adapter);

    }


    private ArrayList<PropertiesHome> hottestPropertiesArray()
    {
        ArrayList<PropertiesHome> m=new ArrayList<>();

        PropertiesHome p1=new PropertiesHome();
        p1.setName("Kandis Residence");
        p1.setPlace("2-10 Kandis Link - D27");
        p1.setPrice("$8,654 PSF");
        p1.setImage(R.drawable.qwe1);
        m.add (p1);

        p1.setName("Kandis Residence");
        p1.setPlace("2-10 Kandis Link - D27");
        p1.setPrice("$8,654 PSF");
        p1.setImage(R.drawable.qwe2);
        m.add (p1);

        p1.setName("Kandis Residence");
        p1.setPlace("2-10 Kandis Link - D27");
        p1.setPrice("$8,654 PSF");
        p1.setImage(R.drawable.qwe3);
        m.add (p1);

        p1.setName("Kandis Residence");
        p1.setPlace("2-10 Kandis Link - D27");
        p1.setPrice("$8,654 PSF");
        p1.setImage(R.drawable.qwe4);
        m.add (p1);

        p1.setName("Kandis Residence");
        p1.setPlace("2-10 Kandis Link - D27");
        p1.setPrice("$8,654 PSF");
        p1.setImage(R.drawable.qwe5);
        m.add (p1);

        return m;

    }


    private ArrayList<PropertiesHome> propertiesForRentArray()
    {
        ArrayList<PropertiesHome> m=new ArrayList<>();

        PropertiesHome p1=new PropertiesHome();
        p1.setName("North Park Residences");
        p1.setPlace("15 Yishun Central 1");
        p1.setPrice("$ 2,300 / Month");
        p1.setImage(R.drawable.qwe6);
        m.add (p1);

        p1.setName("Kandis Residence");
        p1.setPlace("2-10 Kandis Link - D27");
        p1.setPrice("$ 2,300 / Month");
        p1.setImage(R.drawable.qwe7);
        m.add (p1);

        p1.setName("Kandis Residence");
        p1.setPlace("2-10 Kandis Link - D27");
        p1.setPrice("$ 2,300 / Month");
        p1.setImage(R.drawable.qwe8);
        m.add (p1);

        p1.setName("Kandis Residence");
        p1.setPlace("2-10 Kandis Link - D27");
        p1.setPrice("$ 2,300 / Month");
        p1.setImage(R.drawable.qwe9);
        m.add (p1);

        p1.setName("Kandis Residence");
        p1.setPlace("2-10 Kandis Link - D27");
        p1.setPrice("$ 2,300 / Month");
        p1.setImage(R.drawable.qwe10);
        m.add (p1);

        return m;

    }
}