package udacity.pokemon;

import android.graphics.Bitmap;

public class Pokemon {

    private String mName;
    private String mId;
    private String mCandy;
    private String mType;
    private Bitmap mImage;

    public Pokemon(String name, String id, String candy, String type) {
        this.mName = name;
        this.mId = id;
        this.mCandy = candy;
        this.mType = type;
    }

    public Pokemon(String name, String id, String candy, String type, Bitmap image) {
        this.mName = name;
        this.mId = id;
        this.mCandy = candy;
        this.mType = type;
        this.mImage = image;
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

    public String getmType() { return mType; }

    public Bitmap getmImage() {
        return mImage;
    }
}
