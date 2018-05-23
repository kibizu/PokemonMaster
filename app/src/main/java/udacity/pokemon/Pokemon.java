package udacity.pokemon;

import android.graphics.Bitmap;

public class Pokemon {

    private String mName;
    private String mId;
    private String mCandy;
    private Bitmap mImage;

    public Pokemon(String mName, String mId, String mCandy) {
        this.mName = mName;
        this.mId = mId;
        this.mCandy = mCandy;
    }

    public Pokemon(String mName, String mId, String mCandy, Bitmap mImage) {
        this.mName = mName;
        this.mId = mId;
        this.mCandy = mCandy;
        this.mImage = mImage;
    }

    public String getmName() {
        return mName;
    }

    public String getmId() {
        return mId;
    }

    public String getmCandy() {
        return mCandy;
    }

    public Bitmap getmImage() {
        return mImage;
    }
}
