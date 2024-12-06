package owasp.sat.agoat

import android.app.DownloadManager
import android.app.Service
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Environment
import android.os.IBinder
import android.util.Log
import android.widget.Toast
// import org.jetbrains.anko.doAsync // Comment out this line
// import org.jetbrains.anko.stopService // Comment out this line
import java.lang.Thread.sleep

class DownloadInvoiceService : Service() {

    override fun onCreate(){
        Log.i("DOWNLOAD", "Service onCreate")
        Toast.makeText(applicationContext, "Service Created", Toast.LENGTH_LONG).show();
        //stopSelf()
    }

    override fun onBind(intent: Intent): IBinder? {
        //TODO("Return the communication channel to the service.")
        //throw UnsupportedOperationException("Not yet implemented")
        Log.i("DOWNLOAD", "Service onBind")
        return null
    }

    override fun onStartCommand(intent: Intent?, flags: Int, startId: Int): Int {
        Log.i("DOWNLOAD", "Service onStartCommand")
        Toast.makeText(applicationContext, "Service Started", Toast.LENGTH_LONG).show();

        // Comment out or disable the problematic code
        // doAsync {
        //     // Simulate a long-running task
        //     sleep(5000)
        //     Log.i("DOWNLOAD", "Service running in background")
        //     stopSelf()
        // }

        return START_STICKY
    }

    override fun onDestroy() {
        Log.i("DOWNLOAD", "Service onDestroy")
        Toast.makeText(applicationContext, "Service Destroyed", Toast.LENGTH_LONG).show();
        super.onDestroy()
    }
}

