package com.example.android.guidetodc;

/**
 * {@link Place} represents the various locations visitors to DC can check out
 */

public class Place {

    /**
     * Resource ID for place image
     */
    private int mImageResourceId;

    /**
     * Name of place
     */
    private int mName;

    /**
     * Address
     */
    private int mAddress;

    /**
     * Contact information
     */
    private int mTelephone;

    /**
     * Web address
     */
    private int mWeb;

    /**
     * Constructs a new place with initial values for the following
     * @param imageResourceId
     * @param name
     * @param address
     * @param telephone
     * @param web
     */
    public Place(int imageResourceId, int name, int address, int telephone, int web) {
        mImageResourceId = imageResourceId;
        mName = name;
        mAddress = address;
        mTelephone = telephone;
        mWeb = web;
    }

    /**
     * Returns place image
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Returns place name
     */
    public int getName() {
        return mName;
    }

    /**
     * Returns place address
     */
    public int getAddress() {
        return mAddress;
    }

    /**
     * Returns telephone number
     */
    public int getTelephone() {
        return mTelephone;
    }

    /**
     * Returns web address
     */
    public int getWeb() {
        return mWeb;
    }
}
