package com.example.gpproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;
import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class setnotifi_from_frag_home extends AppCompatActivity {
    TextView time;
    int hour, min;
    Switch sw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setnotifi_from_frag_home);
        ImageButton back=findViewById(R.id.back_button);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {finish();}});
        time=findViewById(R.id.textview_time);

        if(gloVAR.noti_time_hour==null && gloVAR.noti_time_min==null){
            time.setText("Null");
        }else {
            time.setText(gloVAR.noti_time_hour+":"+gloVAR.noti_time_min);
        }
        switchOn();
        Timerun();
    }

    public void Timerun(){
        Calendar currentTime = Calendar.getInstance();
        hour = currentTime.get(Calendar.HOUR_OF_DAY);
        min = currentTime.get(Calendar.MINUTE);
        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showTime(hour,min);
            }
        });
    }
    public void showTime(int hours,  int minute){
        TimePickerDialog mTimePicker;
        mTimePicker = new TimePickerDialog(setnotifi_from_frag_home.this,2, new TimePickerDialog.OnTimeSetListener() {
            @Override
            public void onTimeSet(TimePicker timePicker, int selectedHour, int selectedMinute) {
               if (selectedMinute<10){
                   hour=selectedHour;
                   min=selectedMinute;
                   gloVAR.noti_time_hour=Integer.toString(selectedHour);
                   gloVAR.noti_time_min=Integer.toString(selectedMinute);
                   time.setText( gloVAR.noti_time_hour + ":0" + gloVAR.noti_time_min);}
               else{
                hour=selectedHour;
                min=selectedMinute;
                   gloVAR.noti_time_hour=Integer.toString(selectedHour);
                   gloVAR.noti_time_min=Integer.toString(selectedMinute);
                   time.setText( gloVAR.noti_time_hour + ":" + gloVAR.noti_time_min);}}}, hours, minute, true);
        mTimePicker.setTitle("Select Time");
        mTimePicker.show();}

    public void switchOn(){
        sw =findViewById(R.id.noti_switch);
        sw.setChecked(gloVAR.Sw_states);
        sw.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if (b){
                    createNoti();
                    gloVAR.Sw_states=true;
                }else{
                 Toast.makeText(setnotifi_from_frag_home.this, "Notification function closed", Toast.LENGTH_SHORT).show();
                gloVAR.Sw_states=false;
                }
            }});}
    void createNoti(){
        String id ="my_channel_id_01";
        NotificationManager manager=(NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.O){
            NotificationChannel channel =manager.getNotificationChannel(id);
            if (channel==null){
                channel =new NotificationChannel(id,"Channel name",NotificationManager.IMPORTANCE_HIGH);
                channel.setDescription("Quizlet");
                channel.setLockscreenVisibility(Notification.VISIBILITY_PUBLIC);
                manager.createNotificationChannel(channel);
            }
        }
        Intent notificationIntent = new Intent(this,MainActivity.class);
        notificationIntent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP|Intent.FLAG_ACTIVITY_SINGLE_TOP);
        PendingIntent pendingIntent = null;
        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.S) {
            pendingIntent = PendingIntent.getActivity(this, 0, notificationIntent, PendingIntent.FLAG_MUTABLE);}
        else {
            pendingIntent = PendingIntent.getActivity(this, 0, notificationIntent, PendingIntent.FLAG_ONE_SHOT);}
        if (min>=10){
            NotificationCompat.Builder builder=new NotificationCompat.Builder(this,id)
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setContentTitle("Quizlet")
                .setContentText( gloVAR.noti_time_hour +" : "+gloVAR.noti_time_min+" will remind you to study!")
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setAutoCancel(true);
            builder.setContentIntent(pendingIntent);
            NotificationManagerCompat m= NotificationManagerCompat.from(getApplicationContext());
            m.notify(1,builder.build());}
         else {
            NotificationCompat.Builder builder=new NotificationCompat.Builder(this,id)
                .setSmallIcon(R.drawable.ic_launcher_background)
                .setContentTitle("Quizlet")
                .setContentText( gloVAR.noti_time_hour +" :0"+gloVAR.noti_time_min+" will remind you to study!")
                .setPriority(NotificationCompat.PRIORITY_HIGH)
                .setAutoCancel(true);
            builder.setContentIntent(pendingIntent);
            NotificationManagerCompat m= NotificationManagerCompat.from(getApplicationContext());
            m.notify(1,builder.build());}}
}