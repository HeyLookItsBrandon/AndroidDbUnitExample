package test.database.provider;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseHelper extends SQLiteOpenHelper {
	private static final int SCHEMA_VERSION = 1;


	public DatabaseHelper(Context context) {
		super(context, "widget.sqlite", null, SCHEMA_VERSION);
	}

	public void onCreate(SQLiteDatabase database) {
		database.execSQL("CREATE TABLE widget(_id INTEGER, name TEXT)");
	}

	public void onUpgrade(SQLiteDatabase database, int oldVersion, int newVersion) {
		upgradeDatabase(database);
	}

	public void upgradeDatabase(SQLiteDatabase database) {
		database.execSQL("CREATE TABLE IF NOT EXISTS some_new_table(_id INTEGER NOT NULL)");
	}
}


