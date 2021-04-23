package android.example.tourguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

public class NightLifeFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_list, container, false);

        ListView listView= (ListView) rootView.findViewById(R.id.list);

        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.space), R.drawable.sapce, (float) 4.1, getString(R.string.lorem)));
        places.add(new Place(getString(R.string.pacha), R.drawable.pacha, (float) 4.2, getString(R.string.lorem)));
        places.add(new Place(getString(R.string.pangaea), R.drawable.pangaea, (float) 3.8, getString(R.string.lorem)));
        places.add(new Place(getString(R.string.casino), R.drawable.sinai_grande_casino, (float) 4.0, getString(R.string.lorem)));
        places.add(new Place(getString(R.string.hard_rock), R.drawable.hard_rock, (float) 4.1, getString(R.string.lorem)));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(),places);
        listView.setAdapter(adapter);

        return rootView;
    }
}