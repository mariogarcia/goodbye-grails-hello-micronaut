package hello

import com.agorapulse.dru.Dru
import com.agorapulse.dru.PreparedDataSet
import groovy.transform.CompileStatic

@CompileStatic
class HelloDataSets {

    public static final PreparedDataSet VEHICLES = Dru.prepare {
        from 'vehicles.json', {
            map { to Vehicle }
        }
    }

}