package cool.app.team.cs246.slidetabs;


import android.os.Bundle;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class PageFragment extends android.support.v4.app.Fragment {

    TextView textView;

    public PageFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.page_fragment_layout,container,false);

        // initialize the TextView
        textView = (TextView)view.findViewById(R.id.textView);

        // get the arguments
        Bundle bundle = getArguments();

        // message on the bundle
        String message = Integer.toString(bundle.getInt("countKey"));

        textView.setText("This is the " + message + " Swipe View Page.");

        // Inflate the layout for this fragment
        return view;
    }


}
