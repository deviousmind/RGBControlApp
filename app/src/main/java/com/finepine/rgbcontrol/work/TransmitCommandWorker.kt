package com.finepine.rgbcontrol.work

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters

class TransmitCommandWorker(appContext: Context, params: WorkerParameters) :
    CoroutineWorker(appContext, params) {

    companion object {
        const val WORK_NAME = "com.finepine.rgbcontrol.TransmitCommandWorker"
    }
    override suspend fun doWork(): Result {
        return Result.failure()
    }
}