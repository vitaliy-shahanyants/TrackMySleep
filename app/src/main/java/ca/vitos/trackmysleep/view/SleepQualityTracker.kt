package ca.vitos.trackmysleep.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProviders
import ca.vitos.trackmysleep.R
import ca.vitos.trackmysleep.database.SleepDatabase
import ca.vitos.trackmysleep.databinding.FragmentSleepTrackerBinding
import ca.vitos.trackmysleep.viewmodel.sleeptracker.SleepTrackerViewModel
import ca.vitos.trackmysleep.viewmodel.sleeptracker.SleepTrackerViewModelFactory

class SleepQualityTracker: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentSleepTrackerBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_sleep_tracker,container,false)

        binding.lifecycleOwner = this

        val application = requireNotNull(this.activity).application
        val dataSource = SleepDatabase.getInstance(application).sleepDatabaseDao

        val viewModelFactory = SleepTrackerViewModelFactory(dataSource,application)
        val sleepTrackerViewModel = ViewModelProviders.of(this,viewModelFactory).get(SleepTrackerViewModel::class.java)

        binding.viewmodel = sleepTrackerViewModel

        return binding.root
    }
}