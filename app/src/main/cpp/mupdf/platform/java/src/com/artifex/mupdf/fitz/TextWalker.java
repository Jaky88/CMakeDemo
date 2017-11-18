package mupdf.platform.java.src.com.artifex.mupdf.fitz;

public interface TextWalker
{
	public void showGlyph(Font font, Matrix trm, int glyph, int unicode, boolean wmode);
}
