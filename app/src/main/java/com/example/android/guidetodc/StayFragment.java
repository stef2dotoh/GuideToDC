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
public class StayFragment extends Fragment {


    public StayFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate view from place_list.xml
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        // Create list of places
        ArrayList<Place> places = new ArrayList<>();

        places.add(new Place(R.drawable.stay1, R.string.stay1_name,
                R.string.stay1_address, R.string.stay1_telephone, R.string.stay1_web));
        places.add(new Place(R.drawable.stay2, R.string.stay2_name,
                R.string.stay2_address, R.string.stay2_telephone, R.string.stay2_web));
        places.add(new Place(R.drawable.stay3, R.string.stay3_name,
                R.string.stay3_address, R.string.stay3_telephone, R.string.stay3_web));
        places.add(new Place(R.drawable.stay4, R.string.stay4_name,
                R.string.stay4_address, R.string.stay4_telephone, R.string.stay4_web));
        places.add(new Place(R.drawable.stay5, R.string.stay5_name,
                R.string.stay5_address, R.string.stay5_telephone, R.string.stay5_web));
        places.add(new Place(R.drawable.stay6, R.string.stay6_name,
                R.string.stay6_address, R.string.stay6_telephone, R.string.stay6_web));
        places.add(new Place(R.drawable.stay7, R.string.stay7_name,
                R.string.stay7_address, R.string.stay7_telephone, R.string.stay7_web));
        places.add(new Place(R.drawable.stay8, R.string.stay8_name,
                R.string.stay8_address, R.string.stay8_telephone, R.string.stay8_web));


        // Instantiate a {@link PlaceAdapter}, whose data source is a list of {@link Place}s. The
        // adapter knows how to crstaye list items for each item in the list.

        PlaceAdapter adapter = new PlaceAdapter (getActivity(), places);

        // Find the {@link ListView} object in the view hierarchy of the {@link Activity}.
        // There should be a {@link ListView} with the view ID called list, which is declared
        // in the activity_stay.xml layout file.
        ListView listView = rootView.findViewById(R.id.list);

        // Make the {@link ListView} use the {@link PlaceAdapter} we crstayed above, so that the
        // {@link ListView} will display list items for each {@link Place} in the list.
        listView.setAdapter(adapter);

        // Return inflated view
        return rootView;
    }

}
