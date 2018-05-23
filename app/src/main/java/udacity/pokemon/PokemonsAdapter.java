package udacity.pokemon;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class PokemonsAdapter extends RecyclerView.Adapter<PokemonsAdapter.MyViewHolder> {

    private Context mContext;
    private List<Pokemon> mPokemonList;

    public PokemonsAdapter(Context context, List<Pokemon> pokemonsList) {
        this.mContext = context;
        this.mPokemonList = pokemonsList;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView nameView, idView, candyView;
        public ImageView imageView;

        public MyViewHolder(View view) {
            super(view);
            nameView = view.findViewById(R.id.name);
            idView = view.findViewById(R.id.id);
            candyView = view.findViewById(R.id.candy);
            imageView = view.findViewById(R.id.image);
        }
    }

    @Override
    public PokemonsAdapter.MyViewHolder onCreateViewHolder( ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder( PokemonsAdapter.MyViewHolder holder, int position) {

        Pokemon pokemon = mPokemonList.get(position);
        holder.nameView.setText(pokemon.getmName());
        holder.idView.setText(pokemon.getmId());
        holder.candyView.setText(pokemon.getmCandy());
        holder.imageView.setImageBitmap(pokemon.getmImage());

    }

    @Override
    public int getItemCount() {
        return mPokemonList.size();
    }
}
