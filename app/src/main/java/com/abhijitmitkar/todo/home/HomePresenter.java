package com.abhijitmitkar.todo.home;

public class HomePresenter implements HomeContract.Presenter {

    private final HomeContract.View view;

    HomePresenter(HomeContract.View view) {

        this.view = view;
        this.view.setPresenter(this);
    }

    @Override
    public void fetchTasks() {

    }

    @Override
    public void addTask() {

    }

    @Override
    public void deleteTask() {

    }

    @Override
    public void markDone(boolean isDone) {

    }

    @Override
    public void openTaskDetail(String taskId) {

    }
}
