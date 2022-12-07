package com.LopezContreras.criminalintent

import android.app.Application
import com.LopezContreras.criminalintent.CrimeRepository

class CriminalIntentApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        CrimeRepository.initialize(this)
    }
}
