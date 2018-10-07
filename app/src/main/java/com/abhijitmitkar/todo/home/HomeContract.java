package com.abhijitmitkar.todo.home;

import com.abhijitmitkar.todo.common.BasePresenter;
import com.abhijitmitkar.todo.common.BaseView;

public interface HomeContract {

    interface View extends BaseView<Presenter> {

        void populateTasks();
        void refreshTasks();
        void notifyUser(String message);
        
    }

    interface Presenter extends BasePresenter {

        void fetchTasks();
        void addTask();
        void deleteTask();
        void markDone(boolean isDone);
        void openTaskDetail(String taskId);

    }

}
