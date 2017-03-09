package com.example.android.goalstracker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int foulTeamA = 0;
    int scoreTeamB = 0;
    int foulTeamB = 0;

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        outState.putInt("newScoreTeamA", scoreTeamA);
        outState.putInt("newScoreTeamB", scoreTeamB);
        outState.putInt("newFoulTeamA", foulTeamA);
        outState.putInt("newFoulTeamB", foulTeamB);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        /**
         * Loads old Score if the old score isn't zero
         * */
        if (savedInstanceState != null) {
            scoreTeamA = savedInstanceState.getInt("newScoreTeamA");
            scoreTeamB = savedInstanceState.getInt("newScoreTeamB");
            displayForTeamA(scoreTeamA);
            displayForTeamB(scoreTeamB);
        }
        /**
         * Loads old Foul if the old foul isn't zero
         * */
        if (savedInstanceState != null) {
            foulTeamA = savedInstanceState.getInt("newFoulTeamA");
            foulTeamB = savedInstanceState.getInt("newFoulTeamB");
            displayFoulForTeamA(foulTeamA);
            displayFoulForTeamB(foulTeamB);
        }
    }


    /**
     * Increase the score for Team A by 1 goal.
     */
    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;

        displayForTeamA(scoreTeamA);
    }

    /**
     * Increase the foul for Team A by 1 goal.
     */
    public void addFoulForTeamA(View v) {
        foulTeamA = foulTeamA + 1;

        displayFoulForTeamA(foulTeamA);
    }

    /**
     * Increase the score for Team B by 1 goal.
     */
    public void addOneForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;

        displayForTeamB(scoreTeamB);
    }

    /**
     * Increase the foul for Team B by 1 goal.
     */
    public void addFoulForTeamB(View v) {
        foulTeamB = foulTeamB + 1;

        displayFoulForTeamB(foulTeamB);
    }

    /**
     * Resets the score to 0.
     */
    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        foulTeamA = 0;
        foulTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayFoulForTeamA(foulTeamA);
        displayFoulForTeamB(foulTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given foul for Team A.
     */
    public void displayFoulForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_foul);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given foul for Team B.
     */
    public void displayFoulForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_foul);
        scoreView.setText(String.valueOf(score));
    }
}
