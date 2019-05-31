package com.londonappbrewery.xylophonepm;

import android.media.AudioManager;
import android.media.SoundPool;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.net.URI;

public class MainActivity extends AppCompatActivity {

    // Helpful Constants
    private final int NR_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    // TODO: Add member variables here
    private SoundPool mSoundPool;
    private int mCSoundId;
    private int mDSoundId;
    private int mESoundId;
    private int mFSoundId;
    private int mGSoundId;
    private int mASoundId;
    private int mBSoundId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Create a new SoundPool
        mSoundPool = new SoundPool(7,AudioManager.STREAM_MUSIC,0);
        mASoundId = mSoundPool.load(getApplicationContext(), R.raw.note6_a,1 );
        mBSoundId = mSoundPool.load(getApplicationContext(), R.raw.note7_b,1 );
        mCSoundId = mSoundPool.load(getApplicationContext(), R.raw.note1_c,1 );
        mDSoundId = mSoundPool.load(getApplicationContext(), R.raw.note2_d,1 );
        mESoundId = mSoundPool.load(getApplicationContext(), R.raw.note3_e,1 );
        mFSoundId = mSoundPool.load(getApplicationContext(), R.raw.note4_f,1 );
        mGSoundId = mSoundPool.load(getApplicationContext(), R.raw.note5_g,1 );

        // TODO: Load and get the IDs to identify the sounds

    }

    public void playA(View v)
    {
        mSoundPool.play(mASoundId,1,1,0,0,1);
    }

    public void playB(View v)
    {
        mSoundPool.play(mBSoundId,1,1,0,0,1);
    }
    public void playC(View v)
    {
        mSoundPool.play(mCSoundId,1,1,0,5,1);
    }
    public void playD(View v)
    {
        mSoundPool.play(mDSoundId,1,1,0,5,1);
    }
    public void playE(View v)
    {
        mSoundPool.play(mESoundId,1,1,0,5,1);
    }
    public void playF(View v)
    {
        mSoundPool.play(mFSoundId,1,1,0,5,1);
    }
    public void playG(View v)
    {
        mSoundPool.play(mGSoundId,1,1,0,5,1);
    }

    // TODO: Add the play methods triggered by the buttons




}
