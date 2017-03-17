package com.shinhan.mobileacademy;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.widget.EditText;

public class MyService extends Service {

    private static final String TAG = "MyService";
    public MyService() {
    }

    @Override
    public void onCreate(){
        super.onCreate();

    }

    @Override
    public int onStartCommand(Intent intent,int flags, int startId){
        if(intent == null){
            return Service.START_STICKY;

        }else{
            processCommand(intent);
        }
        return super.onStartCommand(intent,flags,startId);
    }

    private void processCommand(Intent intent){
        String commnad = intent.getStringExtra("command");
        String name  = intent.getStringExtra("name");
        for (int i=0;i<5;i++) {
            try {
                Thread.sleep(1000);
            }
            catch (Exception e){

            };

        }
    }
    @Override
    public IBinder onBind(Intent intent) {
        // TODO: Return the communication channel to the service.
        throw new UnsupportedOperationException("Not yet implemented");
    }
}
