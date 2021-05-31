package ucac.edu.ps.foodapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class adapterRecyclerViewDonation2_F extends RecyclerView.Adapter<adapterRecyclerViewDonation2_F.PersonViewHolder> {

    Context context;
    ArrayList<Integer> image;
    OnRecyclerViewItemClickListener listener;

    public adapterRecyclerViewDonation2_F(Context context, ArrayList image ,OnRecyclerViewItemClickListener listener) {
        this.context = context;
        this.image = image;
        this.listener = listener;

    }

    @NonNull
    @Override
    public PersonViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custum_rv_donation2,parent,false);
        PersonViewHolder viewHolder = new PersonViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull PersonViewHolder holder, int position) {
       Integer i = image.get(position);
       holder.imageView.setImageResource(i);
    }

    @Override
    public int getItemCount() {
        return image.size();
    }

    class PersonViewHolder extends RecyclerView.ViewHolder {

        ImageView imageView;
        int id;

        public PersonViewHolder(@NonNull View itemView) {
            super(itemView);

            imageView = itemView.findViewById(R.id.custom_dona2_iv);

            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(id);
                }
            });

        }
    }

}


