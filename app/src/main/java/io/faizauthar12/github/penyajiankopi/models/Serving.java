package io.faizauthar12.github.penyajiankopi.models;

import android.os.Parcel;
import android.os.Parcelable;

public class Serving implements Parcelable {
    private String name, detail;
    private int cofee, img, milk, water;

    public Serving() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public int getCofee() {
        return cofee;
    }

    public void setCofee(int cofee) {
        this.cofee = cofee;
    }

    public int getMilk() {
        return milk;
    }

    public void setMilk(int milk) {
        this.milk = milk;
    }

    public int getWater() {
        return water;
    }

    public void setWater(int water) {
        this.water = water;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(name);
        parcel.writeString(detail);
        parcel.writeInt(img);
        parcel.writeInt(cofee);
        parcel.writeInt(milk);
        parcel.writeInt(water);
    }

    protected Serving(Parcel in) {
        name = in.readString();
        detail = in.readString();
        img = in.readInt();
        cofee = in.readInt();
        milk = in.readInt();
        water = in.readInt();
    }

    public static final Creator<Serving> CREATOR = new Creator<Serving>() {
        @Override
        public Serving createFromParcel(Parcel in) {
            return new Serving(in);
        }

        @Override
        public Serving[] newArray(int size) {
            return new Serving[size];
        }
    };
}
