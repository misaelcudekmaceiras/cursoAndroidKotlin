package com.manadigital.kotlinclasses

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.manadigital.kotlinclasses.Entities.Mascota

class MainActivity : AppCompatActivity() {

    var mascotas : MutableList<Mascota> = ArrayList<Mascota>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mascotas.add(Mascota("Pedro",Mascota.Constants.typePerro,"Colie",3))
        mascotas.add(Mascota("Rodolgo",Mascota.Constants.typePerro,"Fox Terrier",4))
        mascotas.add(Mascota("Emilio",Mascota.Constants.typePerro,"Gran Danes",5))
        mascotas.add(Mascota("Luis",Mascota.Constants.typeGato,"Siames",6))
        mascotas.add(Mascota("Carlos",Mascota.Constants.typeGato,"Pardo",7))
        mascotas.add(Mascota("David",Mascota.Constants.typeGato,"Arlequin",8))


        for (mascotaActual in mascotas){
            Log.d("Main Activity",mascotaActual.getNombre()+" " + mascotaActual.tipo +" " + mascotaActual.raza+ " " + mascotaActual.edad+ "\n")
        }

        mascotas[0].setNombre("NombreNuevo")
        Log.d("Activity Main",mascotas[0].getNombre())

    }
}
