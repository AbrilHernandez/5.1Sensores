package www.ittepic.edu.sensores;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import java.util.List;

public class MainActivity extends AppCompatActivity{
    private SensorManager sensorManager;
    List<Sensor> sensor;
    private ListView list;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        sensorManager = (SensorManager) this.getSystemService(SENSOR_SERVICE);
        list = (ListView) findViewById(R.id.listView);
        sensor = sensorManager.getSensorList(Sensor.TYPE_ALL);
        list.setAdapter(new ArrayAdapter<Sensor>(this, android.R.layout.simple_list_item_1, sensor));
    }
}
