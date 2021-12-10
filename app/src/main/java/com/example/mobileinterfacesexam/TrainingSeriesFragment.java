package com.example.mobileinterfacesexam;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.fragment.app.ListFragment;

import java.util.ArrayList;

public class TrainingSeriesFragment extends ListFragment {
	private ListView listview;
	private ArrayList<String> entrenaments;

	static interface Listener {
		void itemClicked(long id);
	};
	public TrainingSeriesFragment() {
	}

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

	}
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,Bundle savedInstanceState) {
		listview = (ListView) getView().findViewById(R.id.listview);
		entrenaments = new ArrayList<String>();
		entrenaments.add("Extremitats a Tope");
		entrenaments.add("Agonia Màxima");
		entrenaments.add("Entrenament especial");
		entrenaments.add("Força i longitud");

		ArrayAdapter<String> adapter = new ArrayAdapter<String>(inflater.getContext(), android.R.layout.simple_list_item_1, entrenaments);
		listview.setAdapter(adapter);
		return inflater.inflate(R.layout.training, container, false);
	}

	@Override
	public void onListItemClick(ListView listView, View view, int position, long id) {

	}
}
