package android.example.tourguide;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import java.util.ArrayList;

public class HotelsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_list, container, false);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place(getString(R.string.four_seasons), R.drawable.four_seasons, (float) 4.7, getString(R.string.four_seasons_des)));
        places.add(new Place(getString(R.string.savoy), R.drawable.savoy, (float) 4.6, getString(R.string.savoy_des)));
        places.add(new Place(getString(R.string.sunrise), R.drawable.sunrise_arabian_beach, 5, getString(R.string.sunrise_des)));
        places.add(new Place(getString(R.string.aqua), R.drawable.aqua, (float) 4.6, getString(R.string.aqua_des)));
        places.add(new Place(getString(R.string.delta), R.drawable.delta, (float) 4.1, getString(R.string.delta_des)));
        places.add(new Place(getString(R.string.rixos), R.drawable.rixos, (float) 4.8, getString(R.string.rixos_des)));
        places.add(new Place(getString(R.string.iberotel), R.drawable.lberotel, (float) 4.8, getString(R.string.iberotel_des)));
        places.add(new Place(getString(R.string.mercato), R.drawable.mercato, (float) 4.1, getString(R.string.mercato_des)));

        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);
        listView.setAdapter(adapter);

        return rootView;
    }
}