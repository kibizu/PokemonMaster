package udacity.pokemon;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
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
        String type = pokemon.getmType();

        // Set the proper background color on the magnitude circle.
        // Fetch the background from the TextView, which is a GradientDrawable.
        GradientDrawable typeRectangle = (GradientDrawable) holder.nameView.getBackground();
        // Get the appropriate background color based on the current earthquake magnitude
        int typeColor = getTypeColor(type);
        // Set the color on the magnitude circle
        typeRectangle.setColor(typeColor);

        holder.idView.setText(pokemon.getmId());
        holder.candyView.setText(pokemon.getmCandy());
        holder.imageView.setImageBitmap(pokemon.getmImage());

    }

    @Override
    public int getItemCount() {
        return mPokemonList.size();
    }

    private int getTypeColor(String type){

        int typeColorResourceId;

        switch (type){
            case "Grass":
                typeColorResourceId = R.color.grass;
                break;
            case "Fire":
                typeColorResourceId = R.color.fire;
                break;
            case "Water":
                typeColorResourceId = R.color.water;
                break;
            case "Bug":
                typeColorResourceId = R.color.bug;
                break;
            case "Poison":
                typeColorResourceId = R.color.poison;
                break;
            case "Electric":
                typeColorResourceId = R.color.electric;
                break;
            case "Ground":
                typeColorResourceId = R.color.ground;
                break;
            case "Fighting":
                typeColorResourceId = R.color.fighting;
                break;
            case "Psychic":
                typeColorResourceId = R.color.psychic;
                break;
            case "Rock":
                typeColorResourceId = R.color.rock;
                break;
            case "Ghost":
                typeColorResourceId = R.color.ghost;
                break;
            case "Ice":
                typeColorResourceId = R.color.ice;
                break;
            case "Dragon":
                typeColorResourceId = R.color.dragon;
                break;
            default:
                typeColorResourceId = R.color.colorPrimary;
                break;
        }

        return mContext.getResources().getColor(typeColorResourceId);
    }
}
