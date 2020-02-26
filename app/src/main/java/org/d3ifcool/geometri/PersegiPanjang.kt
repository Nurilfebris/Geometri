package org.d3ifcool.geometri


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import kotlinx.android.synthetic.main.fragment_persegi_panjang.*
import org.d3ifcool.geometri.databinding.ActivityMainBinding

/**
 * A simple [Fragment] subclass.
 */
class PersegiPanjang : Fragment() {
    private var a=0;
    private var b=0;
   private var hitungkeliling=0
    private var hitungluas=0

    private lateinit var binding: ActivityMainBinding

        override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?

    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_persegi_panjang, container, false)
            //binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

    hitung1.setOnClickListener {
        textView.setText(hitungluas)
        textView2.setText(hitungkeliling)
    }
    }

    private fun hitungkeliling(){
        a=panjang.text.toString().toInt()
        b=lebar.text.toString().toInt()
        hitungkeliling =2*(a+b)

    }
    private fun hitungluas(){
        a=panjang.text.toString().toInt()
        b=lebar.text.toString().toInt()
        hitungluas =a*b
    }



}
