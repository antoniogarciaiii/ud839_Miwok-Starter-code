package com.example.android.miwok;

//{@Link Word} represents a vocabulary word

public class Word {

//    note: we use 'm' before the name because they are private member variables of the class

//    default translation for the word
    private String mDefaultTranslation;

//    Miwok translation for word
    private String mMiwokTranslation;

    //the name (of the constructor?) has to match the class name exactly
    public Word(String defaultTranslation, String miwokTranslation) {
        mDefaultTranslation = defaultTranslation;
        mMiwokTranslation = miwokTranslation;
        }

//        get the default translation of the word
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

//    get the miwok translation of the world
    public String getmMiwokTranslation() {
        return mMiwokTranslation;
    }
}


