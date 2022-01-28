package com.example.affirmations.data;

import com.example.affirmations.R;
import com.example.affirmations.model.Affirmation;

import java.util.List;

public class Datasource {
    public static List<Affirmation> LoadAffirmations(){
        return List.of(
            new Affirmation(R.string.affirmation1),
            new Affirmation(R.string.affirmation2),
            new Affirmation(R.string.affirmation3),
            new Affirmation(R.string.affirmation4),
            new Affirmation(R.string.affirmation5),
            new Affirmation(R.string.affirmation6),
            new Affirmation(R.string.affirmation7),
            new Affirmation(R.string.affirmation8),
            new Affirmation(R.string.affirmation9),
            new Affirmation(R.string.affirmation10)
        );
    }

}
