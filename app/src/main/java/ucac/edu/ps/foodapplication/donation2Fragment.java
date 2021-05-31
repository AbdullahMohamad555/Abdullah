package ucac.edu.ps.foodapplication;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class donation2Fragment extends Fragment {

    adapterRecyclerViewDonation2_F adapter;
    RecyclerView recyclerView;
    private static final String ARG_ID = "id";
    private static final String ARG_NAME = "name";

    private int id;
    private String name;

    public donation2Fragment() {
        // Required empty public constructor
    }

    // TODO: Rename and change types and number of parameters
    public static donation2Fragment newInstance(int id, String name) {
        donation2Fragment fragment = new donation2Fragment();
        Bundle args = new Bundle();
        args.putInt(ARG_ID, id);
        args.putString(ARG_NAME, name);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            id = getArguments().getInt(ARG_ID);
            name = getArguments().getString(ARG_NAME);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ArrayList<Images> images = new ArrayList<>();
        images.add(new Images(1,R.drawable.student));
        images.add(new Images(2,R.drawable.water));
        images.add(new Images(3,R.drawable.family));
        images.add(new Images(4,R.drawable.midicine));
        images.add(new Images(5,R.drawable.food));
        images.add(new Images(6,R.drawable.hospital));
        images.add(new Images(7,R.drawable.with_special_needs));

        View v= inflater.inflate(R.layout.fragment_donation2, container, false);
        recyclerView = v.findViewById(R.id.recycle_view_dona_2);
        adapter = new adapterRecyclerViewDonation2_F(getContext(), images, new OnRecyclerViewItemClickListener() {
            @Override
            public void onItemClick(int id) {
                switch (id){
                    case 1:
                        Intent intent = new Intent(getContext(),Student.class);
                        startActivity(intent);
                        break;
                        

                }
            }
        });

        recyclerView.setAdapter(adapter);
        RecyclerView.LayoutManager lm = new GridLayoutManager(getContext(),2);
        recyclerView.setLayoutManager(lm);
        recyclerView.setHasFixedSize(true);
        return v;
    }
}