package com.dgaf.happyhour.View;

/**
 * Created by trentonrobison on 4/26/15.
 */

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;

import com.dgaf.happyhour.Model.DealListAdapter;
import com.dgaf.happyhour.Model.DealModel;
import com.dgaf.happyhour.R;

import java.util.ArrayList;
import java.util.List;

/*This is the fragment that our page view loads*/
public class DealListFragment extends Fragment {
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    private static final String QUERY_DECISION = "query";
    /**
     * Returns a new instance of this fragment for the given section
     * number.
     */
    //private int  querySearchNumber;


    //section ID acts like ID for the query search as well
    public static DealListFragment newInstance(int sectionNumber,int query) {
        DealListFragment fragment = new DealListFragment();
        Bundle args = new Bundle();
        args.putInt(QUERY_DECISION, query);
        fragment.setArguments(args);

        return fragment;
    }

    public DealListFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.feature_food_drink, container, false);

        TextView tv = (TextView) rootView.findViewById(R.id.textView);
        int querySearch = this.getArguments().getInt(QUERY_DECISION);

        tv.setText("I am going to query "+(querySearch));

        ListView listView = (ListView) rootView.findViewById(R.id.listView);

        List<DealModel> list = new ArrayList<DealModel>();



        list.add(new DealModel("1234",20,10,0,1,2,"R1","wdkmlewdklm","LLAma bistro","edkkde",new String[4]));
        list.add(new DealModel("1234",20,10,0,1,2,"R1","wdkmlewdklm","LLAma bistro","edkkde",new String[4]));
        list.add(new DealModel("1234",20,10,0,1,2,"R1","wdkmlewdklm","LLAma bistro","edkkde",new String[4]));
        list.add(new DealModel("1234",20,10,0,1,2,"R1","wdkmlewdklm","LLAma bistro","edkkde",new String[4]));
        list.add(new DealModel("1234",20,10,0,1,2,"R1","wdkmlewdklm","LLAma bistro","edkkde",new String[4]));
        list.add(new DealModel("1234",20,10,0,1,2,"R1","wdkmlewdklm","LLAma bistro","edkkde",new String[4]));
        list.add(new DealModel("1234",20,10,0,1,2,"R1","wdkmlewdklm","LLAma bistro","edkkde",new String[4]));
        list.add(new DealModel("1234",20,10,0,1,2,"R1","wdkmlewdklm","LLAma bistro","edkkde",new String[4]));
        list.add(new DealModel("1234",20,10,0,1,2,"R1","wdkmlewdklm","LLAma bistro","edkkde",new String[4]));
        list.add(new DealModel("1234",20,10,0,1,2,"R1","wdkmlewdklm","LLAma bistro","edkkde",new String[4]));
        list.add(new DealModel("1234",20,10,0,1,2,"R1","wdkmlewdklm","LLAma bistro","edkkde",new String[4]));
        list.add(new DealModel("1234",20,10,0,1,2,"R1","wdkmlewdklm","LLAma bistro","edkkde",new String[4]));
        list.add(new DealModel("1234",20,10,0,1,2,"R1","wdkmlewdklm","LLAma bistro","edkkde",new String[4]));
        list.add(new DealModel("1234",20,10,0,1,2,"R1","wdkmlewdklm","LLAma bistro","edkkde",new String[4]));

        listView.setAdapter(new DealListAdapter(getActivity(),list));


        return rootView;
    }
}
