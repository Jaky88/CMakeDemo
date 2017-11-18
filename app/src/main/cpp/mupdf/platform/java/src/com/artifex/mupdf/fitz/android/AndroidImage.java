package mupdf.platform.java.src.com.artifex.mupdf.fitz.android;

import android.graphics.Bitmap;

import com.artifex.mupdf.fitz.Image;

public final class AndroidImage extends Image
{
	private native long newAndroidImageFromBitmap(Bitmap bitmap, long mask);

	public AndroidImage(Bitmap bitmap, AndroidImage mask)
	{
		super(0);
		pointer = newAndroidImageFromBitmap(bitmap, mask.pointer);
	}
}
