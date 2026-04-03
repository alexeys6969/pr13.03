package com.example.microphone_shashin.datas.players;

import com.example.microphone_shashin.datas.players.PlayerHelper;
import android.media.MediaPlayer;
import android.util.Log;


public class PlayerHelper {
    public MediaPlayer MediaPlayer;
    public void StartPlay(String pathFile) {
        try {
            MediaPlayer = new MediaPlayer();
            MediaPlayer.setDataSource(pathFile);
            MediaPlayer.prepare();
            MediaPlayer.start();
        } catch (Exception exp) {
            Log.e("PLAY", exp.getMessage());
        }
    }
    public void StopPlay() {
        if(MediaPlayer != null) {
            MediaPlayer.stop();
            MediaPlayer = null;
        }
    }
}
