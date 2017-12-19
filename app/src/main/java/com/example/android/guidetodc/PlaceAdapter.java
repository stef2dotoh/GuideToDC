package com.example.android.guidetodc;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * {@link PlaceAdapter is an {@link ArrayAdapter} that provides the layout for each item in the
 * list, which is a list of {@Place} objects
 */

public class PlaceAdapter extends ArrayAdapter<Place> {

    /**
     * Custom constructor
     * @param context The current context; used to inflate the layout file.
     * @param places A List of Place objects to display in a list
     */

    public PlaceAdapter(Activity context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    /**
     * Provides a view for an AdapterView (ListView, GridView, etc)
     * @param position AdapterView position requesting a view
     * @param convertView Recycled view to populate
     * @param container Parent ViewGroup used for inflation; holds views
     * @return The view for the position in the AdapterView
     */
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup container) {

        // Assign convertView to more descriptive variable for list item view
        View listItemView = convertView;

        // Check if the existing view is being reused, otherwise inflate the view from
        // the place_list_item.xml layout file
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.place_list_item, container, false);
        }

        // Get the {@link Place} object located at this index position in the list
        Place objectAtCurrentPosition = getItem(position);

        //Find ImageView for image_view in layout and set it to image at current position
        ((ImageView) listItemView.findViewById(R.id.place_image_view))
                .setImageResource(objectAtCurrentPosition.getImageResourceId());

        //Find TextView for name in layout and set it to name at current position
        ((TextView) listItemView.findViewById(R.id.name_text_view))
                .setText(objectAtCurrentPosition.getName());

        //Find TextView for address in layout and set it to address at current position
        ((TextView) listItemView.findViewById(R.id.address_text_view))
                .setText(objectAtCurrentPosition.getAddress());

        //Find TextView for telephone in layout and set it to telephone at current position
        ((TextView) listItemView.findViewById(R.id.telephone_text_view))
                .setText(objectAtCurrentPosition.getTelephone());

        //Find TextView for web in layout and set it to web address at current position
        ((TextView) listItemView.findViewById(R.id.web_text_view))
                .setText(objectAtCurrentPosition.getWeb());

        // Set color for list item

        // Find color resource ID maps to

        // Set background color

        // Return the whole list item layout (containing 1 ImageViews and 4 TextViews)
        // so that it can be shown in the ListView; i.e., added as child of AdapterView
        return listItemView;
    }


}
