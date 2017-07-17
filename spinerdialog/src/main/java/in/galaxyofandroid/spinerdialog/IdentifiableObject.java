package in.galaxyofandroid.spinerdialog;

import android.support.annotation.DrawableRes;

/**
 * Created by abdulmujibaliu on 7/16/17.
 */

public class IdentifiableObject {
    private String title, subtitle;
    private int identifier;
    private int recourseId = 0;

    public IdentifiableObject(String title, String subTitle, int identifier, @DrawableRes int recourseId) {
        this.title = title;
        this.subtitle = subTitle;
        this.identifier = identifier;
        this.recourseId = recourseId;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public String getTitle() {
        return title;
    }

    public int getIdentifier() {
        return identifier;
    }

    public int getRecourseId() {
        return recourseId;
    }
}
