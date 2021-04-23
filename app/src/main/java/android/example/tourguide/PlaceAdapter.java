package android.example.tourguide;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;

public class PlaceAdapter extends ArrayAdapter<Place> {

    public PlaceAdapter(Activity context, ArrayList<Place> places) {
        super(context, 0,places);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if(listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.place_item, parent, false);
        }

        // get the current place class
        Place currentPlace = getItem(position);

        // select the heading text view and set its text
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.name);
        nameTextView.setText(currentPlace.getName());

        // select the description text view and set its text
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description);
        descriptionTextView.setText(currentPlace.getDescription());

        // select the image view and set its image resource
        ImageView image = (ImageView) listItemView.findViewById(R.id.image);
        image.setImageResource(currentPlace.getImage());

        // Select the rating bar and set its star rating
        RatingBar ratingBar = (RatingBar) listItemView.findViewById(R.id.rating);
        ratingBar.setRating(currentPlace.getStars());

        return listItemView;
    }

}
