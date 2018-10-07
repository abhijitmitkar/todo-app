package com.abhijitmitkar.todo.home;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.abhijitmitkar.todo.R;

public class HomeActivity extends AppCompatActivity implements HomeContract.View {

    private HomeContract.Presenter homePresenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        new HomePresenter(this);
    }


    @Override
    public void setPresenter(HomeContract.Presenter presenter) {
        homePresenter = presenter;
    }

    @Override
    public void populateTasks() {

    }

    @Override
    public void refreshTasks() {

    }

    @Override
    public void notifyUser(String message) {

    }
}
