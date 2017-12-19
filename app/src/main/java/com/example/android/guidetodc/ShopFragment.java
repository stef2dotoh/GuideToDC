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
public class ShopFragment extends Fragment {


    public ShopFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate view from place_list.xml
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create list of places
        ArrayList<Place> places = new ArrayList<>();

        places.add(new Place(R.drawable.shop1, R.string.shop1_name,
                R.string.shop1_address, R.string.shop1_telephone, R.string.shop1_web));
        places.add(new Place(R.drawable.shop2, R.string.shop2_name,
                R.string.shop2_address, R.string.shop2_telephone, R.string.shop2_web));
        places.add(new Place(R.drawable.shop3, R.string.shop3_name,
                R.string.shop3_address, R.string.shop3_telephone, R.string.shop3_web));
        places.add(new Place(R.drawable.shop4, R.string.shop4_name,
                R.string.shop4_address, R.string.shop4_telephone, R.string.shop4_web));
        places.add(new Place(R.drawable.shop5, R.string.shop5_name,
                R.string.shop5_address, R.string.shop5_telephone, R.string.shop5_web));
        places.add(new Place(R.drawable.shop6, R.string.shop6_name,
                R.string.shop6_address, R.string.shop6_telephone, R.string.shop6_web));
        places.add(new Place(R.drawable.shop7, R.string.shop7_name,
                R.string.shop7_address, R.string.shop7_telephone, R.string.shop7_web));
        places.add(new Place(R.drawable.shop8, R.string.shop8_name,
                R.string.shop8_address, R.string.shop8_telephone, R.string.shop8_web));


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
