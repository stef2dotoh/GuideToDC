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
public class EatFragment extends Fragment {


    public EatFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate view from place_list.xml
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create list of places
        ArrayList<Place> places = new ArrayList<>();

        places.add(new Place(R.drawable.eat1, R.string.eat1_name,
                R.string.eat1_address, R.string.eat1_telephone, R.string.eat1_web));
        places.add(new Place(R.drawable.eat2, R.string.eat2_name,
                R.string.eat2_address, R.string.eat2_telephone, R.string.eat2_web));
        places.add(new Place(R.drawable.eat3, R.string.eat3_name,
                R.string.eat3_address, R.string.eat3_telephone, R.string.eat3_web));
        places.add(new Place(R.drawable.eat4, R.string.eat4_name,
                R.string.eat4_address, R.string.eat4_telephone, R.string.eat4_web));
        places.add(new Place(R.drawable.eat5, R.string.eat5_name,
                R.string.eat5_address, R.string.eat5_telephone, R.string.eat5_web));
        places.add(new Place(R.drawable.eat6, R.string.eat6_name,
                R.string.eat6_address, R.string.eat6_telephone, R.string.eat6_web));
        places.add(new Place(R.drawable.eat7, R.string.eat7_name,
                R.string.eat7_address, R.string.eat7_telephone, R.string.eat7_web));
        places.add(new Place(R.drawable.eat8, R.string.eat8_name,
                R.string.eat8_address, R.string.eat8_telephone, R.string.eat8_web));


        // Instantiate a {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to create list items for each item in the list.

        PlaceAdapter adapter = new PlaceAdapter (getActivity(), places);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared
        // in the place_list.xml layout file.
        ListView listView = rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PlaceAdapter} we created above, so that the
        // {@link ListView} will display list items for each {@link Place} in the list.
        listView.setAdapter(adapter);

        // Return inflated view
        return rootView;
    }
}
