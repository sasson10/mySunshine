package com.example.jitoledo.sunshine;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    ArrayAdapter<String> mForecastAdapter;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Create some dummy data for the ListView. Here's a sample weekly forecast
        String[] data = {
                "Mon 6/23 - Sunny - 31/17",
                "Tue 6/24 - Foggy - 21/8",
                "Wed 6/25 - Cloudy - 22/17",
                "Thurs 6/26 - Rainy - 18/11",
                "Fri 6/27 - Foggy - 21/10",
                "Sat 6/28 - TRAPPED IN WEATHERSTATION - 23/18",
                "Sun 6/29 - Sunny - 20/7",
        };
        List<String> weekForecast = new ArrayList<String>(Arrays.asList(data));

        mForecastAdapter = new ArrayAdapter<String>(
          getActivity(),// the current context (this activity)
          R.layout.list_item_forecast,//the name of the layout ID
          R.id.list_item_forecast_textview,// the ID of the textview to populate.
          weekForecast);

        View rootView = inflater.inflate(R.layout.fragment_main, container ,false);
        //get a referencia to the listview , and attach this adapter to it.
        ListView listView = (ListView)rootView.findViewById (R.id.listview_forecast);
        listView.setAdapter(mForecastAdapter);
        //return inflater.inflate(R.layout.fragment_main, container, false);
        return rootView;
    }
}
