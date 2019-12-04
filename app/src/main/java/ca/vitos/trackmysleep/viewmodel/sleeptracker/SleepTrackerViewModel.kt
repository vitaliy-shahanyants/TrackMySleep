package ca.vitos.trackmysleep.viewmodel.sleeptracker

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import ca.vitos.trackmysleep.database.SleepDatabaseDao

class SleepTrackerViewModel(val database: SleepDatabaseDao, application: Application): AndroidViewModel(application) {



}