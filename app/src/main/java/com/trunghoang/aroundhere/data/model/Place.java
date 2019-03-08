package com.trunghoang.aroundhere.data.model;

import android.os.Parcel;
import android.os.Parcelable;

import org.json.JSONObject;

public class Place implements Parcelable {

    public static final Parcelable.Creator<Place> CREATOR = new Parcelable.Creator<Place>() {

        @Override
        public Place createFromParcel(Parcel source) {
            return new Place(source);
        }

        @Override
        public Place[] newArray(int size) {
            return new Place[0];
        }
    };
    private double mDistance;
    private boolean mIsOpen;
    private String mPhoto;
    private String mTitle;
    private String mAddress;
    private long mPriceMin;
    private long mPriceMax;
    private String mStartTime;
    private String mEndTime;
    private String mResId;
    private String mDetailUrl;
    private boolean mIsFavored;
    private boolean mIsCheckedIn;
    private long mCheckedInTime;

    public Place() {
    }

    public Place(Parcel parcel) {
        mDistance = parcel.readDouble();
        mIsOpen = (parcel.readInt() == 1);
        mPhoto = parcel.readString();
        mTitle = parcel.readString();
        mAddress = parcel.readString();
        mPriceMin = parcel.readLong();
        mPriceMax = parcel.readLong();
        mStartTime = parcel.readString();
        mEndTime = parcel.readString();
        mResId = parcel.readString();
        mDetailUrl = parcel.readString();
        mIsFavored = (parcel.readInt() == 1);
        mIsCheckedIn = (parcel.readInt() == 1);
        mCheckedInTime = parcel.readLong();
    }

    public Place(JSONObject jsonObject) {
        mDistance = jsonObject.optDouble(JSONKey.DISTANCE);
        mIsOpen = jsonObject.optBoolean(JSONKey.OPENING);
        mPhoto = jsonObject.optString(JSONKey.PHOTO);
        mTitle = jsonObject.optString(JSONKey.NAME);
        mAddress = jsonObject.optString(JSONKey.ADDRESS);
        mResId = jsonObject.optString(JSONKey.PLACE_ID);
        mDetailUrl = jsonObject.optString(JSONKey.DETAIL_URL);
    }

    public double getDistance() {
        return mDistance;
    }

    public void setDistance(double distance) {
        mDistance = distance;
    }

    public boolean isOpen() {
        return mIsOpen;
    }

    public void setOpen(boolean open) {
        mIsOpen = open;
    }

    public String getPhoto() {
        return mPhoto;
    }

    public void setPhoto(String photo) {
        mPhoto = photo;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getAddress() {
        return mAddress;
    }

    public void setAddress(String address) {
        mAddress = address;
    }

    public long getPriceMin() {
        return mPriceMin;
    }

    public void setPriceMin(long priceMin) {
        mPriceMin = priceMin;
    }

    public long getPriceMax() {
        return mPriceMax;
    }

    public void setPriceMax(long priceMax) {
        mPriceMax = priceMax;
    }

    public String getStartTime() {
        return mStartTime;
    }

    public void setStartTime(String startTime) {
        mStartTime = startTime;
    }

    public String getEndTime() {
        return mEndTime;
    }

    public void setEndTime(String endTime) {
        mEndTime = endTime;
    }

    public String getResId() {
        return mResId;
    }

    public void setResId(String resId) {
        mResId = resId;
    }

    public String getDetailUrl() {
        return mDetailUrl;
    }

    public void setDetailUrl(String detailUrl) {
        mDetailUrl = detailUrl;
    }

    public boolean isFavored() {
        return mIsFavored;
    }

    public void setFavored(boolean favored) {
        mIsFavored = favored;
    }

    public boolean isCheckedIn() {
        return mIsCheckedIn;
    }

    public void setCheckedIn(boolean checkedIn) {
        mIsCheckedIn = checkedIn;
    }

    public long getCheckedInTime() {
        return mCheckedInTime;
    }

    public void setCheckedInTime(long checkedInTime) {
        mCheckedInTime = checkedInTime;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeDouble(mDistance);
        dest.writeInt(mIsOpen ? 1 : 0);
        dest.writeString(mPhoto);
        dest.writeString(mTitle);
        dest.writeString(mAddress);
        dest.writeLong(mPriceMin);
        dest.writeLong(mPriceMax);
        dest.writeString(mStartTime);
        dest.writeString(mEndTime);
        dest.writeString(mResId);
        dest.writeString(mDetailUrl);
        dest.writeInt(mIsFavored ? 1 : 0);
        dest.writeInt(mIsCheckedIn ? 1 : 0);
        dest.writeLong(mCheckedInTime);
    }

    public static class Builder {
        private double mDistance;
        private boolean mIsOpen;
        private String mPhoto;
        private String mTitle;
        private String mAddress;
        private long mPriceMin;
        private long mPriceMax;
        private String mStartTime;
        private String mEndTime;
        private String mResId;
        private String mDetailUrl;
        private boolean mIsFavored;
        private boolean mIsCheckedIn;
        private long mCheckedInTime;

        public Builder() {
        }

        public Builder setDistance(double distance) {
            mDistance = distance;
            return this;
        }

        public Builder setOpen(boolean open) {
            mIsOpen = open;
            return this;
        }

        public Builder setPhoto(String photo) {
            mPhoto = photo;
            return this;
        }

        public Builder setTitle(String title) {
            mTitle = title;
            return this;
        }

        public Builder setAddress(String address) {
            mAddress = address;
            return this;
        }

        public Builder setPriceMin(long priceMin) {
            mPriceMin = priceMin;
            return this;
        }

        public Builder setPriceMax(long priceMax) {
            mPriceMax = priceMax;
            return this;
        }

        public Builder setStartTime(String startTime) {
            mStartTime = startTime;
            return this;
        }

        public Builder setEndTime(String endTime) {
            mEndTime = endTime;
            return this;
        }

        public Builder setResId(String resId) {
            mResId = resId;
            return this;
        }

        public Builder setDetailUrl(String detailUrl) {
            mDetailUrl = detailUrl;
            return this;
        }

        public Builder setFavored(boolean favored) {
            mIsFavored = favored;
            return this;
        }

        public Builder setCheckedIn(boolean checkedIn) {
            mIsCheckedIn = checkedIn;
            return this;
        }

        public Builder setCheckedInTime(long checkedInTime) {
            mCheckedInTime = checkedInTime;
            return this;
        }

        public Place build() {
            Place place = new Place();
            place.setDistance(mDistance);
            place.setOpen(mIsOpen);
            place.setPhoto(mPhoto);
            place.setTitle(mTitle);
            place.setAddress(mAddress);
            place.setPriceMin(mPriceMin);
            place.setPriceMax(mPriceMax);
            place.setStartTime(mStartTime);
            place.setEndTime(mEndTime);
            place.setResId(mResId);
            place.setDetailUrl(mDetailUrl);
            place.setFavored(mIsFavored);
            place.setCheckedIn(mIsCheckedIn);
            place.setCheckedInTime(mCheckedInTime);
            return place;
        }
    }

    public interface JSONKey {
        String DISTANCE = "Distance";
        String OPENING = "IsOpening";
        String PHOTO = "MobilePicturePath";
        String NAME = "Name";
        String ADDRESS = "Address";
        String ITEMS = "searchItems";
        String DETAIL_URL = "DetailUrl";
        String PLACE_ID = "Id";
        String PRICE_MIN = "PriceMin";
        String PRICE_MAX = "PriceMax";
        String TIME_RANGES = "TimeRanges";
        String TIME_START = "StartTime";
        String TIME_END = "EndTime";
        String RES_ID = "RestaurantID";
    }
}
