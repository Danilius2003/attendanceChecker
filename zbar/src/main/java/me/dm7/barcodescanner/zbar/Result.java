package me.dm7.barcodescanner.zbar;

public class Result {
    private String mContents;
    private BarcodeFormat mBarcodeFormat;

    public BarcodeFormat getBarcodeFormat() {
        return mBarcodeFormat;
    }

    public void setBarcodeFormat(BarcodeFormat format) {
        mBarcodeFormat = format;
    }

    public String getContents() {
        return mContents;
    }

    public void setContents(String contents) {
        mContents = contents;
    }
}