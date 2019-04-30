package com.example.cadastro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class NovaTela extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nova_tela);

        Intent getIntent = getIntent();

        Pessoa p = (Pessoa) getIntent.getSerializableExtra("pessoa");

        String nome = p.getNome();
        String data = p.getData();
        String email = p.getEmail();
        String telefone = p.getTelefone();
        String endereco = p.getEndereco();
        String mae = p.getMae();
        String pai = p.getPai();
        String civil = p.getCivil();
        String profissao = p.getProfissao();
        String social = p.getSocial();

        /*String nome = getIntent.getStringExtra("nome");
        String data = getIntent.getStringExtra("data");
        String email = getIntent.getStringExtra("email");
        String telefone = getIntent.getStringExtra("telefone");
        String endereco = getIntent.getStringExtra("endereco");
        String mae = getIntent.getStringExtra("mae");
        String pai = getIntent.getStringExtra("pai");
        String civil = getIntent.getStringExtra("civil");
        String profissao = getIntent.getStringExtra("profissao");
        String social = getIntent.getStringExtra("social");*/

        //Toast.makeText(this, "nome").show();
        //Bundle params = getIntent.getExtras();

        //String nomes = params.getString("nome", "o que escrever aqui!");

        TextView nomeView = (TextView) findViewById(R.id.nomeTexto);
        TextView dataView = (TextView) findViewById(R.id.dataTexto);
        TextView emailView = (TextView) findViewById(R.id.emailTexto);
        TextView telefoneView = (TextView) findViewById(R.id.telefoneTexto);
        TextView enderecoView = (TextView) findViewById(R.id.enderecoTexto);
        TextView maeView = (TextView) findViewById(R.id.maeTexto);
        TextView paiView = (TextView) findViewById(R.id.paiTexto);
        TextView civilView = (TextView) findViewById(R.id.civilTexto);
        TextView profissaoView = (TextView) findViewById(R.id.profissaoTexto);
        TextView socialView = (TextView) findViewById(R.id.socialTexto);

        nomeView.setText(nome);
        dataView.setText(data);
        emailView.setText(email);
        telefoneView.setText(telefone);
        enderecoView.setText(endereco);
        maeView.setText(mae);
        paiView.setText(pai);
        civilView.setText(civil);
        profissaoView.setText(profissao);
        socialView.setText(social);
    }
}
