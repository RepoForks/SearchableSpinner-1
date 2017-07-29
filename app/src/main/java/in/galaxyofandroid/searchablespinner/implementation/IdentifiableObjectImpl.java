package in.galaxyofandroid.searchablespinner.implementation;

import android.support.annotation.DrawableRes;

import in.galaxyofandroid.spinerdialog.IdentifiableObject;

/**
 * Created by abdulmujibaliu on 7/29/17.
 */

public class IdentifiableObjectImpl implements IdentifiableObject {

    protected String title, subtitle;
    protected int identifier;
    protected int recourseId = 0;

    public IdentifiableObjectImpl(){

    }

    public IdentifiableObjectImpl(String title, String subTitle, int identifier, @DrawableRes int recourseId) {
        this.title = title;
        this.subtitle = subTitle;
        this.identifier = identifier;
        this.recourseId = recourseId;
    }


    @Override
    public String getSubtitle() {
        return subtitle;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public int getIdentifier() {
        return identifier;
    }

    @Override
    public int getRecourseId() {
        return recourseId;
    }
}
