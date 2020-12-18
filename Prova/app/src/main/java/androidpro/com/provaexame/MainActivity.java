package androidpro.com.provaexame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView CachorroRy;

    private List<Cachorro> listacao = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CachorroRy = findViewById(R.id.recycler);
        criar();

        Adaptador adaptador = new Adaptador(this.listacao);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        CachorroRy.setLayoutManager(layoutManager);
        CachorroRy.setHasFixedSize(true);
        CachorroRy.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        CachorroRy.setAdapter(adaptador);
    }
    public void criar() {
        Cachorro Caozinho = new Cachorro("Jax", "Bulldog", "Masculino");
        this.listacao.add(Caozinho);

        Caozinho = new Cachorro("Ahri", "chau chau", "Feminino");
        this.listacao.add(Caozinho);

        Caozinho = new Cachorro("Maxx", "pinter", "Masculino");
        this.listacao.add(Caozinho);

        Caozinho = new Cachorro("Jess", "viralata", "Feminino");
        this.listacao.add(Caozinho);
    }
}




