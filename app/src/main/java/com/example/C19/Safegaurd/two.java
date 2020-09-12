package com.example.C19.Safegaurd;


import androidx.fragment.app.FragmentActivity;
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



public class two extends FragmentActivity implements OnMapReadyCallback {
    GoogleMap map;
    SupportMapFragment mapFragment;
    SearchView searchView;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_two);

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
                    Geocoder geocoder = new Geocoder(two.this);
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
        LatLng latLng = new LatLng(12.930155,80.131279);
        MarkerOptions markerOptions = new MarkerOptions().position(latLng)
                .title("You are here");
        googleMap.animateCamera(CameraUpdateFactory.newLatLng(latLng));
        googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng,18));
        googleMap.addMarker(markerOptions);



        LatLng a1 = new LatLng(13.012692, 80.217632);
        googleMap.addMarker(new MarkerOptions()
                .position(a1)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
                .title("King Institute of Preventive Medicine & Research, Chennai"));
        LatLng a2 = new LatLng(13.080275, 80.272228);
        googleMap.addMarker(new MarkerOptions()
                .position(a2)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
                .title("Madras Medical College, Chennai"));
        LatLng a3 = new LatLng(13.106532, 80.286652);
        googleMap.addMarker(new MarkerOptions()
                .position(a3)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
                .title("Stanley Medical College, Chennai"));
        LatLng a4 = new LatLng(13.078594, 80.243901);
        googleMap.addMarker(new MarkerOptions()
                .position(a4)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
                .title("Govt. Kilpauk Medical College,Chennai"));
        LatLng a5 = new LatLng(13.073469, 80.249611);
        googleMap.addMarker(new MarkerOptions()
                .position(a5)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
                .title("ICMR-National Institute for Research in Tuberculosis, Chennai"));
        LatLng a6 = new LatLng(13.046566, 80.249129);
        googleMap.addMarker(new MarkerOptions()
                .position(a6)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
                .title("State Public Health Laboratory, Chennai"));
        LatLng a7 = new LatLng(13.100875, 80.139803);
        googleMap.addMarker(new MarkerOptions()
                .position(a7)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
                .title("ICMR-National Institute of Epidemiology, Chennai"));
        LatLng a8 = new LatLng(13.010213, 80.218179);
        googleMap.addMarker(new MarkerOptions()
                .position(a8)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
                .title("Dr. MGR Medical University, Chennai"));
        LatLng a9 = new LatLng(12.980388, 80.244672);
        googleMap.addMarker(new MarkerOptions()
                .position(a9)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
                .title("Dr. ALM PG Institute of Basic Medical Sciences, Chennai"));
        LatLng a10 = new LatLng(13.067630, 80.275068);
        googleMap.addMarker(new MarkerOptions()
                .position(a10)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
                .title("Govt. Medical College & Hospital, Omandurar Govt. Estate, Chennai"));
        LatLng a11 = new LatLng(10.006689, 77.554316);
        googleMap.addMarker(new MarkerOptions()
                .position(a11)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
                .title("Govt. Theni Medical College,Theni"));
        LatLng a12 = new LatLng(8.711995, 77.750795);
        googleMap.addMarker(new MarkerOptions()
                .position(a12)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
                .title("Tirunelveli Medical College,Tirunelveli"));
        LatLng a13 = new LatLng(10.775769, 79.605162);
        googleMap.addMarker(new MarkerOptions()
                .position(a13)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
                .title("Govt. Medical College, Thiruvarur"));
        LatLng a14 = new LatLng(11.655713, 78.152299);
        googleMap.addMarker(new MarkerOptions()
                .position(a14)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
                .title("Kumar Mangalam Govt. Medical College,Salem"));
        LatLng a15 = new LatLng(11.028952, 77.023914);
        googleMap.addMarker(new MarkerOptions()
                .position(a15)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
                .title("Coimbatore Medical College, Coimbatore"));
        LatLng a16 = new LatLng(11.009355, 77.024149);
        googleMap.addMarker(new MarkerOptions()
                .position(a16)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
                .title("Govt. Medical College & ESIC Hospital,Coimbatore"));
        LatLng a17 = new LatLng(11.993315, 79.517438);
        googleMap.addMarker(new MarkerOptions()
                .position(a17)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
                .title("Govt. Medical College, Villupuram"));
        LatLng a18 = new LatLng(9.927685, 78.136903);
        googleMap.addMarker(new MarkerOptions()
                .position(a18)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
                .title("Madurai Medical College, Madurai"));
        LatLng a19 = new LatLng(10.797851, 78.679364);
        googleMap.addMarker(new MarkerOptions()
                .position(a19)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
                .title("K A P Viswanatham Govt. Medical College,Trichy"));
        LatLng a20 = new LatLng(11.282621, 77.566135);
        googleMap.addMarker(new MarkerOptions()
                .position(a20)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
                .title("Perundurai Medical College, Perundurai"));
        LatLng a21 = new LatLng(12.123398, 78.157961);
        googleMap.addMarker(new MarkerOptions()
                .position(a21)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
                .title("Govt. Dharmapuri Medical College,Dharmapuri"));
        LatLng a22 = new LatLng(12.845496, 79.137049);
        googleMap.addMarker(new MarkerOptions()
                .position(a22)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
                .title("Govt. Medical College, Vellore"));
        LatLng a23 = new LatLng(10.758746, 79.106572);
        googleMap.addMarker(new MarkerOptions()
                .position(a23)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
                .title("Thanjavur Medical College, Thanjavur"));
        LatLng a24 = new LatLng(8.174310, 77.396017);
        googleMap.addMarker(new MarkerOptions()
                .position(a24)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
                .title("Kanyakumari Govt. Medical College, Nagercoil"));
        LatLng a25 = new LatLng(8.789239, 78.120476);
        googleMap.addMarker(new MarkerOptions()
                .position(a25)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
                .title("Govt. Thoothukudi Medical College, Thoothukudi"));
        LatLng a26 = new LatLng(12.754926, 77.817217);
        googleMap.addMarker(new MarkerOptions()
                .position(a26)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
                .title("Institute of Vector Control & Zoonoses,Hosur"));
        LatLng a27 = new LatLng(11.355173, 76.802017);
        googleMap.addMarker(new MarkerOptions()
                .position(a27)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
                .title("Pasteur Institute of India, Coonoor"));
        LatLng a28 = new LatLng(11.395510, 79.716089);
        googleMap.addMarker(new MarkerOptions()
                .position(a28)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
                .title("Rajah Muthiah Medical College,Chidambaram"));
        LatLng a29 = new LatLng(10.955712, 78.101259);
        googleMap.addMarker(new MarkerOptions()
                .position(a29)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
                .title("Govt. Medical College, Karur"));
        LatLng a30 = new LatLng(12.274548, 79.079014);
        googleMap.addMarker(new MarkerOptions()
                .position(a30)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
                .title("Govt. Tiruvannamalai Medical College & Hospital, Tiruvannamalai"));
        LatLng a31 = new LatLng(12.677827, 79.980321);
        googleMap.addMarker(new MarkerOptions()
                .position(a31)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
                .title("Chengalpattu Govt. Medical College,Kancheepuram"));
        LatLng a32 = new LatLng(10.409411, 78.847232);
        googleMap.addMarker(new MarkerOptions()
                .position(a32)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
                .title("Govt. Medical College and Hospital,Pudukkottai"));
        LatLng a33 = new LatLng(9.841273, 78.477649);
        googleMap.addMarker(new MarkerOptions()
                .position(a33)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
                .title("Govt. Shivagangai Medical College,Shivagangai"));
        LatLng a34 = new LatLng(9.588610, 77.961845);
        googleMap.addMarker(new MarkerOptions()
                .position(a34)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
                .title("Govt. District Headquarters Hospital,Virrudhu Nagar"));
        LatLng a35 = new LatLng(9.364434, 78.832113);
        googleMap.addMarker(new MarkerOptions()
                .position(a35)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
                .title("Govt. District Headquarters Hospital,Ramanathapuram"));
        LatLng a36 = new LatLng(11.143394, 79.069770);
        googleMap.addMarker(new MarkerOptions()
                .position(a36)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
                .title("Govt. District Headquarters Hospital,Ariyalur"));
        LatLng a37 = new LatLng(11.100078, 77.350242);
        googleMap.addMarker(new MarkerOptions()
                .position(a37)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
                .title("Govt. District Headquarters Hospital,Tiruppur"));
        LatLng a38 = new LatLng(11.737391, 78.959354);
        googleMap.addMarker(new MarkerOptions()
                .position(a38)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
                .title("Govt. Kallakruichi Hospital, Kallakurichi"));
        LatLng a39 = new LatLng(13.127809, 79.910364);
        googleMap.addMarker(new MarkerOptions()
                .position(a39)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
                .title("Govt. District Headquarters Hospital,Tiruvallur"));
        LatLng a40 = new LatLng(11.216998, 78.168525);
        googleMap.addMarker(new MarkerOptions()
                .position(a40)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
                .title("Govt. District Headquarters Hospital,Namakkal"));
        LatLng a41 = new LatLng(13.008621, 80.243613);
        googleMap.addMarker(new MarkerOptions()
                .position(a41)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
                .title("Central Leather Research Institute,Adyar, Chennai"));
        LatLng a42 = new LatLng(10.364115, 77.976353);
        googleMap.addMarker(new MarkerOptions()
                .position(a42)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
                .title("Government Headquarters Hospital,Dindigul"));
        LatLng a43 = new LatLng(13.137855, 80.293946);
        googleMap.addMarker(new MarkerOptions()
                .position(a43)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
                .title("C.D Hospital, Greater ChennaiCorporation, Chennai"));
        LatLng a44 = new LatLng(10.772705, 79.843626);
        googleMap.addMarker(new MarkerOptions()
                .position(a44)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
                .title("Government District Head QuartersHospital, Nagapattinam"));
        LatLng a45 = new LatLng(12.497017, 78.565950);
        googleMap.addMarker(new MarkerOptions()
                .position(a45)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
                .title("Government Hospital, Tirupattur"));
        LatLng a46 = new LatLng(12.525577, 78.219768);
        googleMap.addMarker(new MarkerOptions()
                .position(a46)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
                .title("Government Head Quarters Hospital, Krishnagiri"));
        LatLng a47 = new LatLng(11.236853, 78.860831);
        googleMap.addMarker(new MarkerOptions()
                .position(a47)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
                .title("District Head Quarters Hospital, Perambalur"));
        LatLng a48 = new LatLng(11.408235, 76.700290);
        googleMap.addMarker(new MarkerOptions()
                .position(a48)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
                .title("Government Head Quarters Hospital,Ooty"));
        LatLng a49 = new LatLng(8.970922, 77.303823);
        googleMap.addMarker(new MarkerOptions()
                .position(a49)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
                .title("Government Head Quarters Hospital, Tenkasi"));
        LatLng a50 = new LatLng(12.925068, 79.357622);
        googleMap.addMarker(new MarkerOptions()
                .position(a50)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
                .title("District Public Health Laboratory, Walajapet"));
        LatLng a51 = new LatLng(12.833223, 79.710245);
        googleMap.addMarker(new MarkerOptions()
                .position(a51)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
                .title("Government Head Quarters Hospital, Kanchipuram"));
        LatLng a52 = new LatLng(11.759495, 79.755265);
        googleMap.addMarker(new MarkerOptions()
                .position(a52)
                .icon(BitmapDescriptorFactory.defaultMarker(BitmapDescriptorFactory.HUE_ORANGE))
                .title("Government Head Quarters Hospital, Cuddalore\n"));
    }
}