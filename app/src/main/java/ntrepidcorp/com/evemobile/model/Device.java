package ntrepidcorp.com.evemobile.model;

import java.io.Serializable;

/**
 * Created by waleed.basheer on 10/22/2014.
 */
public class Device implements Serializable {

    private long deviceId;
    private int icon;

    private boolean isSelected = false;

    public Device(long deviceId) {

        this.deviceId = deviceId;
    }

    public void setDeviceId(long deviceId) {
        this.deviceId = deviceId;
    }

    public void setIcon(int iconId) {
        this.icon = iconId;
    }

    public void setSelected(boolean selected) {
        this.isSelected = selected;
    }

    public long getDeviceId() {
        return deviceId;
    }

    public int getIcon() {
        return icon;
    }

    public boolean isSelected() {
        return isSelected;
    }
}
