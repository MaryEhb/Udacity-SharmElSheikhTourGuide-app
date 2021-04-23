package android.example.tourguide;

public class Place {

    private final String mName;
    private final int mImage;
    private final String mDescription;
    private final float mStars;

    public Place(String name,int image, float stars, String description){
        mName = name;
        mImage = image;
        mDescription = description;
        mStars = stars;
    }

    public String getName() {
        return mName;
    }

    public int getImage() {
        return mImage;
    }

    public float getStars(){ return mStars; }

    public String getDescription() {
        return mDescription;
    }

}
