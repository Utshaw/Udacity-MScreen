package com.wordpress.farhantanvirutshaw.abc;

/**
 * Created by utshaw on 4/14/17.
 */

public class Word {

    /** Default translation for the word */
    private String mDefaultTranslation;

    /** Miwok translation for the word */
    private String mMiwokTranslation;

    /** Image resource ID for the word */
    private int mImageResourceId = NO_IAMGE_PROVIDED;

    private int mAudioFile;

    private static final int NO_IAMGE_PROVIDED = -1;

    public Word(String mDefaultTranslation, String mMiwokTranslation, int mImageResourceId, int mAudioFile) {
        this.mDefaultTranslation = mDefaultTranslation;
        this.mMiwokTranslation = mMiwokTranslation;
        this.mImageResourceId = mImageResourceId;
        this.mAudioFile = mAudioFile;
    }




    /**
     * Create a new Word object.
     *
     * @param defaultTranslation is the word in a language that the user is already familiar with
     *                           (such as English)
     * @param miwokTranslation is the word in the Miwok language
     */




    public Word(String defaultTranslation, String miwokTranslation,int mAudioFile) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        this.mAudioFile = mAudioFile;
    }



    /**
     * Get the default translation of the word.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getMiwokTranslation() {
        return mMiwokTranslation;
    }

    /**
     * Return the image resource ID of the word.
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    public int getmAudioFile()
    {
        return mAudioFile;
    }

    public boolean hasImage()
    {
        return mImageResourceId != NO_IAMGE_PROVIDED;
    }

}
