package com.example.android.guidetodc;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 */
public class SeeFragment extends Fragment {


    public SeeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate view from place_list.xml
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create list of places
        ArrayList<Place> places = new ArrayList<>();

        places.add(new Place(R.drawable.see1, R.string.see1_name,
                R.string.see1_address, R.string.see1_telephone, R.string.see1_web));
        places.add(new Place(R.drawable.see2, R.string.see2_name,
                R.string.see2_address, R.string.see2_telephone, R.string.see2_web));
        places.add(new Place(R.drawable.see3, R.string.see3_name,
                R.string.see3_address, R.string.see3_telephone, R.string.see3_web));
        places.add(new Place(R.drawable.see4, R.string.see4_name,
                R.string.see4_address, R.string.see4_telephone, R.string.see4_web));
        places.add(new Place(R.drawable.see5, R.string.see5_name,
                R.string.see5_address, R.string.see5_telephone, R.string.see5_web));
        places.add(new Place(R.drawable.see6, R.string.see6_name,
                R.string.see6_address, R.string.see6_telephone, R.string.see6_web));
        places.add(new Place(R.drawable.see7, R.string.see7_name,
                R.string.see7_address, R.string.see7_telephone, R.string.see7_web));
        places.add(new Place(R.drawable.see8, R.string.see8_name,
                R.string.see8_address, R.string.see8_telephone, R.string.see8_web));


        // Instantiate a {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.

        PlaceAdapter adapter = new PlaceAdapter (getActivity(), places);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared
        // in the place_list xml layout file.
        ListView listView = rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PlaceAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Place} in the list.
        listView.setAdapter(adapter);

        // Return inflated view
        return rootView;
    }

}
