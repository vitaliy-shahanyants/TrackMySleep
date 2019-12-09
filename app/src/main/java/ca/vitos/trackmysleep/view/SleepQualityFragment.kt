package ca.vitos.trackmysleep.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.navigation.fragment.findNavController
import ca.vitos.trackmysleep.R
import ca.vitos.trackmysleep.database.SleepDatabase
import ca.vitos.trackmysleep.databinding.FragmentSleepQualityBinding
import ca.vitos.trackmysleep.viewmodel.sleepquality.SleepQualityViewModel
import ca.vitos.trackmysleep.viewmodel.sleepquality.SleepQualityViewModelFactory

class SleepQualityFragment: Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding: FragmentSleepQualityBinding = DataBindingUtil.inflate(inflater, R.layout.fragment_sleep_quality,container,false)

        val application = requireNotNull(this.activity).application

        val arguments = SleepQualityFragmentArgs.fromBundle(arguments!!)

        val dataSource = SleepDatabase.getInstance(application).sleepDatabaseDao

        val viewModelFactory = SleepQualityViewModelFactory(arguments.sleepNightKey,dataSource)
        val viewModel = ViewModelProviders.of(this,viewModelFactory).get(SleepQualityViewModel::class.java)

        binding.viewModel = viewModel

        viewModel.navigateSleepTracker.observe(this, Observer {
            if (it == true){
                this.findNavController().navigate(SleepQualityFragmentDirections.actionSleepQualityFragmentToSleepQualityTracker())
                viewModel.doneNavigating()
            }
        })

        return binding.root
    }

}