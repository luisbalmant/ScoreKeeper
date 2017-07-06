package com.example.luisbalmant.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    /**
     * Initial scores
     */
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Buttons Team A.
     */
    public void addThreeForTeamA(View v) {
        scoreTeamA = (scoreTeamA + 3);
        displayForTeamA(scoreTeamA);
    }

    public void addTwoForTeamA(View v) {
        scoreTeamA = (scoreTeamA + 2);
        displayForTeamA(scoreTeamA);
    }

    public void addOneForTeamA(View v) {
        scoreTeamA = (scoreTeamA + 1);
        displayForTeamA(scoreTeamA);
    }

    /**
     * Buttons Team B.
     */
    public void addThreeForTeamB(View v) {
        scoreTeamB = (scoreTeamB + 3);
        displayForTeamB(scoreTeamB);
    }

    public void addTwoForTeamB(View v) {
        scoreTeamB = (scoreTeamB + 2);
        displayForTeamB(scoreTeamB);
    }

    public void addOneForTeamB(View v) {
        scoreTeamB = (scoreTeamB + 1);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Reset Button.
     */
    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamA);
    }


    /**
     * Method Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Method Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


}