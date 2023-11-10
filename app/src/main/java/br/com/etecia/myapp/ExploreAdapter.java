package br.com.etecia.myapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.google.android.material.card.MaterialCardView;

import java.util.List;

public class ExploreAdapter extends RecyclerView.Adapter<ExploreAdapter.ViewHolder> {

    private Context context;
    private List<Explore> lstExplore;

    public ExploreAdapter(Context context, List<Explore> lstExplore) {
        this.context = context;
        this.lstExplore = lstExplore;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        LayoutInflater inflater = LayoutInflater.from(context);
        view = inflater.inflate(R.layout.modelo_explore, parent, false);

        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.nome.setText(lstExplore.get(position).getNome());
        holder.latitude.setText(lstExplore.get(position).getLatitude());
        holder.longitude.setText(lstExplore.get(position).getLogitude());
    }

    @Override
    public int getItemCount() {
        return lstExplore.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        MaterialCardView cardExplore;
        TextView nome, latitude, longitude;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            nome = itemView.findViewById(R.id.txtModeloNome);
            latitude = itemView.findViewById(R.id.txtModeloLatitude);
            longitude = itemView.findViewById(R.id.txtModeloLongitude);
            cardExplore = itemView.findViewById(R.id.cardExplore);

        }
    }
}
