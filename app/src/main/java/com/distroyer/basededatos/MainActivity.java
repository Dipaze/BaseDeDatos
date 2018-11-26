package com.distroyer.basededatos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void IngresarAcademias(View view) {
        Intent IAcademias = new Intent(this,Academias.class);
        startActivity(IAcademias);
    }

    public void IngresarAlumno(View view) {
        Intent IAlumnos = new Intent(this,Alumno.class);
        startActivity(IAlumnos);
    }

    public void IngresarAsignaturas(View view) {
        Intent IAsignaturas = new Intent(this,Asignaturas.class);
        startActivity(IAsignaturas);
    }

    public void IngresarCalificaciones(View view) {
        Intent ICalificaciones = new Intent(this,Calificaciones.class);
        startActivity(ICalificaciones);
    }

    public void IngresarCarrera(View view) {
        Intent ICarrera = new Intent(this,Carrera.class);
        startActivity(ICarrera);
    }

    public void IngresarDocentes(View view) {
        Intent IDocentes = new Intent(this,Docentes.class);
        startActivity(IDocentes);
    }

    public void IngresarMunicipio(View view) {
        Intent IMunicipio = new Intent(this,Municipio.class);
        startActivity(IMunicipio);
    }
}
