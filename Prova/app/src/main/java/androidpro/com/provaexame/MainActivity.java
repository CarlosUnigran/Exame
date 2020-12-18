package androidpro.com.provaexame;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView CachorroRy;

    private EditText idnome;
    private EditText idraca;
    private EditText idgenero;

    private List<Cachorro> listacao = new ArrayList<>();

    private FirebaseDatabase db;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        idnome = findViewById(R.id.idnome);
        idraca = findViewById(R.id.idraca);
        idgenero = findViewById(R.id.idgenero);
        IniciarFirebase();
        CachorroRy = findViewById(R.id.recycler);
        criar();


        Adaptador adaptador = new Adaptador(this.listacao);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        CachorroRy.setLayoutManager(layoutManager);
        CachorroRy.setHasFixedSize(true);
        CachorroRy.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        CachorroRy.setAdapter(adaptador);
    }
    private void IniciarFirebase()
    {
        db = FirebaseDatabase.getInstance();
        db.setPersistenceEnabled(true);
        FirebaseApp.initializeApp(this);
        reference = db.getReference();
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
    public void Cadastrar(View view)
    {
        Cachorro Caozinho = new Cachorro();
        Caozinho.setNome(idnome.getText().toString());
        Caozinho.setGenero(idgenero.getText().toString());
        Caozinho.setRaca(idraca.getText().toString());

        reference.child("Cachorro").child(Caozinho.getNome()).setValue(Caozinho);
        Toast.makeText(getApplicationContext(),"CADASTRADO", Toast.LENGTH_SHORT).show();
    }
}






