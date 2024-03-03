public class MainActivity extends AppCompatActivity {
   private EditText editTextName, editTextAddress;
   private Button buttonSubmit;


   @Override
   protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
       setContentView(R.layout.activity_main);


       editTextName = findViewById(R.id.editTextName);
       editTextAddress = findViewById(R.id.editTextAddress);
       buttonSubmit = findViewById(R.id.buttonSubmit);


       buttonSubmit.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               // Handle submission of free food location
               String name = editTextName.getText().toString();
               String address = editTextAddress.getText().toString();
               // Store location data in database
           }
       });
   }
}
