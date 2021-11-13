package android.example.earth;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {
    private static final String TIME_SEPARATOR = "T";
    String Sdate;
    String Stime;

    public NewsAdapter(Context context, int resource, List<News> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if the existing view is being reused, otherwise inflate the view
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        News currentNews = getItem(position);

        TextView sectionName = listItemView.findViewById(R.id.section_name);
        sectionName.setText(currentNews.getSectionName());

        TextView newsDesc = listItemView.findViewById(R.id.news_desc);

        newsDesc.setText(currentNews.getNewsDesc());

        String time = currentNews.getDate();

        if (time.contains(TIME_SEPARATOR)) {
            String[] parts = time.split(TIME_SEPARATOR);
            Sdate = parts[0];
            Stime = parts[1];
        }


        TextView date = listItemView.findViewById(R.id.date);

        date.setText(Sdate);

        TextView actualTime = listItemView.findViewById(R.id.time);
        actualTime.setText(Stime);

        return listItemView;
    }

}
