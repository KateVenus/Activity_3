package com.venus.activity_2.data

import com.venus.activity_2.R
import com.venus.activity_2.model.Affirmation

class Datasource {

    fun loadAffirmations(): List<Affirmation> {
        return listOf(
            Affirmation(
                R.string.affirmation1,
                R.drawable.kate_image1
            ),
            Affirmation(
                R.string.affirmation2,
                R.drawable.kate_image2
            ),
            Affirmation(
                R.string.affirmation3,
                R.drawable.kate_image3
            ),
            Affirmation(
                R.string.affirmation4,
                R.drawable.kate_image4
            )
        )
    }
}