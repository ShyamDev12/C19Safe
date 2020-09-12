package com.example.C19.Safegaurd;

import androidx.appcompat.app.AppCompatActivity;

import android.location.Address;
import android.location.Geocoder;
import android.os.Bundle;
import android.widget.SearchView;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import java.io.IOException;
import java.util.List;

public class five extends AppCompatActivity implements OnMapReadyCallback {
    GoogleMap map;
    SupportMapFragment mapFragment;
    SearchView searchView;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_five);

        searchView = findViewById(R.id.sv_location);
        mapFragment=(SupportMapFragment) getSupportFragmentManager()
                .findFragmentById(R.id.map);
        mapFragment.getMapAsync(this);
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {

                String location = searchView.getQuery().toString();
                List<Address> addressList=null;
                if (location != null || location.length()>0) {
                    Geocoder geocoder = new Geocoder(five.this);
                    try {
                        addressList = geocoder.getFromLocationName(location, 1);

                    } catch (IOException e) {

                        e.printStackTrace();
                    }

                    Address address = addressList.get(0);
                    String locality = address.getLocality();
                    //Toast.makeText(two, locality, Toast.LENGTH_LONG).show();
                    double latitude = address.getLatitude();
                    double longitude = address.getLongitude();
                    /*LatLng latLng = new LatLng(latitude, longitude);
                    map.addMarker(new MarkerOptions()
                            .position(latLng)
                            .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE))
                            .title("Search result"));*/
                    LatLng latLng = new LatLng(latitude, longitude);
                    //MarkerOptions markerOptions = new MarkerOptions().position(latLng)
                    //.title("Search result.");
                    //BitmapDescriptorFactory bd = BitmapDescriptorFactory.HUE_BLUE
                    map.addMarker(new MarkerOptions().position(latLng).icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE)).title("Search Result"));
                    map.animateCamera(CameraUpdateFactory.newLatLng(latLng));
                    //markerOptions.icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_BLUE));

                }

                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                return false;
            }
        });
        mapFragment.getMapAsync(this);

    }


    @Override
    public void onMapReady(GoogleMap googleMap) {
        map = googleMap;
        LatLng latLng = new LatLng(12.930155, 80.131279);
        MarkerOptions markerOptions = new MarkerOptions().position(latLng)
                .title("You are here");
        googleMap.animateCamera(CameraUpdateFactory.newLatLng(latLng));
        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng, 18));
        googleMap.addMarker(markerOptions);


    }

}