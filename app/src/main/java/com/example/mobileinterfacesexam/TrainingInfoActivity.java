package com.example.mobileinterfacesexam;
import androidx.fragment.app.ListFragment;

class TrainingInfoFragment extends ListFragment {

    static interface Listener {
        void itemClicked(long id);
    };
}

