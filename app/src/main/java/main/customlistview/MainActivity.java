package main.customlistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<DataItem> lstData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lstData = new ArrayList<>();

        lstData.add(new DataItem(R.drawable.india_flag, "India"));
        lstData.add(new DataItem(R.drawable.brazil_flag, "Brazil"));
        lstData.add(new DataItem(R.drawable.france_flags, "France"));
        lstData.add(new DataItem(R.drawable.germany_flag, "Germany"));
        lstData.add(new DataItem(R.drawable.iran_flag, "Iran"));
        lstData.add(new DataItem(R.drawable.iraq_flag, "Iran"));
        lstData.add(new DataItem(R.drawable.israel_flag, "Israel"));
        lstData.add(new DataItem(R.drawable.italy_flag, "Italy"));
        lstData.add(new DataItem(R.drawable.malaysia_flag, "Malaysia"));
        lstData.add(new DataItem(R.drawable.netherlands_flag, "Netherlands"));
        lstData.add(new DataItem(R.drawable.romania_flag, "Romania"));
        lstData.add(new DataItem(R.drawable.russia_flag, "Russia"));
        lstData.add(new DataItem(R.drawable.spain_flag, "Spain"));
        lstData.add(new DataItem(R.drawable.turkey_flag, "Turkey"));
        lstData.add(new DataItem(R.drawable.ukraine_flag, "Ukraine"));
        lstData.add(new DataItem(R.drawable.usa_flags, "USA"));
        lstData.add(new DataItem(R.drawable.uzbekistan_flag, "Uzbekistan"));

        ListView listView = (ListView) findViewById(R.id.listView);

        CustomAdapter adapter = new CustomAdapter(this, R.layout.itemrow, lstData);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent();
                intent.putExtra("Country", lstData.get(i).countryName);
                intent.putExtra("Flag", lstData.get(i).resIdThumbnail);
                intent.setClass(MainActivity.this, CountryActivity.class);
                startActivity(intent);
            }
        });
    }
}
