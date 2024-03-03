import android.Manifest;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;


import androidx.core.app.ActivityCompat;


public class LocationService implements LocationListener {
   private LocationManager locationManager;
   private Context context;


   public LocationService(Context context) {
       this.context = context;
       locationManager = (LocationManager) context.getSystemService(Context.LOCATION_SERVICE);
   }


   public void startLocationUpdates() {
       if (ActivityCompat.checkSelfPermission(context, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED
               && ActivityCompat.checkSelfPermission(context, Manifest.permission.ACCESS_COARSE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
           // Handle permission not granted
           return;
       }
       locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 0, 0, this);
   }


   public void stopLocationUpdates() {
       locationManager.removeUpdates(this);
   }


   @Override
   public void onLocationChanged(Location location) {
       // Handle location updates
   }


   @Override
   public void onStatusChanged(String provider, int status, Bundle extras) {
       // Handle status changes
   }


   @Override
   public void onProviderEnabled(String provider) {
       // Handle provider enabled
   }


   @Override
   public void onProviderDisabled(String provider) {
       // Handle provider disabled
   }
}
