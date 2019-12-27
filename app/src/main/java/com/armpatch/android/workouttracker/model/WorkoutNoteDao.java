package com.armpatch.android.workouttracker.model;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import java.util.List;

@Dao
public interface WorkoutNoteDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void insert(WorkoutNote workoutNote);

    @Query("SELECT * from workout_note_table")
    LiveData<List<WorkoutNote>> getWorkoutNotes();

//    @Query("SELECT * from workout_note_table WHERE date = :whereClause")
//    WorkoutNote getWorkoutNote(String whereClause);
}
