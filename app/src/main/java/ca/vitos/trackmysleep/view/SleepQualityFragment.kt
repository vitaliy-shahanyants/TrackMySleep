package ca.vitos.trackmysleep.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import ca.vitos.trackmysleep.R
import ca.vitos.trackmysleep.databinding.FragmentSleepQualityBinding

class SleepQualityFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentSleepQualityBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_sleep_quality,container,false)

        val application = requireNotNull(this.activity).application

        return binding.root
    }

}