package com.example.android.footballscores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreCounterGoalTeamA = 0;
    int scoreCounterFoulTeamA = 0;
    int scoreCounterYellowTeamA = 0;
    int scoreCounterRedTeamA = 0;

    int scoreCounterGoalTeamB = 0;
    int scoreCounterFoulTeamB = 0;
    int scoreCounterYellowTeamB = 0;
    int scoreCounterRedTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /**
     *
     * button to add one goal in team A
     */
    public void btn_goal_team_A (View view) {

        scoreCounterGoalTeamA++;
        goalTeamA(scoreCounterGoalTeamA);

    }

    /**
     *
     * button to add one foul in team A
     */
    public void btn_foul_team_A (View view) {

        scoreCounterFoulTeamA++;
        foulTeamA(scoreCounterFoulTeamA);

    }

    /**
     *
     * button to add one yellow card in team A
     */
    public void btn_yellow_team_A (View view) {

        scoreCounterYellowTeamA++;
        yellowTeamA(scoreCounterYellowTeamA);

    }

    /**
     *
     * button to add one red card in team A
     */
    public void btn_red_team_A (View view) {

        scoreCounterRedTeamA++;
        redTeamA(scoreCounterRedTeamA);

    }

    /**
     *
     * button to add one goal in team B
     */

    public void btn_goal_team_B (View view) {

        scoreCounterGoalTeamB++;
        goalTeamB(scoreCounterGoalTeamB);

    }

    /**
     *
     * button to add one foul in team B
     */
    public void btn_foul_team_B (View view) {

        scoreCounterFoulTeamB++;
        foulTeamB(scoreCounterFoulTeamB);

    }

    /**
     *
     * button to add one yellow card in team B
     */
    public void btn_yellow_team_B (View view) {

        scoreCounterYellowTeamB++;
        yellowTeamB(scoreCounterYellowTeamB);

    }

    /**
     *
     * button to add one red card in team B
     */
    public void btn_red_team_B (View view) {

        scoreCounterRedTeamB++;
        redTeamB(scoreCounterRedTeamB);

    }

    /**
     *
     * button to reset all text fields to Zero
     */
    public void btn_reset (View view) {

        scoreCounterGoalTeamA = 0;
        goalTeamA(scoreCounterGoalTeamA);

        scoreCounterFoulTeamA = 0;
        foulTeamA(scoreCounterFoulTeamA);

        scoreCounterYellowTeamA = 0;
        yellowTeamA(scoreCounterYellowTeamA);

        scoreCounterRedTeamA = 0;
        redTeamA(scoreCounterRedTeamA);

        scoreCounterGoalTeamB = 0;
        goalTeamB(scoreCounterGoalTeamB);

        scoreCounterFoulTeamB = 0;
        foulTeamB(scoreCounterFoulTeamB);

        scoreCounterYellowTeamB = 0;
        yellowTeamB(scoreCounterYellowTeamB);

        scoreCounterRedTeamB = 0;
        redTeamB(scoreCounterRedTeamB);
    }

    /**
     *
     * Displays the given goals by team A
     */
    private void goalTeamA(int scoreGoal) {

        TextView txtgoalTeamA = (TextView) findViewById(R.id.goals_team_A);
        txtgoalTeamA.setText(String.valueOf(scoreGoal));

    }

    /**
     *
     * Displays the given fouls by team A
     */
    private void foulTeamA (int scoreFoul) {

        TextView txtFoulTeamA = (TextView) findViewById(R.id.fouls_team_A);
        txtFoulTeamA.setText(String.valueOf(scoreFoul));
    }

    /**
     *
     * Displays the given yellow cards by team A
     */
    private void yellowTeamA (int scoreYellow) {

        TextView txtYellowTeamA = (TextView) findViewById(R.id.yellow_team_A);
        txtYellowTeamA.setText(String.valueOf(scoreYellow));
    }

    /**
     *
     * Displays the given red cards by team A
     */
    private void redTeamA (int scoreRed) {

        TextView txtRedTeamA = (TextView) findViewById(R.id.red_team_A);
        txtRedTeamA.setText(String.valueOf(scoreRed));
    }

    /**
     *
     * Displays the given goals by team B
     */
    private void goalTeamB(int scoreGoal) {

        TextView txtgoalTeamB = (TextView) findViewById(R.id.goals_team_B);
        txtgoalTeamB.setText(String.valueOf(scoreGoal));

    }

    /**
     *
     * Displays the given fouls by team B
     */
    private void foulTeamB (int scoreFoul) {

        TextView txtFoulTeamB = (TextView) findViewById(R.id.fouls_team_B);
        txtFoulTeamB.setText(String.valueOf(scoreFoul));
    }

    /**
     *
     * Displays the given yellow cards by team B
     */
    private void yellowTeamB (int scoreYellow) {

        TextView txtYellowTeamB = (TextView) findViewById(R.id.yellow_team_B);
        txtYellowTeamB.setText(String.valueOf(scoreYellow));
    }

    /**
     *
     * Displays the given red cards by team B
     */
    private void redTeamB (int scoreRed) {

        TextView txtRedTeamB = (TextView) findViewById(R.id.red_team_B);
        txtRedTeamB.setText(String.valueOf(scoreRed));
    }
}
