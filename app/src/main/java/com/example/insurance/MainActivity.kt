package com.example.insurance

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), AdapterView.OnItemClickListener {
    override fun onItemClick(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        spinnerAge.setOnItemClickListener(this)
        buttonCalculate.setOnClickListener{
            calculatePremium()
        }
    }

    private fun calculatePremium() {
        val position = spinnerAge.selectedItemPosition
        val gender = radioGroupGender.checkedRadioButtonId
        var premium: Int = 0

        if(position == 1){
            premium = 60
        } else if (position == 2){
            premium = 70
        } //TODO: add the rest of age

        if (gender == R.id.radioMale) {
            //TODO: calculate premium for male
        }

        if (checkBoxSmoker.isChecked) {
            //TODO: calculate premium for smoker
        }

        textViewPremium.text = getString(R.string.insurance_premium) + premium;
    }
}
