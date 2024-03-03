public class NotificationService {
   private Context context;


   public NotificationService(Context context) {
       this.context = context;
   }


   public void showNotification(String message) {
       NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "channel_id")
               .setSmallIcon(R.drawable.ic_notification)
               .setContentTitle("Free Food Nearby")
               .setContentText(message)
               .setPriority(NotificationCompat.PRIORITY_DEFAULT);


       NotificationManagerCompat notificationManager = NotificationManagerCompat.from(context);
       notificationManager.notify(1, builder.build());
   }
}
