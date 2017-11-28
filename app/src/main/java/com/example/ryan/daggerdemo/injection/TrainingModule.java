package com.example.ryan.daggerdemo.injection;

import com.example.ryan.daggerdemo.TrainingScores;

import dagger.Module;
import dagger.Provides;

/**
 * Created by Ryan on 28/11/2017.
 */

@Module
public class TrainingModule {

    @Provides
    TrainingScores getScores(){
        return new TrainingScores();
    }


}
