package ntrepidcorp.com.evemobile;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import ntrepidcorp.com.evemobile.model.Device;

/**
 * Created by waleed.basheer on 10/22/2014.
 */
public class LegendListAdapter extends ArrayAdapter {

    Context context;
    List<Device> deviceList;

    LegendListAdapter(Context context, List<Device> deviceList) {
        super(context, R.layout.legend_item_layout, deviceList);
        this.context = context;
        this.deviceList = deviceList;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater) context
                    .getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.legend_item_layout, null);
        }

        ImageView imgIcon = (ImageView) convertView.findViewById(R.id.deviceIconImageView);
        TextView deviceIdTextView = (TextView) convertView.findViewById(R.id.deviceIdTextView);

        Device device = deviceList.get(position);

        // setting the image resource and title
        deviceIdTextView.setText(Long.toString(device.getDeviceId()));

        if(device.isSelected()) {

        }
        imgIcon.setImageResource(R.drawable.ic_launcher);


        return convertView;

    }
}
