package ca.vitos.trackmysleep.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import ca.vitos.trackmysleep.R
import ca.vitos.trackmysleep.databinding.FragmentSleepTrackerBinding

class SleepQualityTracker: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentSleepTrackerBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_sleep_tracker,container,false)

        return binding.root
    }
}