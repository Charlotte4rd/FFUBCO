import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;


public class DatabaseHelper extends SQLiteOpenHelper {
   private static final String DATABASE_NAME = "FreeFoodLocations.db";
   private static final int DATABASE_VERSION = 1;


   private static final String TABLE_NAME = "locations";
   private static final String COLUMN_ID = "id";
   private static final String COLUMN_NAME = "name";
   private static final String COLUMN_ADDRESS = "address";


   private static final String SQL_CREATE_ENTRIES =
           "CREATE TABLE " + TABLE_NAME + " (" +
                   COLUMN_ID + " INTEGER PRIMARY KEY," +
                   COLUMN_NAME + " TEXT," +
                   COLUMN_ADDRESS + " TEXT)";


   public DatabaseHelper(Context context) {
       super(context, DATABASE_NAME, null, DATABASE_VERSION);
   }


   @Override
   public void onCreate(SQLiteDatabase db) {
       db.execSQL(SQL_CREATE_ENTRIES);
   }


   @Override
   public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
       // If you need to upgrade the database schema in the future, you can implement it here.
       // This method will be called when the database version is increased.
   }
}

