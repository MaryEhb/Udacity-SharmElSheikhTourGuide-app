package android.example.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class RestaurantsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_list, container, false);

        ListView listView= (ListView) rootView.findViewById(R.id.list);

        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.fares), R.drawable.fares, (float) 4.4, getString(R.string.fares_des)));
        places.add(new Place(getString(R.string.sushi), R.drawable.sushi, (float) 4.5, getString(R.string.sushi_des)));
        places.add(new Place(getString(R.string.mac), R.drawable.mcdonalds, (float) 4.0, getString(R.string.mac_des)));
        places.add(new Place(getString(R.string.enab), R.drawable.enab, (float) 4.8, getString(R.string.enab_des)));
        places.add(new Place(getString(R.string.melodies), R.drawable.melodi, (float) 4.3, getString(R.string.melodies_des)));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(),places);
        listView.setAdapter(adapter);

        return rootView;
    }
}