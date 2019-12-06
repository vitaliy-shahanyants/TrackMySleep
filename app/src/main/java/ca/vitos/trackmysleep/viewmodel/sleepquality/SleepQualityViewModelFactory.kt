package ca.vitos.trackmysleep.viewmodel.sleepquality

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import ca.vitos.trackmysleep.database.SleepDatabaseDao

class SleepQualityViewModelFactory(private val sleepNight: Long,
                                   private val database: SleepDatabaseDao): ViewModelProvider.Factory {
    @Suppress("unchecked_cast")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        if(modelClass.isAssignableFrom(SleepQualityViewModel::class.java)){
            return SleepQualityViewModel(sleepNight,database) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}