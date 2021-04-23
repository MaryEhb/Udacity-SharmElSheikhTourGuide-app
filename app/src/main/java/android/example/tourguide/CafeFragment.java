package android.example.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class CafeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_list, container, false);

        ListView listView= (ListView) rootView.findViewById(R.id.list);

        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.basata), R.drawable.basata1, (float) 4.1, getString(R.string.lorem)));
        places.add(new Place(getString(R.string.farsha), R.drawable.farsha2, (float) 4.6, getString(R.string.lorem)));
        places.add(new Place(getString(R.string.rayahen), R.drawable.rayahen, (float) 4.7, getString(R.string.lorem)));
        places.add(new Place(getString(R.string.sadiki), R.drawable.sadiki, (float) 4.8, getString(R.string.lorem)));
        places.add(new Place(getString(R.string.tamra), R.drawable.tamra, (float) 4.6, getString(R.string.lorem)));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(),places);
        listView.setAdapter(adapter);

        return rootView;
    }
}