package org.d3if3024.galerihewan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    private fun getData() : List<Hewan> {
        return listOf(
                Hewan("Angsa", "Cygnus olor", R.drawable.angsa),
                Hewan("Ayam", "Gallus gallus", R.drawable.ayam),
                Hewan("Bebek", "Cairina moschata", R.drawable.bebek),
                Hewan("Domba", "Ovis ammon", R.drawable.domba),
                Hewan("Kalkun", "Meleagris gallopavo", R.drawable.kalkun),
                Hewan("Kambing", "Capricornis sumatrensis", R.drawable.kambing),
                Hewan("Kelinci", "Oryctolagus cuniculus", R.drawable.kelinci),
                Hewan("kerbau", "Bubalus bubalis", R.drawable.kerbau),
                Hewan("Kuda", "Equus caballus", R.drawable.kuda),
                Hewan("Sapi", "Bos taurus", R.drawable.sapi)

                )
    }
}