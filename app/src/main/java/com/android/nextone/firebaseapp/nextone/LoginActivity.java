package com.android.nextone.firebaseapp.nextone;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class LoginActivity extends AppCompatActivity {

   private FirebaseAuth firebaseAuth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity__login);

        loginActivity();

    }

   public void loginActivity(){
       firebaseAuth = FirebaseAuth.getInstance();
       //Login
       firebaseAuth.signInWithEmailAndPassword("rafael.rodrigues@hotmail.com","1234566")
               .addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                   @Override
                   public void onComplete(@NonNull Task<AuthResult> task) {
                       if( task.isSuccessful() ){// Login Com Sucesso!!
                           Log.i("createUser", "Sucesso ao Fazer Login do  Usuario");
                       }else{ //Usuario Não logado!!
                           Log.i("createUser", "Erro ao Fazer Login do Usuario");
                       }
                   }
               });
   }

   public void abrirCadastro(){
       Intent intent = new Intent(LoginActivity.this,CadastroActivity.class);
       startActivity(intent);
   }

}
