package test.database.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;

public class WidgetContentProvider extends ContentProvider {
	public boolean onCreate() {
		return false;
	}


	public Uri insert(Uri uri, ContentValues values) {
		return null;
	}

	public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
		return null;
	}

	public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
		return 0;
	}

	public int delete(Uri uri, String selection, String[] selectionArgs) {
		return 0;
	}


	public String getType(Uri uri) {
		return null;
	}
}


