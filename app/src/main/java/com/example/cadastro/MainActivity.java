package com.example.cadastro;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    /*public static final String NOME = "nome";
    public static final String DATA = "data";
    public static final String EMAIL = "email";
    public static final String TELEFONE = "telefone";
    public static final String ENDERECO = "endereco";
    public static final String MAE = "mae";
    public static final String PAI = "pai";
    public static final String CIVIL = "civil";
    public static final String PROFISSAO = "profissao";
    public static final String SOCIAL = "social";*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gravar(View v) {
        Intent intent = new Intent(this, NovaTela.class);

        TextView fName = (TextView) findViewById(R.id.nome);
        String name = fName.getText().toString();

        TextView fData = (TextView) findViewById(R.id.data);
        String data = fData.getText().toString();

        TextView fEmail = (TextView) findViewById(R.id.email);
        String email = fEmail.getText().toString();

        TextView fTelefone = (TextView) findViewById(R.id.telefone);
        String telefone = fTelefone.getText().toString();

        TextView fEndereco = (TextView) findViewById(R.id.endereco);
        String endereco = fEndereco.getText().toString();

        TextView fMae = (TextView) findViewById(R.id.mae);
        String mae = fMae.getText().toString();

        TextView fPai = (TextView) findViewById(R.id.pai);
        String pai = fPai.getText().toString();

        TextView fCivil = (TextView) findViewById(R.id.civil);
        String civil = fCivil.getText().toString();

        TextView fProfissao = (TextView) findViewById(R.id.profissao);
        String profissao = fProfissao.getText().toString();

        TextView fSocial = (TextView) findViewById(R.id.social);
        String social = fSocial.getText().toString();

        Pessoa p = new Pessoa();
        p.setNome(name);
        p.setData(data);
        p.setEmail(email);
        p.setTelefone(telefone);
        p.setEndereco(endereco);
        p.setMae(mae);
        p.setPai(pai);
        p.setCivil(civil);
        p.setProfissao(profissao);
        p.setSocial(social);

        intent.putExtra("pessoa", p);

        /*intent.putExtra("nome", name);
        intent.putExtra("data", data);
        intent.putExtra("email", email);
        intent.putExtra("telefone", telefone);
        intent.putExtra("endereco", endereco);
        intent.putExtra("mae", mae);
        intent.putExtra("pai", pai);
        intent.putExtra("civil", civil);
        intent.putExtra("profissao", profissao);
        intent.putExtra("social", social);*/

        startActivity(intent);
    }
}
