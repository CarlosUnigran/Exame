package androidpro.com.provaexame;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class Adaptador extends RecyclerView.Adapter<Adaptador.MyViewHolder>
    {

        private List<Cachorro> listcao;

        public Adaptador(List<Cachorro> lista)
        {
            this.listcao = lista;
        }

        @NonNull
        @Override
        public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.adaptador_caes,parent, false);

            return new MyViewHolder(itemLista);
        }

        @Override
        public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
            Cachorro Caozinho = listcao.get(position);
            holder.Nome.setText(Caozinho.getNome());
            holder.Genero.setText(Caozinho.getGenero());
            holder.Raca.setText((Caozinho.getRaca()));
        }

        @Override
        public int getItemCount() {
            return listcao.size();
        }

        public class MyViewHolder extends RecyclerView.ViewHolder
        {
            TextView Nome;
            TextView Raca;
            TextView Genero;

            public MyViewHolder(@NonNull View itemView) {
                super(itemView);

                Nome = itemView.findViewById(R.id.nome);
                Raca = itemView.findViewById(R.id.raca);
                Genero = itemView.findViewById(R.id.genero);
            }
        }

    }

