# ismartToast
Dynamic Custom Toast
 To use add this in your project gradle
 
       maven { url 'https://jitpack.io' }
       
       
and add this gradle in app gradle


    implementation 'com.github.balubharath:ismartToast:1.0.1'

Where ever you want to show ismarttoast call like this.
    IsmartToast ismartToast  =  new IsmartToast();
        ismartToast.show(MainActivity.this,"hello",true,getResources().getColor(R.color.colorAccent),getResources().getColor(R.color.colorPrimaryDark),getResources().getDrawable(R.drawable.ic_check_circle_black_24dp));

         
