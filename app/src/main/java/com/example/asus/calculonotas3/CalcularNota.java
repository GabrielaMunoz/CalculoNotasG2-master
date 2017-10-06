package com.example.asus.calculonotas3;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class  CalcularNota extends AppCompatActivity {

    private EditText nota1d, nota2d, nota3d;
    private EditText nota1s, nota2s, nota3s;
    private EditText nota1p, nota2p, nota3p;
    private EditText nota1w, nota2w, nota3w;
    private TextView Rd, Rs , Rp , Rw,  tvpromedio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calcular_nota);

        SharedPreferences prefe1 = getSharedPreferences("Desarrollo",Context.MODE_PRIVATE);
        nota1d = (EditText) findViewById(R.id.nota1d);
        nota1d.setText(prefe1.getString("primer", ""));
        nota2d = (EditText) findViewById(R.id.nota2d);
        nota2d.setText(prefe1.getString("segundo", ""));
        nota3d = (EditText) findViewById(R.id.nota3d);
        nota3d.setText(prefe1.getString("tercer", ""));


        Rd=(TextView)findViewById(R.id.Rd);
        Rd.setText(prefe1.getString("resul","0"));
        nota1d.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {

                    SharedPreferences prefe1=getSharedPreferences("Desarrollo",Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor=prefe1.edit();
                    String t1=nota1d.getText().toString();
                    editor.putString("primer", nota1d.getText().toString());
                    String t2=nota2d.getText().toString();
                    String t3=nota3d.getText().toString();

                    float n1=Float.parseFloat(t1);
                    float n2=Float.parseFloat(t2);
                    float n3=Float.parseFloat(t3);

                    if(n1<=5)
                    {

                        double cal=(((n1+n2)/2)*0.6)+(n3*0.4);
                        String resul=Double.toString(cal);
                        editor.putString("resul", resul);
                        editor.commit();
                        Rd.setText(resul);
                    }
                    else
                    {
                        Toast notificacion = Toast.makeText(CalcularNota.this,getResources().getString(R.string.texto_invalido),Toast.LENGTH_LONG);
                        notificacion.show();
                    }


                } catch (Exception e) {

                    Toast notificacion = Toast.makeText(CalcularNota.this,getResources().getString(R.string.texto_campos),Toast.LENGTH_LONG);
                    notificacion.show();

                }}

        });
        nota2d.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int
                    count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {

                    SharedPreferences prefe1=getSharedPreferences("Desarrollo",Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor=prefe1.edit();
                    String t1=nota1d.getText().toString();
                    String t2=nota2d.getText().toString();
                    editor.putString("segundo", nota2d.getText().toString());
                    String t3=nota3d.getText().toString();

                    float n1=Float.parseFloat(t1);
                    float n2=Float.parseFloat(t2);
                    float n3=Float.parseFloat(t3);

                    if(n2<=5)
                    {

                        double cal=(((n1+n2)/2)*0.6)+(n3*0.4);
                        String resul=Double.toString(cal);
                        editor.putString("resul", resul);

                        editor.commit();
                        Rd.setText(resul);
                    }
                    else
                    {
                        Toast notificacion = Toast.makeText(CalcularNota.this,getResources().getString(R.string.texto_invalido),Toast.LENGTH_LONG);
                        notificacion.show();
                    }

                } catch (Exception e) {
                    Toast notificacion = Toast.makeText(CalcularNota.this,getResources().getString(R.string.texto_campos),Toast.LENGTH_LONG);
                    notificacion.show();

                }}

        });

        nota3d.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {

                    SharedPreferences prefe1=getSharedPreferences("Desarrollo",Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor=prefe1.edit();
                    String t1=nota1d.getText().toString();
                    String t2=nota2d.getText().toString();
                    String t3=nota3d.getText().toString();
                    editor.putString("tercer", nota3d.getText().toString());

                    float n1=Float.parseFloat(t1);
                    float n2=Float.parseFloat(t2);
                    float n3=Float.parseFloat(t3);

                    if(n3<=5)
                    {

                        double cal=(((n1+n2)/2)*0.6)+(n3*0.4);
                        String resul=Double.toString(cal);
                        editor.putString("resul", resul);

                        editor.commit();
                        Rd.setText(resul);
                    }
                    else
                    {
                        Toast notificacion = Toast.makeText(CalcularNota.this,getResources().getString(R.string.texto_invalido),Toast.LENGTH_LONG);
                        notificacion.show();
                    }

                } catch (Exception e) {

                    Toast notificacion = Toast.makeText(CalcularNota.this,getResources().getString(R.string.texto_campos),Toast.LENGTH_LONG);
                    notificacion.show();
                }}

        });
        //segunda materia

        SharedPreferences prefe2 = getSharedPreferences("Software",Context.MODE_PRIVATE);
        nota1s = (EditText) findViewById(R.id.nota1s);
        nota1s.setText(prefe2.getString("primer", ""));
        nota2s = (EditText) findViewById(R.id.nota2s);
        nota2s.setText(prefe2.getString("segundo", ""));
        nota3s = (EditText) findViewById(R.id.nota3s);
        nota3s.setText(prefe2.getString("tercer", ""));


        Rs=(TextView)findViewById(R.id.Rs);
        Rs.setText(prefe2.getString("resul1","0"));

        nota1s.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {

                    SharedPreferences prefe2=getSharedPreferences("Software",Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor=prefe2.edit();
                    String t1=nota1s.getText().toString();
                    editor.putString("primer", nota1s.getText().toString());
                    String t2=nota2s.getText().toString();
                    String t3=nota3s.getText().toString();

                    float n1=Float.parseFloat(t1);
                    float n2=Float.parseFloat(t2);
                    float n3=Float.parseFloat(t3);

                    if(n1<=5)
                    {

                        double cal=(((n1+n2)/2)*0.6)+(n3*0.4);
                        String resul1=Double.toString(cal);
                        editor.putString("resul1", resul1);

                        editor.commit();
                        Rs.setText(resul1);
                    }
                    else
                    {
                        Toast notificacion = Toast.makeText(CalcularNota.this,getResources().getString(R.string.texto_invalido),Toast.LENGTH_LONG);
                        notificacion.show();
                    }

                } catch (Exception e) {
                    Toast notificacion = Toast.makeText(CalcularNota.this,getResources().getString(R.string.texto_campos),Toast.LENGTH_LONG);
                    notificacion.show();

                }}

        });
        nota2s.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int
                    count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {

                    SharedPreferences prefe2=getSharedPreferences("Software",Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor=prefe2.edit();
                    String t1=nota1s.getText().toString();
                    String t2=nota2s.getText().toString();
                    editor.putString("segundo", nota2s.getText().toString());
                    String t3=nota3s.getText().toString();

                    float n1=Float.parseFloat(t1);
                    float n2=Float.parseFloat(t2);
                    float n3=Float.parseFloat(t3);

                    if(n2<=5)
                    {

                        double cal=(((n1+n2)/2)*0.6)+(n3*0.4);
                        String resul1=Double.toString(cal);
                        editor.putString("resul1", resul1);

                        editor.commit();
                        Rs.setText(resul1);
                    }
                    else
                    {
                        Toast notificacion = Toast.makeText(CalcularNota.this,getResources().getString(R.string.texto_invalido),Toast.LENGTH_LONG);
                        notificacion.show();
                    }

                } catch (Exception e) {
                    Toast notificacion = Toast.makeText(CalcularNota.this,getResources().getString(R.string.texto_campos),Toast.LENGTH_LONG);
                    notificacion.show();

                }}

        });

        nota3s.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {

                    SharedPreferences prefe2=getSharedPreferences("Software",Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor=prefe2.edit();
                    String t1=nota1s.getText().toString();
                    String t2=nota2s.getText().toString();
                    String t3=nota3s.getText().toString();
                    editor.putString("tercer", nota3s.getText().toString());

                    float n1=Float.parseFloat(t1);
                    float n2=Float.parseFloat(t2);
                    float n3=Float.parseFloat(t3);

                    if(n3<=5)
                    {
                        double cal=(((n1+n2)/2)*0.6)+(n3*0.4);
                        String resul1=Double.toString(cal);
                        editor.putString("resul1", resul1);

                        editor.commit();
                        Rs.setText(resul1);
                    }
                    else
                    {
                        Toast notificacion = Toast.makeText(CalcularNota.this,getResources().getString(R.string.texto_invalido),Toast.LENGTH_LONG);
                        notificacion.show();
                    }

                } catch (Exception e) {
                    Toast notificacion = Toast.makeText(CalcularNota.this,getResources().getString(R.string.texto_campos),Toast.LENGTH_LONG);
                    notificacion.show();
                }}

        });

        //Materia tres

        SharedPreferences prefe3 = getSharedPreferences("Patrones", Context.MODE_PRIVATE);
        nota1p = (EditText) findViewById(R.id.nota1p);
        nota1p.setText(prefe3.getString("primer", ""));
        nota2p = (EditText) findViewById(R.id.nota2p);
        nota2p.setText(prefe3.getString("segundo", ""));
        nota3p = (EditText) findViewById(R.id.nota3p);
        nota3p.setText(prefe3.getString("tercer", ""));

        Rp=(TextView)findViewById(R.id.Rp);
        Rp.setText(prefe3.getString("resul2","0"));
        nota1p.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {

                    SharedPreferences prefe3=getSharedPreferences("Patrones",Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor=prefe3.edit();
                    String t1=nota1p.getText().toString();
                    editor.putString("primer", nota1p.getText().toString());
                    String t2=nota2p.getText().toString();
                    String t3=nota3p.getText().toString();

                    float n1=Float.parseFloat(t1);
                    float n2=Float.parseFloat(t2);
                    float n3=Float.parseFloat(t3);

                    if(n1<=5)
                    {
                        double cal=(((n1+n2)/2)*0.6)+(n3*0.4);
                        String resul2=Double.toString(cal);
                        editor.putString("resul2", resul2);

                        editor.commit();
                        Rp.setText(resul2);
                    }
                    else
                    {
                        Toast notificacion = Toast.makeText(CalcularNota.this,getResources().getString(R.string.texto_invalido),Toast.LENGTH_LONG);
                        notificacion.show();
                    }

                } catch (Exception e) {
                    Toast notificacion = Toast.makeText(CalcularNota.this,getResources().getString(R.string.texto_campos),Toast.LENGTH_LONG);
                    notificacion.show();
                }}

        });
        nota2p.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {

                    SharedPreferences prefe3=getSharedPreferences("Patrones",Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor=prefe3.edit();
                    String t1=nota1p.getText().toString();
                    String t2=nota2p.getText().toString();
                    editor.putString("segundo", nota2p.getText().toString());
                    String t3=nota3p.getText().toString();

                    float n1=Float.parseFloat(t1);
                    float n2=Float.parseFloat(t2);
                    float n3=Float.parseFloat(t3);

                    if(n2<=5)
                    {
                        double cal=(((n1+n2)/2)*0.6)+(n3*0.4);
                        String resul2=Double.toString(cal);
                        editor.putString("resul2", resul2);

                        editor.commit();
                        Rp.setText(resul2);
                    }
                    else
                    {
                        Toast notificacion = Toast.makeText(CalcularNota.this,getResources().getString(R.string.texto_invalido),Toast.LENGTH_LONG);
                        notificacion.show();
                    }

                } catch (Exception e) {
                    Toast notificacion = Toast.makeText(CalcularNota.this,getResources().getString(R.string.texto_campos),Toast.LENGTH_LONG);
                    notificacion.show();

                }}

        });

        nota3p.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {

                    SharedPreferences prefe3=getSharedPreferences("Patrones",Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor=prefe3.edit();
                    String t1=nota1p.getText().toString();
                    String t2=nota2p.getText().toString();
                    String t3=nota3p.getText().toString();
                    editor.putString("tercer", nota3p.getText().toString());

                    float n1=Float.parseFloat(t1);
                    float n2=Float.parseFloat(t2);
                    float n3=Float.parseFloat(t3);

                    if(n3<=5)
                    {
                        double cal=(((n1+n2)/2)*0.6)+(n3*0.4);
                        String resul2=Double.toString(cal);
                        editor.putString("resul2", resul2);

                        editor.commit();
                        Rp.setText(resul2);
                    }
                    else
                    {
                        Toast notificacion = Toast.makeText(CalcularNota.this,getResources().getString(R.string.texto_invalido),Toast.LENGTH_LONG);
                        notificacion.show();
                    }


                } catch (Exception e) {
                    Toast notificacion = Toast.makeText(CalcularNota.this,getResources().getString(R.string.texto_campos),Toast.LENGTH_LONG);
                    notificacion.show();

                }}

        });
        // Materia cuatro
        final SharedPreferences prefe4 = getSharedPreferences("Web", Context.MODE_PRIVATE);
        nota1w = (EditText) findViewById(R.id.nota1w);
        nota1w.setText(prefe4.getString("primer", ""));
        nota2w = (EditText) findViewById(R.id.nota2w);
        nota2w.setText(prefe4.getString("segundo", ""));
        nota3w = (EditText) findViewById(R.id.nota3w);
        nota3w.setText(prefe4.getString("tercer", ""));

        Rw=(TextView)findViewById(R.id.Rw);
        Rw.setText(prefe4.getString("resul3","0"));
        nota1w.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before,int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {

                    SharedPreferences prefe4=getSharedPreferences("Web",Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor=prefe4.edit();
                    String t1=nota1w.getText().toString();
                    editor.putString("primer", nota1w.getText().toString());
                    String t2=nota2w.getText().toString();
                    String t3=nota3w.getText().toString();

                    float n1=Float.parseFloat(t1);
                    float n2=Float.parseFloat(t2);
                    float n3=Float.parseFloat(t3);

                    if(n1<=5)
                    {
                        double cal=(((n1+n2)/2)*0.6)+(n3*0.4);
                        String resul3=Double.toString(cal);
                        editor.putString("resul3", resul3);

                        editor.commit();
                        Rw.setText(resul3);
                    }
                    else
                    {
                        Toast notificacion = Toast.makeText(CalcularNota.this,getResources().getString(R.string.texto_invalido),Toast.LENGTH_LONG);
                        notificacion.show();
                    }

                } catch (Exception e) {

                    Toast notificacion = Toast.makeText(CalcularNota.this,getResources().getString(R.string.texto_campos),Toast.LENGTH_LONG);
                    notificacion.show();

                }}

        });
        nota2w.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {

                    SharedPreferences prefe4=getSharedPreferences("Web",Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor=prefe4.edit();
                    String t1=nota1w.getText().toString();
                    String t2=nota2w.getText().toString();
                    editor.putString("segundo", nota2w.getText().toString());
                    String t3=nota3w.getText().toString();

                    float n1=Float.parseFloat(t1);
                    float n2=Float.parseFloat(t2);
                    float n3=Float.parseFloat(t3);

                    if(n2<=5)
                    {
                        double cal=(((n1+n2)/2)*0.6)+(n3*0.4);
                        String resul3=Double.toString(cal);
                        editor.putString("resul3", resul3);

                        editor.commit();
                        Rw.setText(resul3);
                    }
                    else
                    {
                        Toast notificacion = Toast.makeText(CalcularNota.this,getResources().getString(R.string.texto_invalido),Toast.LENGTH_LONG);
                        notificacion.show();
                    }

                } catch (Exception e)
                {
                    Toast notificacion = Toast.makeText(CalcularNota.this,getResources().getString(R.string.texto_campos),Toast.LENGTH_LONG);
                    notificacion.show();

                }
            }

        });

        nota3w.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                try {

                    SharedPreferences prefe4=getSharedPreferences("Web",Context.MODE_PRIVATE);
                    SharedPreferences.Editor editor=prefe4.edit();
                    String t1=nota1w.getText().toString();
                    String t2=nota2w.getText().toString();
                    String t3=nota3w.getText().toString();
                    editor.putString("tercer", nota3w.getText().toString());

                    float n1=Float.parseFloat(t1);
                    float n2=Float.parseFloat(t2);
                    float n3=Float.parseFloat(t3);

                    if(n3<=5)
                    {                        double cal=(((n1+n2)/2)*0.6)+(n3*0.4);
                        String resul3=Double.toString(cal);
                        editor.putString("resul3", resul3);

                        editor.commit();
                        Rw.setText(resul3);
                    }
                    else
                    {
                        Toast notificacion = Toast.makeText(CalcularNota.this,getResources().getString(R.string.texto_invalido),Toast.LENGTH_LONG);
                        notificacion.show();
                    }

                } catch (Exception e){

                    Toast notificacion = Toast.makeText(CalcularNota.this,getResources().getString(R.string.texto_campos),Toast.LENGTH_LONG);
                    notificacion.show();
                }}

        });
        Rd = (TextView) findViewById(R.id.Rd);
        Rd.setText(prefe1.getString("resul", ""));
        Rs = (TextView) findViewById(R.id.Rs);
        Rs.setText(prefe2.getString("resul1", ""));
        Rp = (TextView) findViewById(R.id.Rp);
        Rp.setText(prefe3.getString("resul2", ""));
        Rw = (TextView) findViewById(R.id.Rw);
        Rw.setText(prefe4.getString("resul3", ""));
    }
    public void calcularPromedio(View v) {

        String r1=Rd.getText().toString();
        String r2=Rs.getText().toString();
        String r3=Rp.getText().toString();
        String r4=Rw.getText().toString();

        float res1=Float.parseFloat(r1);
        float res2=Float.parseFloat(r2);
        float res3=Float.parseFloat(r3);
        float res4=Float.parseFloat(r4);

        double total = (res1 + res2 + res3 + res4) / 4;
        String resul = Double.toString(total);

        Toast notificacion = Toast.makeText(this,getResources().getString(R.string.ponderado)+ resul,Toast.LENGTH_LONG);
        notificacion.show();
    }
    public void informacion(View view) {
        Intent i = new Intent(this, Informacion.class );
        startActivity(i);
    }
    public void acercade(View view) {
        Intent i = new Intent(this, AcercaDe.class );
        startActivity(i);
    }
}
