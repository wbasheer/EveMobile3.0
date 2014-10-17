package ntrepidcorp.com.evemobile;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

class EVEOptionsAdapter extends BaseAdapter {

	private Context mContext;
	private String[] mTitles;
    private String[] mCaptions;
	private TypedArray mIcons;


	/** CONSTRUCTOR */
    public EVEOptionsAdapter(Context context) {
        mContext = context;

        Resources mres = mContext.getResources();
        mTitles = mres.getStringArray(R.array.feature_drawer_items);
        mCaptions = mres.getStringArray(R.array.feature_drawer_captions);
        mIcons = mres.obtainTypedArray(R.array.feature_drawer_icons);
    }


		@Override
		public View getView(final int position, View convertView, ViewGroup parent) {

			RelativeLayout tvisOptionsView;
			ImageView iconImageView;
			TextView titleTextView;
			TextView descriptionTextView;

			if (convertView == null) {
				tvisOptionsView = (RelativeLayout) LayoutInflater.from(mContext).inflate(R.layout.feature_drawer_layout, null);
			} else {
				tvisOptionsView = (RelativeLayout) convertView;
			}
			iconImageView = (ImageView) tvisOptionsView.findViewById(R.id.feature_drawer_item_icon);
			titleTextView = (TextView) tvisOptionsView.findViewById(R.id.feature_drawer_item_title);
			descriptionTextView = (TextView) tvisOptionsView.findViewById(R.id.feature_drawer_item_caption);	


			iconImageView.setImageDrawable(mIcons.getDrawable(position));		
			titleTextView.setText(mTitles[position]);
			descriptionTextView.setText(mCaptions[position]);			

			return tvisOptionsView;
		}



		@Override
		public int getCount() {
			return mTitles.length;
		}


		@Override
		public Object getItem(int position) {
			return position;
		}


		@Override
		public long getItemId(int position) {
			return position;
		}

	}